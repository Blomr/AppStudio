class Flea {
   
   // Properties of the class...
   public String name;
   
   // Constructor of the class...
   public Flea(String aName) {
      name = aName;
   }

   // Methods of the class...
   public String toString() {
      return "I am a flea called " + name;
   }

}

class Dog {

   // Properties of the class...
   public String name;
   private int    age;
   public Flea   dogsFlea;

   // Constructor of the class...
   public Dog(String aName, int anAge, Flea aFlea) {
      name     = aName;
      age      = anAge;
      dogsFlea = aFlea;
   }
   
	public String toString() {
		return "I am a dog called " + name + ", I am " + age 
		+ " years old and I have a flea called " + dogsFlea.name;
	}

}

class DogOwner {
	
	private String name;
	private int salary;
	public Dog ownersDog;
	
	public DogOwner(String aName, int aSalary, Dog aOwnersDog) {
		name = aName;
		salary = aSalary;
		ownersDog = aOwnersDog;
	}
	
	public String toString() {
		return "I am a dog owner called " + name + ", I have a salary of " + salary 
		+ " and I have a dog called " + ownersDog.name;
	}
}

class DogTest {

   // The main method is the point of entry into the program...
   public static void main(String[] args) {
		
		Flea pop = new Flea("Pop");
		Flea squeak = new Flea("Squeak");
		Flea zip = new Flea("Zip");
		
		Dog rex = new Dog("Rex", 5, pop);
		Dog jimbo = new Dog("Jimbo", 7, squeak);
		Dog fido = new Dog("Fido", 4, zip);
		
		System.out.println(rex.toString());
		System.out.println(jimbo.toString());
		System.out.println(fido.toString());
		
		DogOwner angus = new DogOwner("Angus", 2000, rex);
		DogOwner brian = new DogOwner("Brian", 2200, jimbo);
		DogOwner charles = new DogOwner("Charles", 1900, fido);
		
		System.out.println(angus.toString());
		System.out.println(brian.toString());
		System.out.println(charles.toString());
		
		// Answer on question 8: I am a flea called Pop
		System.out.println(angus.ownersDog.dogsFlea.toString());
   }
}

