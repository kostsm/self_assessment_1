package self_assessment;

public class task4 {
	public static void main(String[] args) {
		String text = "To be or not to be, that is the question;"
                + " Whether `tis nobler in the mind to suffer"
                + " the slings and arrows of outrageous fortune,"
                + " or to take arms against a sea of troubles,"
                + " and by opposing end them?";
        
		text.toLowerCase();        
        
        	// Let's define a word as a sequence of letters, without digits and other symbols
        	String[] words = text.split("[^a-z]+");
        
        	bubblesort(words);

        	for (String word : words) {
        		System.out.println(word);
       		}
	}
	
	private static void bubblesort(String[] words) {	
		int n = words.length;

		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1- i; j++) {
				if (words[j].compareTo(words[j + 1]) > 0) {
					String swap = words[j];
					words[j] = words[j + 1];
					words[j + 1] = swap;
				}
			}
		}
	}
}
