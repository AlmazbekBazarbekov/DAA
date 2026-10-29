# Binary Tree Inorder Traversal

## 1. Problem
Return a list of node values using inorder traversal (Left, Root, Right).

## 2. Approach
Used recursive DFS to visit the left subtree, record the current node, and then visit the right subtree.

## 3. Time Complexity
Time Complexity: O(n)
**Why:** Every node in the binary tree is visited exactly once.

## 4. Reflection / Improvement
- **Is there a more efficient approach?** Yes, an iterative approach using an explicit stack.
- **What would you need to change?** Use a `While` loop and a `Stack` data structure instead of recursion.
- **What complexity could the improved solution achieve?** $O(n)$ time and $O(h)$ space.