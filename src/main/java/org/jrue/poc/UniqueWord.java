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
		main: for (int i = word.length() / 2; i > 1; i--) {
			String currentWord = word.substring(0, i);
			boolean consistent = false;
			for (int j = i; j < word.length(); j += i) {
				if ((j + i) <= word.length()
						&& currentWord.equals(word.substring(j, j + i))) {
					consistent = true;
				} else {
					consistent = false;
					continue main;
				}
			}
			if (consistent)
				candidate = currentWord;
		}
		return candidate.length() > 0 ? candidate : word;
	}
}
