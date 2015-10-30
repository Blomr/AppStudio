class Person {

   // Properties of the class...
   private String name;
   public int    age;
   private String country;
    
   // Constructor of the class...
   public Person(String aName, int anAge, String aCountry) {
      name = aName;
      age  = anAge;
	  country = aCountry;
	  
   }

   // Methods of the class...
   public void talk() {
      System.out.println("Hi, my name's " + name);
      System.out.println("and my age is " + age);
	  System.out.println("and I live in " + country);
	  commentAboutAge();
      System.out.println();
   }
   public void commentAboutAge() {
      if (age < 5) {
         System.out.println("baby");
      }
      if (age == 5) {
         System.out.println("time to start school");
      }
	  if (age > 60) {
		 System.out.println("old person");
	  }
   }
   
   public void growOlder() {
	   age++;
   }
   
   public void giveKnighthood() {
	   name = "Sir " + name;
   }
   
   public void growOlderBy(int years) {
	   age += years;
   }

}

class PersonTest {

   // The main method is the point of entry into the program...
   public static void main(String[] args) {

      Person ls = new Person("Luke Skywalker",34,"United States");
      Person wp = new Person("Winston Peters",48,"United Kingdom");
	  
	  // Test question 10
	  //Person ls = new Person();
	  //Person wp = new Person();

      ls.talk();
      wp.talk();
	  
	  wp.growOlder();
	  
	  wp.giveKnighthood();
	  
	  System.out.println(ls.age);
	  
	  ls.growOlderBy(10);

   }

}

