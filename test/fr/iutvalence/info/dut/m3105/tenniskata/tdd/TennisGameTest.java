package fr.iutvalence.info.dut.m3105.tenniskata.tdd;


import org.junit.Assert;
import org.junit.Test;

public class TennisGameTest
{
	@Test
	public void CreateANewTennisGameWhichShouldDisplayLoveAll()
	{
		TennisGame tennisGame = new TennisGame();
		
		Assert.assertEquals("Love-all", tennisGame.getScoreAsString());
	}
}
