package Pattern1;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	        int rowCount = 10;

	        for (int i = 0; i < rowCount; i++) {
	            char currentvalue = '1'; // Reset currentChar for each row
	            for (int j = 0; j <= i; j++) {
	                System.out.print(currentvalue + " ");
	                currentvalue++;
	            }
	            System.out.println();
	        }
	    }
	
	}


