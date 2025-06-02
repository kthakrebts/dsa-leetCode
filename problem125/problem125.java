public class problem125 {

    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "A man, a plan, a canal: Panama";
        System.out.println(sol.isPalindrome(s));  // Output: true
    }
}

class Solution {
    boolean isAlphanum(char ch) {
        return (ch >= '0' && ch <= '9') ||
               (Character.toLowerCase(ch) >= 'a' && Character.toLowerCase(ch) <= 'z');
    }

    public boolean isPalindrome(String s) {
        int st = 0;
        int end = s.length() - 1;

        while (st < end) {
            char startChar = s.charAt(st);
            char endChar = s.charAt(end);

            if (!isAlphanum(startChar)) {
                st++;
                continue;
            }

            if (!isAlphanum(endChar)) {
                end--;
                continue;
            }

            if (Character.toLowerCase(startChar) != Character.toLowerCase(endChar)) {
                return false;
            }

            st++;
            end--;
        }

        return true;
    }
}
