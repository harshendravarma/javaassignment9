package assignment9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sentence {
	String text;

	Sentence(String text) {
		this.text = text;
	}

	void checkpattern() {
		String regex = "[A-Z].*[.]";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(text);
		System.out.println(matcher.matches());
	}
}
