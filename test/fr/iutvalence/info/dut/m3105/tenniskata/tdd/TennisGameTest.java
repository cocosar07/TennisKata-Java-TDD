package fr.iutvalence.info.dut.m3105.tenniskata.tdd;


import org.junit.Assert;
import org.junit.Test;

public class TennisGameTest
{
	@Test
	public void createANewTennisGameWithNoScoreShouldReturnLoveAll()
	{
		TennisGame tennisGame = new TennisGame();
		
		Assert.assertEquals(TennisGame.LOVE_ALL, tennisGame.getScoreAsString());
	}
	
	@Test
	public void createATennisGameWhereServerHasTheFirstPointShouldReturnFifteenLove()
	{
		TennisGame tennisGame = new TennisGame();
		tennisGame.serverWonThePoint();
		
		Assert.assertEquals(TennisGame.FIFTEEN_LOVE, tennisGame.getScoreAsString());
	}
	
	@Test
	public void createATennisGameWhereReceiverHasTheFirstPointShouldReturnLoveFifteen()
	{
		TennisGame tennisGame = new TennisGame();
		tennisGame.receiverWonThePoint();
		
		Assert.assertEquals(TennisGame.LOVE_FIFTEEN, tennisGame.getScoreAsString());
	}
}
