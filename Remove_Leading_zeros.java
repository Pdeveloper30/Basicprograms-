package Task4;

public class Remove_Leading_zeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input ="00000123789";
		String output = RemoveLeadingZeros(input);   // RemoveLeadingZeros new method create
		
		System.out.println("Input :" + input);
		System.out.println("Output :" + output);

	
	}

	private static String RemoveLeadingZeros(String input) {
		// TODO Auto-generated method RemoveLeadingZeros
		
		// Indes the first non-zero character
		
		int index =0;
		
		while (index < input.length() && input.charAt(index) == '0') {
			index++;
			
		}
		
		if (index == input.length() ) {
			
			return "0";
			
			
		}
			
		return input.substring(index);
	}

}
