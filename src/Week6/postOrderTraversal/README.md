# Binary Tree Postorder Traversal

## 1. Problem
Return node values using postorder traversal (Left, Right, Root).

## 2. Approach
Used recursion to fully traverse left and right subtrees before processing the root node.

## 3. Time Complexity
Time Complexity: O(n)
**Why:** Every node is visited once during traversal.

## 4. Reflection / Improvement
- **Is there a more efficient approach?** A two-stack iterative approach or reversing a modified preorder traversal.
- **What would you need to change?** Adapt a preorder pattern and reverse the result array.
- **What complexity could the improved solution achieve?** $O(n)$ time complexity.