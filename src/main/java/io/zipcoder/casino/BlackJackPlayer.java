package io.zipcoder.casino;

public class BlackJackPlayer extends CardPlayer {

    public void startGame(Deck deck) {

    }

    public double showBalance() {

        return 0;

    }

    public Card hit(Deck deck) {
        return deck.pop();
    }

    public boolean stay() {

        return true;
    }


}
