// Printing 2D array in the form of matrix




import java.util.*;

class TwoDMatrix
{
	public static void main (String[] args)
	{	 
	    int row , col;
	
	    Scanner sc = new Scanner(System.in);
	 
	 
	    System.out.println("Enter the length of row:");
	     
	    row = sc.nextInt();
	    
	    System.out.println("Enter the length of column:");
	      
        col = sc.nextInt();
	     
	     
	     //Array declaration
	    
	    int[][] arr =  new int[row][col];
	    
	   
	   System.out.println("Enter Elements of the Matrix:");
	    

	    for(int i = 0; i<row; i++)
	    
	           {
	        
	       
	                for(int j =0; j<col; j++)
	                
	                     {
	            
	                        arr[i][j] = sc.nextInt();
	                     }
	            }
	            
	            
	            
	            // printing the 2-d array in the form of a Matrix
	            
	        System.out.println("Your " + row + " * " + col + " Matrix is:");
	    
	        for(int i = 0; i<row; i++)
	        {
	            
	            for(int j =0; j<col; j++)
	            {
	            
	                 System.out.print(arr[i][j] + " ");
	            }
	            
	            System.out.println();
	         }
	    
		
	}
}
