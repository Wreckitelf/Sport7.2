public class Sports
{
    public int score;
    public String equipment;
    public int teamSize;

    public Sports(int score, String equipment, int teamSize)
    {
        this.score = score;
        this.equipment = equipment;
        this.teamSize = teamSize;
    }



    public String toString()
    {
        return "Score required: " + score +
                "Main Equipment: " + equipment +
                "Team size: " + teamSize;
    }
}
