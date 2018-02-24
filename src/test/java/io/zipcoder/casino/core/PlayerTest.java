package io.zipcoder.casino.core;


import org.junit.Assert;
import org.junit.Test;

public class PlayerTest {
    Player player = new Player();

    @Test
    public void canCoverBetTest() {
        Long bet = 10l;
        Boolean actual = player.canCoverBet(bet);
        Assert.assertTrue(actual);
    }

    @Test
    public void betChipsTest() {
        Integer bet = 20;
        Long before = player.getBalance();
        player.betChips(bet);
        Long after = player.getBalance();
        Assert.assertTrue(after < before);
        Assert.assertFalse(after >= before);

    }

    @Test
    public void addChipsTest() {
        Long before = player.getBalance();
        player.addChips(40);
        Long after = player.getBalance();
        Assert.assertTrue(after > before);
        Assert.assertFalse(after <= before);
    }

    @Test
    public void getBalanceTest() {
        Long actual = player.getBalance();
        Assert.assertTrue(actual >= 0);
        Assert.assertNotEquals(null, actual);
    }
}
