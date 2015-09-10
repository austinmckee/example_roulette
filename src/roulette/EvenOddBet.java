package roulette;

import util.ConsoleReader;

public class EvenOddBet extends Bet {

	public EvenOddBet() {
		super("Odd or Even", 1);
	}

	@Override
	String place() {
		String result =  ConsoleReader.promptOneOf("Please bet", "even", "odd");
		System.out.println();
		return result;
	}

	@Override
	boolean makeBet(Wheel wheel, String betChoice) {
		return (wheel.getNumber() % 2 == 0 && betChoice.equals("even")) ||
                (wheel.getNumber() % 2 == 1 && betChoice.equals("odd"));
	}
}
