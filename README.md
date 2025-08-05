# Searching-Algorithms
# 🔍 Search Algorithms in Java

This repository contains simple Java implementations of **Binary Search** and **Linear Search** in both **iterative** and **recursive** approaches.

---

## 📂 Files

- **BINARY_SEARCH_ITERATIVE.java** – Iterative implementation of Binary Search  
- **BINARY_SEARCH_RECURSIVE.java** – Recursive implementation of Binary Search  
- **LINEAR_SEARCH_ITERATIVE.java** – Iterative implementation of Linear Search  
- **LINEAR_SEARCH_RECURSIVE.java** – Recursive implementation of Linear Search  

---

## 📌 Algorithms Overview

 Linear Search
- **Description**:  
  - Scans each element one by one.
  - Works on **unsorted** arrays as well.
- **Time Complexity**:  
  - Worst case: `O(n)`  
  - Best case: `O(1)` (if the element is the first one)
- **Space Complexity**: `O(1)`
 Binary Search
- **Description**:  
  - Works on **sorted arrays only**.
  - Divides the array into halves until the element is found (or not found).
- **Time Complexity**:  
  - Worst case: `O(log n)`  
  - Best case: `O(1)`
- **Space Complexity**:  
  - Iterative: `O(1)`  
  - Recursive: `O(log n)` (due to recursion stack)
## How to Run

1. **Clone the Repository**
   ```bash
   git clone https://github.com/<your-username>/<repo-name>.git
   cd <repo-name>
