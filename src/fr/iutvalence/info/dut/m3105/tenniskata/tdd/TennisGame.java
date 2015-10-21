package fr.iutvalence.info.dut.m3105.tenniskata.tdd;
public class TennisGame
{
	public static final boolean SERVER = true;
	public static final boolean RECEIVER = false;
	
	public static final String LOVE_FIFTEEN = "Love-Fifteen";
	public static final String FIFTEEN_LOVE = "Fifteen-Love";
	public static final String LOVE_ALL = "Love-all";
	
	public static final int FIFTEEN_SCORE = 1;
	
	private int serverScore;
	private int receiverScore;

	public String getScoreAsString()
	{
		if(this.serverScore == FIFTEEN_SCORE && this.receiverScore == 0)
			return FIFTEEN_LOVE;
		
		if(this.receiverScore == FIFTEEN_SCORE && this.serverScore == 0)
			return LOVE_FIFTEEN;
		
		if(this.serverScore == FIFTEEN_SCORE && this.receiverScore == FIFTEEN_SCORE)
			return "Fifteen-all";
		
		return LOVE_ALL;
	}
	
	public void playerWonThePoint(boolean isPlayerServer)
	{
		if(isPlayerServer)
			serverWonThePoint();
		else
			receiverWonThePoint();
	}

	public void serverWonThePoint()
	{
		this.serverScore += 1;
	}

	public void receiverWonThePoint()
	{
		this.receiverScore += 1;
	}
}
