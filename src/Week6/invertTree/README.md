# Invert Binary Tree

## 1. Problem
Invert a binary tree to create its mirror image by swapping left and right children.

## 2. Approach
Used recursive DFS to swap left and right pointers at each node, then recursively process both children.

## 3. Time Complexity
Time Complexity: O(n)
**Why:** Every node must be visited once to swap pointers.

## 4. Reflection / Improvement
- **Is there a more efficient approach?** Iterative BFS approach to avoid deep call stacks.
- **What would you need to change?** Use a queue to process nodes level-by-level iteratively.
- **What complexity could the improved solution achieve?** $O(n)$ time complexity.