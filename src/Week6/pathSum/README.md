# Path Sum

## 1. Problem
Determine if the tree has a root-to-leaf path that sums up to `targetSum`.

## 2. Approach
Used recursive DFS, subtracting the node's value from the target until reaching a leaf.

## 3. Time Complexity
Time Complexity: O(n)
**Why:** All paths and nodes might need to be checked in the worst case.

## 4. Reflection / Improvement
- **Is there a more efficient approach?** The current recursive DFS is already optimal.
- **What would you need to change?** Use an iterative stack with `(node, current_sum)` pairs.
- **What complexity could the improved solution achieve?** $O(n)$ time complexity.