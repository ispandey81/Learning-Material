import java.util.Scanner;

public class Anagrams {

	  static boolean isAnagram(String a, String b) {
		   if(a.length() != b.length()) return false;
		   String aCopy =  a.toLowerCase();
		   String bCopy = b.toLowerCase();
		   char[] aChar = aCopy.toCharArray();
		   boolean status = true;
		   //creating a stringbuilder from string b so that we can mutate the string
		   StringBuilder sb = new StringBuilder(bCopy);
		   for(char c: aChar) {
			   // trying to find the index of the character in the stringbuilder object
			   int index = sb.indexOf(Character.toString(c));
			   if (index != -1) {
				   // deleting the character from the stringbuilder object, for anagrams the stringbuilder object
				   // will be empty at the end of the loop
				   sb.deleteCharAt(index);
			   }
			   else {
				   status = false;
				   break;
			   }
		   }
		   return status;
		  
	    }

	  public static void main(String[] args) {
	    
	        Scanner scan = new Scanner(System.in);
	        String a = scan.next();
	        String b = scan.next();
	        scan.close();
	        boolean ret = isAnagram(a, b);
	        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	    }
}
