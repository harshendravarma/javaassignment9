package assignment9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sentence {
	
	String text;

	Sentence(String text) {
		this.text = text;
	}
	
	/* chech whether given sentence matches with regular expression */
	
	void checkPattern() {
		String regex = "[A-Z].*[.]"; 	// begins with a capital letter and ends with a period
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(text);
		System.out.println(matcher.matches());
	}
	
}
