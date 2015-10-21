package fr.iutvalence.info.dut.m3105.tenniskata.tdd;
public class TennisGame
{
	private static final int FIFTEEN_SCORE = 1;
	
	private int serverScore;

	public String getScoreAsString()
	{
		if(this.serverScore == FIFTEEN_SCORE)
			return "Fifteen-Love";
		
		return "Love-all";
	}

	public void increaseServerScore()
	{
		this.serverScore += 1;
	}
}
