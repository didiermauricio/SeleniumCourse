package JavaExerciceTugrul;



public class WordTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isPolindromeWord("level");
	}
	
	public static void isPolindromeWord(String wordToAnalize)
	{
		String result = "";
		for(int i = wordToAnalize.length()-1; i >= 0; i--)
		{
			result = result + wordToAnalize.charAt(i);
			System.out.println(result);
		}
		
		if(result.equals(wordToAnalize))
		{
			System.out.println("La palabra es polindroma");			
		}
		else
		{
			System.out.println("La palabra no es polindroma");			
		}
		
	}

}
