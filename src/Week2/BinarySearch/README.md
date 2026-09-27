# Binary Search
1. Problem : 1. Problem
   We are given a sorted list of numbers `nums` and a `target` number. We need to find the index of `target` in `nums`. If the number is not in the array, we return `-1`.
2. Approach : Since the array is sorted, i can use **Binary Search**
- I set `left = 0` (start of array) and `right = nums.length - 1` (end of array).
- While `left <= right`, I find the middle index using `mid = left + (right - left) / 2`.
- If `nums[mid]` matches `target`, I found the answer and return `mid`.
- If `nums[mid]` is smaller than `target`, the number must be in the right half, so I set `left = mid + 1`.
- If `nums[mid]` is larger than `target`, the number must be in the left half, so I set `right = mid - 1`.
- If the loop finishes without finding `target`, I return `-1`.

3. Time Complexity : O(\log n) Halving $n$ elements repeatedly means the algorithm finishes in very few checks ($\log_2(n)$), making it much faster than checking elements one by one.
4. Space Complexity:only three variables (`left`, `right`, and `mid`) O(1)
5. I belive that For standard sorted arrays, $O(\log n)$ is the fastest general solution.