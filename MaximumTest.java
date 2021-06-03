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
			  
			 System.out.printf(" %d, %d and %d\n Maximun integer Value is %d\n\n", 7, 4, 3, maximum(7, 4, 3));

		  }
	}
