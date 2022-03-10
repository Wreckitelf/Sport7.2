public class Baseball extends Sports
{
    int inning;
    boolean isGoodBat;

    public Baseball(int team, String equipment, int teamSize, int inning, boolean isGoodBat)
    {
        super(team, equipment, teamSize);
        this.inning = inning;
        this.isGoodBat = isGoodBat;
    }
}
