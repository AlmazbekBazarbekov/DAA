1. Problem

Determine if a singly linked list contains a cycle. Return true if a node points back to a previously visited node, otherwise return false.
2. Approach

Uses Floyd’s Cycle-Finding Algorithm (Tortoise and Hare):

    slow moves 1 step; fast moves 2 steps.

    If fast hits null, there is no cycle (false).

    If slow == fast, a cycle exists (true).
3. Time ComplexityTime Complexity: $O(n)$
4. Reflection / Improvement
$O(n)$ time and $O(1)$ space is optimal. I think so.