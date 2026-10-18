1. Problem

Given the head of a linked list, return the list after sorting it in ascending order.

2. Approach

Merge Sort adapted for linked lists:

    Find Middle: Use slow and fast pointers to split the list into two halves.

    Recursion: Recursively sort both sublists.

    Merge: Combine the two sorted sublists using standard two-pointer merging.

3. Time ComplexityTime Complexity: $O(n \log n)$
4. Reflection / Improvement. No, $O(n \log n)$ is the theoretical lower bound for comparison-based sorting. Bottom-up (iterative) Merge Sort can reduce space complexity from $O(\log n)$ to $O(1)$ stack space.