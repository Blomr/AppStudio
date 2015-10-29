class Flea {
   
   // Properties of the class...
   private String name;
   
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
   private String name;
   private int    age;
   private Flea   dogsFlea;

   // Constructor of the class...
   public Dog(String aName, int anAge, Flea aFlea) {
      name     = aName;
      age      = anAge;
      dogsFlea = aFlea;
   }
   
	public String toString() {
		return "I am a dog called " + name + ", I am " + age 
		+ " years old and " + dogsFlea;
	}

}

class DogOwner {
	
	private String name;
	private int salary;
	private Dog ownersDog;
	
	public DogOwner(String aName, int aSalary, Dog aOwnersDog) {
		name = aName;
		salary = aSalary;
		ownersDog = aOwnersDog;
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
		
		DogOwner angus = new DogOwner("Angus", 2000, )
   }
}

