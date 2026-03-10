import java.util.*;

/**
 * LeetCode 49. Group Anagrams
 *
 * Problem: Given an array of strings strs, group the anagrams together.
 * You can return the answer in any order. An anagram is a word or phrase formed
 * by rearranging the letters of a different word or phrase.
 *
 * Approach: Character frequency mapping
 * - For each string, create a character frequency array (26 letters)
 * - Convert the frequency array to a string key (e.g., "#1#1#1#0#0...")
 * - Use HashMap to group strings with the same frequency key
 * - All anagrams will have identical frequency keys and be grouped together
 *
 * Time Complexity: O(n * k log k) - where n is number of strings, k is average string length
 * Space Complexity: O(n * k) - for storing all strings in HashMap
 */
public class GroupAnagram {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            int[] nums = new int[26];
            Arrays.fill(nums, 0);
            for (char c: s.toCharArray()) {
                nums[c - 'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<nums.length;i++) {
                    sb.append("#");
                    sb.append(nums[i]);
            }
            if (map.containsKey(sb.toString())) {
                map.get(sb.toString()).add(s);
            } else {
                map.put(sb.toString(), new ArrayList<>(Arrays.asList(s)));
            }
        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] strs = {"abbbbbbbbbbb","aaaaaaaaaaab"};
        GroupAnagram groupAnagram = new GroupAnagram();
        List<List<String>> list = groupAnagram.groupAnagrams(strs);
        System.out.println(list);
    }
}
