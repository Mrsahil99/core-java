package Practice;

public class teststring {
	
	public static void main(String[] args) {
		
		String name= "Sahil Shrivastava";
		
		String[] arr = name.split(" ");
		
		  for (int i = 0; i<=arr.length-1; i++) {
			  for (int j =  arr[i].length()-1; j >=0; j--) {
				  System.out.print(arr[i].charAt(j));	
			}
			 
			  System.out.print(" ");
			  
			
		} 
		  
		
	     
		
		
	     
		 
		 

}
}