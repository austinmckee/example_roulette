package roulette;

import util.ConsoleReader;

public class ConsecutiveNumbersBet extends Bet {

	public ConsecutiveNumbersBet() {
		super("Three in a Row", 11);
	}
	
	@Override
	String place() {
		String result = "" + ConsoleReader.promptRange("Enter first of three consecutive numbers",
                1, Wheel.NUM_SPOTS - 3);
		System.out.println();
		return result;
	}

	@Override
	boolean makeBet(Wheel wheel, String betChoice) {
		int start = Integer.parseInt(betChoice);
        return (start <= wheel.getNumber() && wheel.getNumber() < start + 3);
	}

}
