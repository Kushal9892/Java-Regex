import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatchingDemo {

	public static void main(String[] args) {
		
		int count = 0;
		
		/* Pattern is the equivalent java object of Regular Expression */
		/* To search for a pattern/regular expression, we create a ‘Pattern’ object using the compile() method
		 *  and pass the pattern to the compile() method (it is a static method in Pattern class). */
		Pattern p = Pattern.compile("ab"); 

		/* To match a required string in a target string, we use the matcher object
		 * the matcher object is created by using the matcher() method present in the Pattern class */
		Matcher m = p.matcher("ababbaba"); // Pass the target String
		
		/*  m.find() -- Returns 'true' if it finds any match, else returns false */
		while (m.find()) {
			count++;
			
			/* m.start() -- displays the starting index of the matched string
			 * m.end() -- displays the ending index (end+1) of the matched string
			 * m.group() -- displays the matched string */
			System.out.println(m.start() + "..." + m.end() + "..." + m.group());
		}
		System.out.println("The number of occurences is: "+ count);
	}

}
