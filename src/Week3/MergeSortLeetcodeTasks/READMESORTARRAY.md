1. Problem 
Given an array of integers nums, sort the array in ascending order and return it in $O(n \log n)$ time without using built-in functions.

2. Approach

Merge Sort algorithm:

    Recursively divide the array into halves until each subarray has 1 element.

    Merge the sorted subarrays back together in sorted order.

3. Time ComplexityTime Complexity: $O(n^2)$
4. Reflection / Improvement Yes, the current approach (bubble sort) takes $O(n^2)$ An optimal solution requires $O(n \log n)$ time (e.g., Merge Sort or QuickSort).
