public class Basketball extends Sports
{
    String time;
    boolean hoopInTact;


    public Basketball(int score, String equipment, int teamSize, String time, boolean hoopInTact)
    {
        super(score, equipment, teamSize);
        this.time = time;
        this.hoopInTact = hoopInTact;
    }


}
