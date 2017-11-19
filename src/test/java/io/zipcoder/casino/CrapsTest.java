package io.zipcoder.casino;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CrapsTest {
    @Test
    public void startRoundB() throws Exception {
    }

    @Test
    public void passBetWinsTest() throws Exception {
        Craps game = new Craps();
        game.setComeOut(true);
        Assert.assertTrue(game.passBetWins(7));
        Assert.assertTrue(game.passBetWins(11));

        game.setPoint(9);
        game.setComeOut(false);
        Assert.assertTrue(game.passBetWins(9));


    }

    @Test
    public void passBetLosesTest() throws Exception {
        Craps game = new Craps();
        game.setComeOut(true);
        Assert.assertTrue(game.passBetLoses(2));
        Assert.assertTrue(game.passBetLoses(3));
        Assert.assertTrue(game.passBetLoses(12));

        game.setComeOut(false);
        game.setPoint(4);
        Assert.assertTrue(game.passBetLoses(7));
    }

    @Test
    public void dontPassWins() throws Exception {
    }

    @Test
    public void setBetType() throws Exception {
    }

    @Test
    public void placeBet() throws Exception {
    }

    @Test
    public void rollAgain() throws Exception {
    }

    @Test
    public void resolveBets() throws Exception {
    }

}