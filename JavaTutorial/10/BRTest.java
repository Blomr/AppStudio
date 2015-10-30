public class BRTest {
	
	private int calls = 0;
	private int successfulCalls = 0;
	private int totalReturned = 0;
	private int[] excepCounts = new int[5];
	
	public void callIt () {
		calls++;
		try{
			totalReturned += BadRandom.randVal();
			successfulCalls++;
		}
		catch (ArithmeticException a){
			System.out.println(a.getMessage());
			excepCounts[0]++;
		}
		catch (NullPointerException a){
			System.out.println(a.getMessage());
			excepCounts[1]++;
		}
		catch (ArrayIndexOutOfBoundsException a){
			System.out.println(a.getMessage());
			excepCounts[2]++;
		}
		catch (ClassCastException a){
			System.out.println(a.getMessage());
			excepCounts[3]++;
		}
		catch (NegativeArraySizeException a){
			System.out.println(a.getMessage());
			excepCounts[4]++;
		}
		
	}
	
	public void resetCounts() {
		calls = 0;
		successfulCalls = 0;
		totalReturned = 0;
		
		for (int i=0; i<5; i++) {
			excepCounts[i] = 0;
		}
			
	}
	
	public void nRandInts (int n) {
		int currentSuccessfulCalls = successfulCalls;
		while (currentSuccessfulCalls + n != successfulCalls){
			callIt();
		}
	}
	
	public void writeData() {
		System.out.println("Total calls: " + calls);
		System.out.println("Successful calls: " + successfulCalls);
		System.out.println("Total values returned: " + totalReturned);
		System.out.println("Percentage ArithmeticException: " + ((float) excepCounts[0] / calls * 100));
		System.out.println("Percentage NullPointerException: " + ((float) excepCounts[1] / calls * 100));
		System.out.println("Percentage ArrayIndexOutOfBoundsException: " + ((float) excepCounts[2] / calls * 100));
		System.out.println("Percentage ClassCastException: " + ((float) excepCounts[3] / calls * 100));
		System.out.println("Percentage NegativeArraySizeException: " + ((float) excepCounts[4] / calls * 100));
		System.out.println("Percentage successfulCalls: " + ((float) successfulCalls / calls * 100));
	}
	
	public static void main(String[] args) {
		BRTest me = new BRTest();
		me.resetCounts();
		me.nRandInts(30);
		me.writeData();
	}
}