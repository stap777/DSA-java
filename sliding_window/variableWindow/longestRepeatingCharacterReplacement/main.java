public class main {

    static int LRCR(String s, int k) {

        int[] freq = new int[26];

        int l = 0;
        int maxfreq = 0;
        int maxLength = 0;

        for (int r = 0; r < s.length(); r++) {

            char ch = s.charAt(r);

            freq[ch - 'A']++;

            int windowsize = r - l + 1;

            maxfreq = Math.max(maxfreq, freq[ch - 'A']);

            if (windowsize - maxfreq > k) {

                freq[s.charAt(l) - 'A']--;
                l++;

            }

            maxLength = Math.max(maxLength, r - l + 1);
        }
        return maxLength;
    }

    public static void main(String [] args) {

        String s = "ABAB";
        int k = 2;

        System.out.println(LRCR(s, k));
    }

}