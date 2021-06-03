public class MaximumTest {

		 // determines the largest of three Comparable objects
		  public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
			  
			  T max = x; 
			     // assume x is initially the largest

			  if (y.compareTo(max) > 0)
				  max = y; 
			  	  // y is the largest so far

			  if (z.compareTo(max) > 0)
				  max = z; // z is the largest

			  return max;
			  // returns the largest object
			  // end method maximum
		    
		  }

		  public static void testMaximum(String args[]) {
			  
			 System.out.printf(" %d, %d and %d\n Maximun integer Value is %d\n\n", 
					     7, 4, 3, maximum(7, 4, 3));

                         System.out.printf(" %.1f, %.1f and %.1f\n Maximum float Value is %.1f\n\n",
			                     7.6f, 4.3f, 3.2f, maximum(7.6f, 4.3f, 3.2f));
	    
                         System.out.printf(" %s, %s and %s\n Maximum String Value is %s\n", "Banana", 
					    "Apple","Orange", maximum("Banana", "Apple", "Orange"));
		  }
	}
