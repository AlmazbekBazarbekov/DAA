# First Bad Version
1. Problem : We are given n versions of some project and they are sorted in ASC way, once a version fails the check all the next are bad versions. We need to find the fist bad with the minimal using of isBadVersion method.
2. Approach : Instead of checking every version one by one, we use **Binary Search**:
- Maintain two pointers: `leftBorder = 1` and `rightBorder = n`.
- Calculate `mid = leftBorder + (rightBorder - leftBorder) / 2` to prevent 32-bit integer overflow (firstly i have tried with mid = (leftBorder + rightBorder) / 2, but leetcode didnt accept it so i search info and find this sol of that problem.)
- If `isBadVersion(mid)` returns `true`, the first bad version is either `mid` itself or located to the left, so we update `rightBorder = mid`.
- If `isBadVersion(mid)` returns `false`, the first bad version is strictly to the right, so we update `leftBorder = mid + 1`.
- When `leftBorder == rightBorder`, the loop terminates and `leftBorder` points to the first bad version.

3. Time Complexity : O(log n) : Every time I check the middle element, I throw away half of the remaining versions. For $n$ elements, halving the range repeatedly takes at most $\log_2(n)$ steps, which makes it very fast even for large numbers.
4. Space Complexity: O(1) : I only use three simple variables (`left`, `right`, and `mid`). The code does not allocate extra arrays or objects, so memory usage stays constant.
5. Reflection / Improvement : for both problems i think Binary search is the best sol. 