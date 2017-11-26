package io.zipcoder.casino;

public class CrapsPlayer extends Player<CrapsPlayer> implements Gamble, Dice {

    private String name;
    private Double money;
    private Card cardsInHand;

    CrapsPlayer(String name, Double money) {
        super(name, money);
    }



    //We won't be using this method of course, since Craps is a dice game, but I HAD to put this Override method here
    //to fulfill a contract we entered with our arrangement of abstracts and interfaces... it's just one of those
    //things we didn't anticipate when we were making the UML and now we are stuck with...
    @Override
    public void addCardToHand(Card newCard) {
        cardsInHand.add(newCard);
    }


//    public Double bet() {
//        return null;
//    }

    public Double bet(Double bet) {
        money -= bet;
        return bet;
    }

    public void addWinnings(Double winnings) {
        money += winnings;
    }

    static int point = 0;

    public static int shooter = Dice.rollDice(2);
    public static String gameMessage = " ";


    public static String firstRoll(){

            switch (shooter) {
                case 7:
                case 11:
                    gameMessage = "You win!";
                    //add payout to bank
                    break;
                case 2:
                    gameMessage ="You lose!";

                    //minus bet from available $$
                    break;
                default:
                    point = shooter;
                    gameMessage ="Your point has be set to: " + point + " Please roll again.";
                    break;
             }
//        System.out.println(gameMessage);
//        System.out.println(shooter);
//        System.out.println(point);
        return gameMessage;

    }

    public static void nextRoll() {

        if (shooter == point) {
            gameMessage = "You win!";
            //add payout to bank

        } else {
            switch (shooter) {
                case 7:
                case 11:
                    gameMessage = "You lose!";
                    //minus bet from available $$
                    break;
                case 2:
                    gameMessage = "You win!";
                    //add payout to bank
                    break;
                default:

                    gameMessage = "You rolled a: " + shooter + " you need to roll a " + point + " Please roll again.";
                    break;
            }
        }
//        System.out.println(gameMessage);
//        System.out.println(shooter);
//        System.out.println(point);

    }

