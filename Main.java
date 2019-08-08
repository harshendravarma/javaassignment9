package assignment2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Sentence {
	String text;
	Sentence(String text){
		this.text=text;
	}
	void checkpattern() {	 
		String regex = "[A-Z].*[.]";
		Pattern pattern = Pattern.compile(regex);
		  Matcher matcher = pattern.matcher(text);
		  System.out.println(matcher.matches());
	}
}

public class Main {
	public static void main(String[] args) {
		Sentence s= new Sentence("Hi how are u.");
		s.checkpattern();
	}
}