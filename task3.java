package self_assessment;

public class task3 {
	public static void main(String[] args) {
		String text = "To be or not to be, that is the question;"
                + "Whether `tis nobler in the mind to suffer"
                + " the slings and arrows of outrageous fortune,"
                + " or to take arms against a sea of troubles,"
                + " and by opposing end them?";
        
		int spaces = 0, vowels = 0, letters = 0;
        
		int n = text.length();
        
		for (int i = 0; i < n; i++) {
			char c = text.toLowerCase().charAt(i);

			if (Character.isLetter(c)) {
				if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y') {
					vowels++;
				}
				letters++;       
			} 
			else if (Character.isWhitespace(c)) {
				spaces++;
			}
		}

		System.out.println("The text contained vowels: " + vowels + "\n"
                + "consonants: " + (letters - vowels) + "\n"
                + "spaces: " + spaces);
	}
}
