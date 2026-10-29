# Binary Tree Preorder Traversal

## 1. Problem
Return node values using preorder traversal (Root, Left, Right).

## 2. Approach
Used recursive DFS to record the root node first, followed by left and right subtrees.

## 3. Time Complexity
Time Complexity: O(n)
**Why:** Every node is visited once, scaling linearly with node count $n$.

## 4. Reflection / Improvement
- **Is there a more efficient approach?** An iterative approach using a stack.
- **What would you need to change?** Push nodes to an explicit stack to avoid recursion depth limits.
- **What complexity could the improved solution achieve?** $O(n)$ time complexity.