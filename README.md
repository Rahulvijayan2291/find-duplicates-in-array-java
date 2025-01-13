# Find Duplicates in an Array (Java)

Welcome to the repository for solving a common **coding interview problem**: Finding duplicates in an array using Java! 🚀

This repository contains a simple yet efficient solution to identify duplicate elements in an array, explained step-by-step with clean, optimized code.

---

## Problem Statement
Given an array of integers, find all elements that occur more than once. If no duplicates exist, return an empty list.

### Example:
**Input:** `[4, 3, 2, 7, 8, 2, 3, 1]`  
**Output:** `[2, 3]`  

---

## Solution Overview
This solution leverages:
- **HashSet**: To track seen elements efficiently.
- **ArrayList**: To store duplicate elements.

The algorithm is efficient, with a time complexity of **O(n)** and space complexity of **O(n)**.

---

## Code
Here’s the implementation:

```java
import java.util.*;

class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        List<Integer> result = new ArrayList<>();
        Set<Integer> seen = new HashSet<>();
        
        for (int num : arr) {
            if (!seen.add(num)) {
                result.add(num);
            }
        }
        
        return result;
    }
}
```
## How to Run the Code
1. Clone this repository to your local machine:
```
git clone https://github.com/yourusername/find-duplicates-in-array-java.git
cd find-duplicates-in-array-java
```

2. Compile the code:
```
javac Solution.java
```
3. Run the program with an example input:
```
java Solution
```
---

## Watch the Video Explanation 🎥
For a detailed, step-by-step walkthrough of the code, watch my YouTube video:
🔗 Java Coding Tutorial: Find Duplicates in an Array - https://youtu.be/ukuKhemNH3g

---

## Contributing
If you have any improvements or suggestions, feel free to fork the repo and create a pull request. Contributions are always welcome! 🙌

---

## Contact
If you have questions or want to collaborate, feel free to connect with me:
📧 Email: rahulvijayan2291@gmail.com
🔗 LinkedIn: https://www.linkedin.com/in/rahul-vijayan-682a12194/
🌟 Don’t forget to star this repository if you found it helpful!

---

## License
This project is licensed under the MIT License - see the LICENSE file for details.
