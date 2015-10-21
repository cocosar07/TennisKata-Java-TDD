package fr.iutvalence.info.dut.m3105.tenniskata.tdd;
public class TennisGame
{
	private int serverScore;

	public String getScoreAsString()
	{
		if(this.serverScore == 1)
			return "Fifteen-Love";
		
		return "Love-all";
	}

	public void increaseServerScore()
	{
		this.serverScore += 1;
	}
}
