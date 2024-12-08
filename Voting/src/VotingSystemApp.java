
import java.util.Scanner;

public class VotingSystemApp {

    public static void main(String[] args) {
        VotingSystem votingSystem = new VotingSystem();

        // Adding candidates
        votingSystem.addCandidate(new Candidate("Messi", "Male"));
        votingSystem.addCandidate(new Candidate("Ronaldo", "Male"));

        // Registering voters
        votingSystem.registerVoter(new Voter("Mbappe"));
        votingSystem.registerVoter(new Voter("Camavinga"));

        Scanner scanner = new Scanner(System.in);

        // Voting process
        System.out.println("Voting System");
        for (int i = 0; i < 2; i++) { // Allow two votes for demonstration
            System.out.print("Enter your name: ");
            String voterName = scanner.nextLine();
            System.out.print("Enter candidate name to vote for: ");
            String candidateName = scanner.nextLine();
            votingSystem.castVote(voterName, candidateName);
        }

        // Displaying results
        votingSystem.displayResults();

        scanner.close();
    }
}
