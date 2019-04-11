import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatter {

	
	/*
	 * DateFormat is an interface, SimpleDateFormat is one of the implementing classes
	 * use dateformat's format method to convert date to string
	 * use parse method to convert a string to date
	 */
		public static void main(String ar[]) throws ParseException {
			DateFormat df = new SimpleDateFormat("dd/MMM/yyyy");
			Date d = new Date();
			//Returns a string representation of the date based on the format specified
			System.out.println(df.format(d));
			//returns a date representation of the string based on the format specified
			System.out.println(df.parse("02/Apr/2018"));
		}

}
