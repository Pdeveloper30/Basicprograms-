package print_pattern;

public class java_print_pattern {

	public static void main(String[] args) {
		
		char character = 'A';
		int noch = 1;
		int n=0;
		int noc=n*2-1;
		
		for(int row=1;row<=n*2-1;row++);
		   for(int col=1;col<=n*2-1;col++) {
			   if(col<=noch || col>=noc) {
				   System.out.print("A");
				   
			   }else {
				   System.out.print(" ");
				   
			   }
		   }
		   System.out.println();
		
		}
		
	}

