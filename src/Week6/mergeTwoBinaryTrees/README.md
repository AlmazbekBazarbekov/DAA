# Merge Two Binary Trees

## 1. Problem
Merge two binary trees by summing overlapping nodes and keeping non-overlapping ones.

## 2. Approach
Used recursion to combine node values and simultaneously merge left and right subtrees in-place.

## 3. Time Complexity
Time Complexity: O(min(m, n))
**Why:** Only overlapping nodes across both trees are traversed.

## 4. Reflection / Improvement
- **Is there a more efficient approach?** The current recursive approach is optimal.
- **What would you need to change?** Implement an iterative queue to process overlapping pairs.
- **What complexity could the improved solution achieve?** $O(\min(m, n))$ time complexity.