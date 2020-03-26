package disemvowelTrolls;

public class Troll {
    public static String disemvowel(String str) {
        return str == null ? null : str.replaceAll("[aeiouAEIOU]","");
    }
}
