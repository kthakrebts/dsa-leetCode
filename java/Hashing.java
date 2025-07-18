import java.util.*;
import java.util.stream.Collectors;

class Hashing {
    public static void main(String[] args) {
        String str = "YASHASHRI";
        String newStr = str.toLowerCase();

        Set<Character> ch = new HashSet<>();

        for (char c : newStr.toCharArray()){
            if(ch.contains(c)){
                ch.remove(c);
            }else{
                ch.add(c);
            }
        }

         String resultString = ch.stream()
                                 .map(String::valueOf)
                                 .collect(Collectors.joining(""));

                                 System.out.println(resultString);


    }
}
