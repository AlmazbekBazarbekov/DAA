# Sum of Left Leaves

## 1. Problem
Find the sum of all left leaves in a binary tree.

## 2. Approach
Used recursion to check if a node's left child is a leaf, adding its value and traversing subtrees.

## 3. Time Complexity
Time Complexity: O(n)
**Why:** All nodes in the tree must be checked.

## 4. Reflection / Improvement
- **Is there a more efficient approach?** Iterative traversal using a stack or queue.
- **What would you need to change?** Track node references alongside a boolean flag for left children.
- **What complexity could the improved solution achieve?** $O(n)$ time complexity.