public class BRTest () {
	
	private int calls = 0;
	private int successfulCalls = 0;
	private int totalReturned = 0;
	private int[] excepCounts = new int[5];
	
	public void callIt () {
		calls++;
		BadRandom.randVal()
	}
}