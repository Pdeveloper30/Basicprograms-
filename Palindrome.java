package Projects;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0, temp,reverse;
		int n = 123;
		
		temp=n;
		
		while(n>0)
		{
			reverse = n%10;
			 sum=(sum*10)+reverse;
			 n=n/10;  
		}
		
		 if(temp==sum)    
			   System.out.println("palindrome number ");    
			  else    
			   System.out.println("not palindrome");   
		
	}

}
