package Pattern1;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		for(int i=5; i>0;i--) 
		{
			char character = 'A';
			
			for(int j=0; j<i;j++) {
				System.out.print(character +" ");
				character++;
			}
			System.out.println();  
		}
	}

}
