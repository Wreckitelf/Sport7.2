public class Tennis extends Sports
{
    boolean isOutBounds;
    boolean isSolo;

    public Tennis(int score, String equipment, int teamSize, boolean isOutBounds, boolean isSolo)
    {
        super(score, equipment, teamSize);
        this.isOutBounds = isOutBounds;
        this.isSolo = isSolo;
    }
}
