import java.text.ParseException;


/**
 * 
 */

/**
 * @author ez003385
 *
 */
public class Palindrome {

	/**
	 * @param args
	 * @throws ParseException 
	 */
	//palindrome
	public static void main(String[] args) {
		//testing if a number or an input string is palindrome or not
//		int a = 154255551;
		String str = String.valueOf("LOLdd");
		//string builder is not thread safe hence faster than string buffer
		//always call toString method to get a string representation of a stringbuilder object
		StringBuilder sbr = new StringBuilder(str);
		if (str.equals(sbr.reverse().toString())) {
			System.out.println("Palindrome");
		}
		else System.out.println("not palindrome");
	}



}
