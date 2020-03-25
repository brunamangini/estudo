public class Vowels {
    private static final String VOWELS_PATTERN = "[aeiou]";

    public static int getCount(String str) {
        return (int) str.chars()
                .mapToObj(c -> (char) c)
                .filter(Vowels::isVowel)
                .count();
    }

    public static int getCount2(String str) {
        int vowels = 0;
        for (char c : str.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowels++;
            }
        }
        return vowels;
    }

    public static int getCount3(String str) {
        int vowels = 0;
        for (char c : str.toCharArray()) {
            if (isVowel(c)) {
                vowels++;
            }
        }
        return vowels;
    }

    private static boolean isVowel (char c) {
        return String.valueOf(c).matches(VOWELS_PATTERN);
    }
}
