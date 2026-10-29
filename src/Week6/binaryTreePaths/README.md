# Binary Tree Paths

## 1. Problem
Return all root-to-leaf paths formatted with arrows (e.g., `"1->2->5"`).

## 2. Approach
Used a recursive DFS helper that accumulates the path string down to each leaf node.

## 3. Time Complexity
Time Complexity: O(n)
**Why:** Every node is visited and path strings are constructed relative to tree height.

## 4. Reflection / Improvement
- **Is there a more efficient approach?** Using backtracking with a mutable string builder.
- **What would you need to change?** Maintain a shared path list and pop elements after recursion.
- **What complexity could the improved solution achieve?** $O(n)$ time with optimized memory allocation.