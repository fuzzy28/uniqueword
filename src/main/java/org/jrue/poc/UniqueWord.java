package org.jrue.poc;

/**
 * 
 * @author jruelos
 * 
 */
public class UniqueWord {

	public static String get(String str) {
		String word = str.toLowerCase();
		String candidate = "";
		// divide the given word starting from half length of the word up to 2
		main: for (int i = word.length() / 2; i > 1; i--) {
			String preivousWord = word.substring(0, i);
			// variable that will hold if words divided are equal to each other
			boolean consistent = false;
			for (int j = i; j < word.length(); j += i) {
				//check if the previous word is equal to the current word
				if ((j + i) <= word.length()
						&& preivousWord.equals(word.substring(j, j + i))) {
					consistent = true;
				} else {
					//if it's not equal then continue to split the word again
					consistent = false;
					continue main;
				}
			}
			if (consistent)
				candidate = preivousWord;
		}
		return candidate.length() > 0 ? candidate : word;
	}
}
