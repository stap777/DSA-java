public class main {

    static boolean validPalindrome(String s) {

        int l = 0;
        int r = s.length() - 1;

        while (l < r) {

            // invalid left char
            while (l < r && !Character.isLetterOrDigit(l)) {
                l++;
            }
            // invalid right char
            while (l < r && !Character.isLetterOrDigit(r)) {
                r--;
            } 

            // valid char
            char leftChar = Character.toLowerCase(s.charAt(l));
            char rightChar = Character.toLowerCase(s.charAt(r));

            // compare
            if (leftChar != rightChar) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        
        String s = "race car";
        System.out.println(validPalindrome(s));
    }
}