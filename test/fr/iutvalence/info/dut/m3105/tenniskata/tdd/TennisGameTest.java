package fr.iutvalence.info.dut.m3105.tenniskata.tdd;


import org.junit.Assert;
import org.junit.Test;

public class TennisGameTest
{
	private TennisGame tennisGame;

	@Test
	public void createANewTennisGameWithNoScoreShouldReturnLoveAll()
	{
		createNewTennisGame();
		
		Assert.assertEquals(TennisGame.LOVE_ALL, tennisGame.getScoreAsString());
	}
	
	@Test
	public void createATennisGameWhereServerHasTheFirstPointShouldReturnFifteenLove()
	{
		createNewTennisGame();
		playerWonThePoint(TennisGame.SERVER);
		
		Assert.assertEquals(TennisGame.FIFTEEN_LOVE, tennisGame.getScoreAsString());
	}
	
	@Test
	public void createATennisGameWhereReceiverHasTheFirstPointShouldReturnLoveFifteen()
	{
		createNewTennisGame();
		playerWonThePoint(TennisGame.RECEIVER);
		
		Assert.assertEquals(TennisGame.LOVE_FIFTEEN, tennisGame.getScoreAsString());
	}

	private void createNewTennisGame()
	{
		tennisGame = new TennisGame();
	}
	
	public void playerWonThePoint(boolean isPlayerServer)
	{
		this.tennisGame.playerWonThePoint(isPlayerServer);
	}
}
