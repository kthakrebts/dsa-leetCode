public class problem1910 {

    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "daabcbaabcbc";
        String part = "abc";
        String result = sol.removeOccurrences(s, part);
        System.out.println("Result:"+ ""+result);
   
      
    }
}

class Solution {

     public String removeOccurrences(String s, String part) {
       while (s.contains(part)) {
            s = s.replaceFirst(part, "");
        }
        return s; 
        }
}