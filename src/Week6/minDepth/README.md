# Minimum Depth of Binary Tree

## 1. Problem
Find the minimum depth (shortest path from root to nearest leaf node).

## 2. Approach
Used recursion, explicitly checking for null child branches so missing paths aren't incorrectly counted as leaves.

## 3. Time Complexity
Time Complexity: O(n)
**Why:** In the worst-case scenario, all nodes must be visited.

## 4. Reflection / Improvement
- **Is there a more efficient approach?** BFS can stop instantly upon hitting the first leaf node.
- **What would you need to change?** Implement a Queue for level-order traversal.
- **What complexity could the improved solution achieve?** $O(n)$ time complexity (faster in practice).