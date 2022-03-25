
public class SampleProgram {

	public static void main(String[] args) {
		String input="Priyadharshini";
		char search='a';
		int count=0;
		for(int i=0; i<input.length(); i++)
		{
			if(input.charAt(i)==search)
			count++;
		}
		System.out.println("The character " +search+ " appears " +count+" times");
		
	}

}
