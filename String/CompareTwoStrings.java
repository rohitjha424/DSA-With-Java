//Comapre Two Strings



import java.util.*;


class CompareTwoStrings
{
	public static void main (String[] args)
	{	 
	    String str1 , str2;
	
	    Scanner sc = new Scanner(System.in);
	 
	 
	    System.out.println("Enter the 1st String");
	     
	    str1 = sc.next();
	    
	    System.out.println("Enter the 2nd String:");
	      
        str2 = sc.next();

	            
	           
	   if(str1.compareTo(str2)==0){
	       
	       System.out.println("Strings are equal");
	       
	   }
	   else{
	       
	        System.out.println("Strings are not equal");
	   }
	        
	    
		
	}
}
