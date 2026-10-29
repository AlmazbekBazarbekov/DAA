# Maximum Depth of Binary Tree

## 1. Problem
Find the maximum depth (longest path from root to farthest leaf node).

## 2. Approach
Used recursive DFS, taking `1 + max(left_depth, right_depth)` for each node.

## 3. Time Complexity
Time Complexity: O(n)
**Why:** The algorithm visits every node once to evaluate subtree depths.

## 4. Reflection / Improvement
- **Is there a more efficient approach?** An iterative BFS level-order traversal.
- **What would you need to change?** Use a queue to track nodes level by level.
- **What complexity could the improved solution achieve?** $O(n)$ time complexity.