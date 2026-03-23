# DSA-JAVA-LeetCode Solutions

A collection of LeetCode problem solutions implemented in Java, focusing on fundamental data structures and algorithms.

## 📚 Problems Solved

### Array & Hashing

| Problem # | Problem Title | File Name | Approach | Time | Space |
|-----------|---------------|-----------|----------|------|-------|
| 1 | Two Sum | `TwoSum.java` | HashMap storing complement values | O(n) | O(n) |
| 11 | Container With Most Water | `ContainerWithMostWater.java` | Two-pointer greedy approach | O(n) | O(1) |
| 26 | Remove Duplicates from Sorted Array | `RemoveDuplicateInSortedArray.java` | Two-pointer technique | O(n) | O(1) |
| 49 | Group Anagrams | `GroupAnagram.java` | Character frequency mapping | O(n*k log k) | O(n*k) |
| 125 | Valid Palindrome | `ValidPalindrome.java` | Two-pointer with preprocessing | O(n) | O(1) |
| 167 | Two Sum II - Input Array Is Sorted | `TwoSum2.java` | Two-pointer technique | O(n) | O(1) |
| 217 | Contains Duplicate | `Duplicates.java` | HashSet for O(1) lookup | O(n) | O(n) |
| 219 | Contains Duplicate II | `DuplicatesII.java` | HashMap storing most recent index | O(n) | O(min(n, k)) |
| 238 | Product of Array Except Self | `productofArrayExceptSelf.java` | Prefix and suffix products | O(n) | O(n) |
| 242 | Valid Anagram | `ValidAnagram.java` | Character frequency counting | O(n) | O(1) |
| 724 | Find Pivot Index | `PivotalIndex.java` | Prefix sum technique | O(n) | O(1) |
| 2461 | Maximum Sum of Distinct Subarrays With Length K | `MaximunSumOfDistinctInSubArray.java` | Sliding window with HashSet | O(n) | O(k) |

## 🚀 How to Run

### Option 1: IntelliJ IDEA
1. Open the project folder in IntelliJ IDEA
2. Configure JDK: File > Project Structure > Project SDK
3. Right-click on any `.java` file and select "Run 'ClassName.main()'"

### Option 2: Command Line
```bash
javac FileName.java
java FileName
```

## 📋 Requirements

- Java 8 or higher
- IntelliJ IDEA (recommended) or any Java IDE

## 📝 Notes

- Each file contains comprehensive comments explaining the problem statement and approach
- All solutions follow LeetCode problem specifications
- Time and space complexity analysis is provided for each solution

## 👤 Author

maari621

---
Last Updated: March 2026
