
public class Oct10Homework {
    public static void main(String[] args) {

    }

    public static String alternateStrings(String str1, String str2) {
        String output = "";
        String shortestString = shortestString(str1, str2);
        String longestString = longestString(str1, str2);
        int changedIndex = 0;
        for (int i = 0; i < shortestString.length(); i++) {
            output = output + str1.substring(i, i + 1) + str2.substring(i, i + 1);
            changedIndex = i;
        }
        output += longestString.substring(changedIndex + 1);
        return output;
    }

    private static String longestString(String str1, String str2) {
        if (str1.length() > str2.length()) return str1;
        return str2;
    }

    public static String shortestString(String str1, String str2) {
        if (str1.length() > str2.length()) return str2;
        return str1;
    }

    public static boolean dotBeforeABC(String phrase) {
        int abcLoc = phrase.indexOf("abc");
        if (abcLoc != 0 && phrase.substring(abcLoc - 1, abcLoc).equals(".")) {
            return false;
        }
        return true;
    }
}

