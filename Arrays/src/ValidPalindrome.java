/**
 * LeetCode 125. Valid Palindrome
 *
 * Problem: A phrase is a palindrome if, after converting all uppercase letters into lowercase letters
 * and removing all non-alphanumeric characters, it reads the same forward and backward.
 * Alphanumeric characters include letters and numbers.
 *
 * Approach: Two-pointer technique
 * - Convert string to lowercase and remove non-alphanumeric characters
 * - Use two pointers: one starting from left, one from right
 * - Move pointers towards center, comparing characters
 * - If all characters match, it's a palindrome
 *
 * Time Complexity: O(n) - where n is the length of the string
 * Space Complexity: O(1) - excluding the space for the cleaned string
 */
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^a-zA-Z0-9]", "");

        int left = 0, right = s.length() - 1;

        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            else {
                left++;
                right--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        ValidPalindrome validPalindrome = new ValidPalindrome();
        boolean b = validPalindrome.isPalindrome(s);
        System.out.println(b);
    }
}
