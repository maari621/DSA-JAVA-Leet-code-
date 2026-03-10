import java.util.HashMap;

/**
 * LeetCode 242. Valid Anagram
 *
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
 * typically using all the original letters exactly once.
 *
 * Approach: Use a HashMap to count character frequencies. First, count all characters in string s
 * (increment count). Then, for each character in string t, decrement its count. If any character
 * has a non-zero count at the end, the strings are not anagrams.
 *
 * Time Complexity: O(n) - where n is the length of the strings
 * Space Complexity: O(1) - HashMap stores at most 26 lowercase letters (constant space)
 */
public class ValidAnagram {
    public static void main(String[] args) {
        String s = "anagram", t = "naggram";
        boolean b = true;
        if(s.length()!=t.length())
            b= false;
        HashMap<Character,Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
        }

        for (int i = 0; i < t.length(); i++) {
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i),0)-1);
        }

        for(char c : map.keySet()){
            if(map.get(c)!=0)
                b= false;
        }
        System.out.println(b);
    }
}
