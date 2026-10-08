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

1. Problem

Merge two sorted linked lists, list1 and list2, into a single sorted list by splicing together their existing nodes. Return the head of the merged linked list.

2. Approach

Iterative two-pointer traversal with a dummy node:

    Use a dummy node to simplify handling the head of the new list and a curr pointer to construct it.

    Compare current nodes of list1 and list2. Attach the smaller node to curr.next and advance that list's pointer.

    Once one list runs out, attach the remaining nodes of the other list directly to curr.next.

3. Time ComplexityTime Complexity: $O(n + m)$Where $n$ and $m$ are the lengths of list1 and list2. Each iteration processes exactly one node in $O(1)$ time, making at most $n + m$ steps.
5. Reflection / Improvement
   A recursive solution can also solve this problem, but it uses $O(n + m)$ call stack space. The iterative approach is better because it uses constant memory.
