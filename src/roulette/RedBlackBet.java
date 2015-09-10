package roulette;

import util.ConsoleReader;

public class RedBlackBet extends Bet {

	public RedBlackBet() {
		super("Red or Black", 1);
	}

	@Override
	String place() {
		String result =  ConsoleReader.promptOneOf("Please bet", Wheel.BLACK, Wheel.RED);
		System.out.println();
		return result;
	}

	@Override
	boolean makeBet(Wheel wheel, String betChoice) {
		return wheel.getColor().equals(betChoice);
	}

}
