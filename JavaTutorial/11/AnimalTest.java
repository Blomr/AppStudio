class Animal {

   // Properties of the class...
   public int     numberOfLegs;
   public boolean hasWings;

   // Constructor of the class...
   public Animal() {
      numberOfLegs = 4;
      hasWings = false;
   }

   // Methods of the class...
   public void talk() {
      System.out.println("Hello");
   }
}

class Bird extends Animal {

   // Properties of the class...
   public boolean canFly;

   // Constructor of the class...
   public Bird() {
      numberOfLegs = 2;
      hasWings = true;
      canFly = true;
   }

   // Methods of the class...
   public void fly() {
      System.out.println("flap flap");
   }
}

class Eagle extends Bird {

   // Properties of the class...
   private int numberOfKills;

   // Constructor of the class...
   Eagle() {
      numberOfKills = 0;
   }

   // Methods of the class...
   public void attack() {
      numberOfKills++;
   }
}

class AnimalTest {

   // The main method is the point of entry into the program...
   public static void main(String[] args) {

      Animal a = new Animal();
      System.out.println(a.numberOfLegs);
      System.out.println(a.hasWings);
      a.talk();
      //a.fly();
	  // animal class heeft geen fly method

      Bird b = new Bird();
      System.out.println(b.numberOfLegs);
      System.out.println(b.hasWings);
      System.out.println(b.canFly);
      //System.out.println(b.numberOfKills);
	  // bird class heeft geen numberofkills method
      b.talk();
      //b.attack(); 
	  // bird class heeft geen attack method

      Eagle e = new Eagle();
      //System.out.println(e.numberOfKills);
	  // numberofkills is private ipv public
      System.out.println(e.numberOfLegs);
      System.out.println(e.hasWings);
      e.talk();
      e.attack();
	  
	  a = b;
	  a.talk();
	  a.fly();
	  
	  b = a;
	  b.talk();
	  b.fly();

	  // Question 1d: numberofLegs is al bepaald in de bird class.
	  // Question 1e: a.fly(), omdat animal class geen fly method heeft. Er is een a = b, maar 
	  // 		      de compiler laat blijkbaar deze assignment niet toe om a de fly method te
	  // 			  laten gebruiken.
	  // Question 1f: b = a, omdat van een bird object een animal object wordt gemaakt en een 
	  //    	      animal object kan geen fly method gebruiken.
   }
}
