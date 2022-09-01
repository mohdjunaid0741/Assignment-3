public class Question_3 {

	public static void main(String[] args) {
		// taking variable for loop iteration and row .
	    int row,r,c;
	    //creating object 
	     row = 5;
	    
	    //outer for loop 
	    for (r = 0; r < row ; r++) 
	    {
	        // this line prints first column stars
	        System.out.print("* ");
	        // inner for loop
	        for (c = 0; c < row-1; c++)
	        {
	            // printing stars
	            if (r == row - 1)
	                System.out.print("* ");
	            // printing space
	            else
	                System.out.print(" ");
	        }
	        System.out.print ("\n");
	    }
	}
}