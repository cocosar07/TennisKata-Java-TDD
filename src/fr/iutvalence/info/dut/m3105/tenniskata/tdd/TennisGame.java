package fr.iutvalence.info.dut.m3105.tenniskata.tdd;
public class TennisGame
{
	public static final String FIFTEEN_LOVE = "Fifteen-Love";
	public static final String LOVE_ALL = "Love-all";
	public static final int FIFTEEN_SCORE = 1;
	
	private int serverScore;

	public String getScoreAsString()
	{
		if(this.serverScore == FIFTEEN_SCORE)
			return FIFTEEN_LOVE;
		
		return LOVE_ALL;
	}

	public void serverWonThePoint()
	{
		this.serverScore += 1;
	}
}
