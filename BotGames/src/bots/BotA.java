package bots;

public class BotA extends Bot {
	
	public BotA(byte x, byte y) {
		super(x, y, "A");
	}
	
	public byte getMove(byte[][] visual) {
		return idle;
	}
	
	/*
	 * Options:
	 * 0 idle
	 * 1 up
	 * 2 down
	 * 3 left
	 * 4 right
	 * 5 blow
	 * 6 laser
	 * 7 shield
	 */
	
}
