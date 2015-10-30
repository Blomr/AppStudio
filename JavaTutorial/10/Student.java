/* Need to import java.io package to use the BufferedReader and
	 InputStreamReader. 
*/
import java.io.*;

public class Student {

  private static BufferedReader stdIn = new BufferedReader(new
		InputStreamReader(System.in));

  private String name;
  private int age;

  public Student () {
    name = "";
    age = 0;
  }

  public void readName () throws IOException {
    System.out.print("Input your name: ");
    name = stdIn.readLine();
  }
  
  public void readAge () {
	  boolean inBetween = false;
	  while (inBetween == false) {
		System.out.print("Input your age: ");
		try {
			age = Integer.parseInt(stdIn.readLine());
			if (!(inBetween = (age >= 0 && age <= 150))) 
				System.out.println("An integer between 0 and 150 please.");
		}
		catch (IOException a) {
			System.out.println("Too bad, something went wrong.");
			System.exit(0);
		}
		catch (NumberFormatException a) {
			age = -1;
			System.out.println("That's not an integer.");
		}
	  }
  }
    

  public void printName () {
    System.out.println("Name: " + name);
  }
  
  public void printAge () {
    System.out.println("Age: " + age);
  }


  public static void main (String[] args) throws IOException {
    Student me = new Student();
    me.readName();
    me.printName();
	me.readAge();
	me.printAge();

  }
}

  
  
