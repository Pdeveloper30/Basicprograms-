package Pattern1;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char character = 'A';       //for display character 
		
		for(int i=1 ;i<=5;i++)          // outer loop for creating row 
		{
			for(int j=0 ;j<i;j++)    //inner loop for creating column- inner loop is working till the j<i condition will false 
			{
			System.out.print(character +" ");  //for printing character for column 
			
			character++;      // this is because we have to increase column values that's why we have written in inner loop
			}
			
			System.out.println();       //this is for printing outer loop 
			
			
			
			
		}
	}

}
