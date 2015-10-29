public class Iffy {
   private int anIntProp = 42;
   public static void main(String[] args) {
      Iffy me = new Iffy();
      me.callSomeMethods();
   }

   public void callSomeMethods() {
      // add statements here to exercise the other methods ...
	  warnIfNegative(anIntProp);
	  // Question 2: de method zal altijd printen, ongeacht wat het getal is. Dit komt door de semicolon.
	  resetIfNegative();
	  // Question 4: anIntProp zal altijd 0 worden, omdat hij niet binnen de {} van de if staat. Alleen 
	  // 		     system.out wordt door de if verwerkt.
	  System.out.println(isInRange(8, 12, 9));
	  System.out.println(isInRange(5, 8, 2));
   }

   /**
    * Print out a warning if the value is negative
    * otherwise don't do anything.
    */
   public void warnIfNegative(int theValue) {
      if(theValue < 0)
      System.out.println("Caution - negative value given (" + theValue + ")");
   }
  
   /**
    * Print out a warning if the value of anIntProp is negative
    * and also set the value to zero.
    * Otherwise don't do anything.
    */
   public void resetIfNegative() {
      if(anIntProp < 0) {
         System.out.println("Caution - negative value given (" + anIntProp + ")");
		 anIntProp = 0;
	  }
   }

   /**
    * return true if value is between upperBound and LowerBound
    * (or equal to either bound) otherwise return false.
    */
    public boolean isInRange(int value, int upperBound, int lowerBound) {
     if (upperBound <= lowerBound)
	   System.out.println("upperBound is lower or equal to lowerBound");
	 if(lowerBound <= value && value <= upperBound )
       return true;
     else
       return false;
   }

   public boolean isInRangeIfLess(int value, int upperBound, int lowerBound) {
		return (lowerBound <= value && value <= upperBound);
   }
}
