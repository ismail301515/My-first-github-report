
import java.util.ArrayList;
import java.util.List;

public class VotingSystem {

    private List<Candidate> candidates;
    private List<Voter> voters;

    public VotingSystem() {
        candidates = new ArrayList<>();
        voters = new ArrayList<>();
    }

    public void addCandidate(Candidate candidate) {
        candidates.add(candidate);
    }

    public void registerVoter(Voter voter) {
        voters.add(voter);
    }

    public void castVote(String voterName, String candidateName) {
        Voter voter = voters.stream()
                .filter(v -> v.getName().equalsIgnoreCase(voterName))
                .findFirst()
                .orElse(null);

        if (voter == null) {
            System.out.println("Voter not registered!");
            return;
        }

        if (voter.hasVoted()) {
            System.out.println("You have already voted!");
            return;
        }

        Candidate candidate = candidates.stream()
                .filter(c -> c.getName().equalsIgnoreCase(candidateName))
                .findFirst()
                .orElse(null);

        if (candidate == null) {
            System.out.println("Candidate not found!");
            return;
        }

        candidate.addVote();
        voter.markAsVoted();
        System.out.println(voterName + " voted for " + candidateName);
    }

    public void displayResults() {
        System.out.println("\nVoting Results:");
        for (Candidate candidate : candidates) {
            System.out.println(candidate.getName() + " (" + candidate.getGender() + "): " + candidate.getVotes() + " votes");
        }
    }
}
