
public class Candidate {

    private String name;
    private String gender;
    private int votes;

    public Candidate(String name, String gender) {
        this.name = name;
        this.gender = gender;
        this.votes = 0;
    }

    public void addVote() {
        this.votes++;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getVotes() {
        return votes;
    }
}
