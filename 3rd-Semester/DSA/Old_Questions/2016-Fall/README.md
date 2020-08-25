# 2016-Fall

[1a](#1a) | [1b](#1b) | [2a](#2a) | [2b](#2b) | [3a](#3a) | [3b](#3b) | [41](#41) | [4b](#4b) | [5a](#5a) | [5b](#5b) | [6a](#6a) | [6b](#6b) | [7](#7)

## 1a,

>Define two parts of ADT definition (2016-Spring/1a)

- A ADT consists of two parts:-
    - Public or external part
        - This part of ADT consists of the conceptual picture (i.e the user's view of what the object looks like, how the structure is organized) and the conceptual operations (i.e what user can do with the ADT)
    - Private or internal part
        - This part of ADT consists of the representation (i.e how the structure is actually stored) and the implementation of the operation (i.e the actual code) 

>Rational number as an ADT

- In mathematics, a rational number is the quotient of two integers where the divisor is not zero. In other words a function a/b where a and b are both integers and b ≠ 0. Since the values and operations of a rational number can be defined independently of computer terminology, it is an ADT.

## 1b,

>Difference between infix, prefix and postfix expression (2016-spring/1b)

|Infix expression|Prefix expression|Postfix expression|
|--|--|--|
|The expression in which the operators are in between the operands is called infix expression.|The expression in which the operators are ahead of the operands is called prefix expression.|The expression in which the operators are after the operands is called postfix expression.|
|< operand >< operator >< operand > syntax is followed.|< operator >< operand >< operand > syntax is followed.|< operand >< operand >< operator > syntax is followed.|
|It is easy to understand by humans.|It is easy to understand by computers.|It is easy to understand by computers.|
|The expression consists of brackets.|The expression doesn’t consist of brackets.|The expression doesn’t consist of brackets.|
|It is also called an arithmetic expression.|It is called polish notation.|It is called reverse polish notation.|


>Algorithm for evaluating Postfix expression

    Step 1: Initialize a empty stack
    Step 2: Read the characters from left to right one by one
            If ( the character is operand ) Push to the stack
            If ( the character is operator ) Pop the top two operands from the stack and do the operation (B operator A) and push the result back to the stack.
    Step 3: Repeat step 2 until all the characters are read.
    Step 4: End.


2a,

>Define circular Queue (2016-Spring/2a)

- A circular queue is one type of queue where the last location of the queue ( i.e if we have n size queue ) then nth location is connected back to the first location. 
- It overcomes the problem of unutilized space of linear queue by adding a new data to the queue at the place from where a data was deleted.

>Difference between stack and queue

|Stack|Queue|
|--|--|
|It is a type of linear list where insertion and deletion takes place from the same point called the top of stack(TOS).|It is a type of linear list where insertion takes place at the rear and deletion takes place at the front of the queue.|
|It works in LIFO manner (Last-In-First-Out)|It works in FIFO manner (First-In-First-Out)|
|Insertion operation is called push and deletion operation is called pop.|Insertion operation is called enqueue and deletion operation is called dequeue.|
|Only one pointer (i.e tos) is used to do the operation in stack.|Two pointers (i.e front and rear) are used to do the operation in a queue.|


## 2b,

>List basic five operations of linked list (2016-Spring/2b)

- Linked list is a type of list where each node or data consists of a pointer that points to the next data or node. The 5 basic operations in linked list are:-
    - Insertion: It is the process of adding a new node or data at the beginning of the linked list.
    - Deletion: It is the process of deleting a node or data from the beginning of the linked list.
    - Display: It is the process of displaying all the nodes or datas currently at the linked list.
    - Search: It is the process of searching a data or node using the given key.
    - Delete: It is the process of deleting a node or data using the given key. 

>Algorithm for inserting an element into a contiguous list

    Step 1: If lastend = Max - 1
            Declare full and Exit
    Step 2: If lastend = -1
            Pos = 0
    Step 3: If lastend > -1
            Read Position(Pos)
    Step 4: If Pos > lastend+1
            Declare out of range and exit
    Step 5: Read data ‘X’
    Step 6: [right shift operation]
            t  = lastend
            while(t >= Pos){
            C_list[t+1] = C_list[t]
            t = t-1
            }
            Lastend++
            C_list[Pos] = x;
    Step 7: End

## 3a,

>Define Enqueue

- It is the process of inserting or adding  new data to the queue from the rear of the queue.

>Define Dequeue

- It is the process of deleting data from the queue.

>4 types of dequeue with examples

- A Deque(Double ended queue) is a type of queue where insertion and deletion can take place from both ends of the queue.
- The 4 types of dequeue in Double ended queue are:-
    - Dinject: It is the process of inserting data from the rear of the queue.
    - Dpop: It is the process of deleting data from the front of the queue.
    - Dpush: It is the process of inserting data from the front of the queue.
    - Deject: It is the process of deleting data from the rear of the queue.

3b,

>Explain B+ tree

- B+ tree is a generalized form of BST (Binary Search Tree) where all the datas are present only at the leaf nodes and all the internal nodes contain the index pointing to the data, also the leaf nodes are connected with each other with a linked list.

>Application

- It is used to store large amounts of data which cannot be stored in main memory.
- It is used to make trees have faster operation in insertion, deletion and search.
- It is used in database indexing
- It is used in Multilevel indexing

>Algorithm to delete element from B+ tree

    Step 1: Traverse up to the leaf node where the data is present.
    
    Step 2: If ( the node has more than minimum number of keys it can hold ) then simply delete the key/data.
    
    Step 3: If ( the node has the exact number of keys it can hold ) then delete the key and borrow a key from immediate sibling also make the median key of the sibling node the parent node.
    
    Step 4: If ( the node has more than minimum number keys it can hold and the key is present at the internal node also ) then delete the key from the leaf as well as internal node and make the inorder successor fill up the internal node.
    
    Step 5: If ( the node has the exact number of keys it can hold and the key is present at the internal node also ) then delete the key and borrow a key from the immediate sibling through the parent and fill the empty internal node with the borrowed key.
    
    Step 6: If ( the node has the exact number of keys it can hold and the key is present at the internal node above immediate parent node ) then delete the key, merge the empty space with its siblings and fill the grandparent node with the inorder successor.
    
    Step 7: If ( the node has the exact number of keys it can hold and the key is present at the internal node and there is no immediate successor ) then delete the key and move the grandparent node a step down to make a parent node. [ it shrinks the height of B+ tree ]

## 4a,

>Make binary tree whose pre-order is (FAEKCDHGB) and in-order is (EACKFHDBG)

    Step 1: From the pre-order we can find the first node is root (i.e F)
    Step 2: From the in-order we can say E,A,C,K are left subtree and H,D,B,G are the right subtree of the root node.
    Step 3: Read the next node from pre-order and place to the left or right of the root node looking at the in-order sequence.
    Step 4: Repeat step 3 for all the remaining nodes.
    Step 5: End

![Figure: Binary Tree]() 

## 4b,

>What is a height balanced tree?

- Height balanced tree is a type of Binary tree that has balanced height i.e the difference between height of left subtrees and height of right subtrees is not more than 1

>Draw AVL tree for (3,2,1,4,5,6,7)

![Figure: AVL Tree]()

## 5a,

>Hash function

- A Hash function is a special type of hashing function that generates smaller keys from the given set of larger keys that can be used for indexing in a hash table.

>Using division method

We use 97 as the divider and and use k mod 97 function

|34|4205|
|--|--|
|16|3605|
|17|7777|
|37|8282|
|60|7626|
|40|0234|
|00|2522|
|87|5228|
|34|5175|
|32|1002|

>Using mid-square method

|82|4205|
|--|--|
|96|3605|
|81|7777|
|91|8282|
|55|7626|
|07|0234|
|00|2522|
|31|5228|
|80|5175|
|04|1002|

>Using folding method

|47|4205|
|--|--|
|41|3605|
|54|7777|
|64|8282|
|02|7626|
|36|0234|
|47|2522|
|80|5228|
|26|5175|
|12|1002|

## 5b,

>Selection sort

- Selection sort is a type of comparison sort in which the 0th element (1st position) is compared with all the other elements and if the 0th element is greater than the compared one they are interchanged.
- This process is repeated again for 2nd position element and so on. 

>Sort the following data using heap sort (31,41,5,9,36,53,58,97)

![Image solving with heap sort]()

## 6a,

>Warshall’s algorithm to find the transitive closure of a digraph

    Step 1: Make a copy of the adjacency matrix of the digraph.
    Step 2: Find paths from every vertex to another vertex and make pairs.
    Step 3: For a edge(one vertex to another) if it contains at least one or more path or pairs then put 1 in the matrix if not put 0
    Step 4: End

>Draw digraph and find matrix T of transitive closure for that digraph
A = [(0100)(0010)(0001)(1000)]

    Let's suppose the vertices are a, b,c and d then the digraph is

    Its transitive closure is
    T = 

||a|b|c|d|
|--|--|--|--|--|
|**a**|1|1|1|1|
|**b**|1|1|1|1|
|**c**|1|1|1|1|
|**d**|1|1|1|1|

## 6b,

>Shortest path algorithm

- Shortest path algorithm is an algorithm that specifies the path from one vertex to another vertex in a weighted graph such that the sum of the edges it took is minimized.
- Examples of shortest path algorithms are Dijkstra algorithm, Bellman-Ford algorithm, Floyd-warshall algorithm, etc.

>Find shortest part from C to E using Dijkstra Algorithm

![Question image]()

    Step 1: Set the distance from C to all the other vertices as infinity and to C as 0
    Step 2: Visit the unvisited neighbour of the current vertex and calculate the distance. If the new distance is less than the previous distance then update the distance of that vertex also update their previous vertex as the current vertex.
    Step 3: Select the next unvisited vertex which has the smallest distance till now.
    Step 4: Repeat step 2 and 3 until all the vertices are visited.

    1st visit: Visited vertices = [ C ], unvisited vertices = [ A, B, D, E, F, G ]
        Distances 
    C to C = 0
    C to A = 4, [C] // [C] is previous vertex
    C to B = infinity
    C to D = 2 [C]
    C to E = infinity
    C to F = 5 [C]
    C to G = infinity
    2nd visit: Visited vertices = [ C, D ], unvisited vertices = [ A, B, E, F, G ]
        Distances 
    C to C = 0
    C to A = 3 [D]
    C to B = 5 [D]
    C to D = 2 [C]
    C to E = 9 [D]
    C to F = 5 [C]
    C to G = 6 [D]
    3nd visit: Visited vertices = [ C, D, A ], unvisited vertices = [ B, E, F, G ]
        Distances 
    C to C = 0
    C to A = 3 [D]
    C to B = 5 [D]
    C to D = 2 [C]
    C to E = 9 [D]
    C to F = 5 [C]
    C to G = 6 [D]
    4th visit: Visited vertices = [ C, D, A , B], unvisited vertices = [ E, F, G ]
        Distances 
    C to C = 0
    C to A = 3 [D]
    C to B = 5 [D]
    C to D = 2 [C]
    C to E = 9 [D]
    C to F = 5 [C]
    C to G = 6 [D]
    5th visit: Visited vertices = [ C, D, A, B, F ], unvisited vertices = [ E, G ]
        Distances 
    C to C = 0
    C to A = 3 [D]
    C to B = 5 [D]
    C to D = 2 [C]
    C to E = 9 [D]
    C to F = 5 [C]
    C to G = 6 [D]
    6th visit: Visited vertices = [ C, D, A B, F , G], unvisited vertices = [ E ]
        Distances 
    C to C = 0
    C to A = 3 [D]
    C to B = 5 [D]
    C to D = 2 [C]
    C to E = 9 [D]
    C to F = 5 [C]
    C to G = 6 [D]
    7th visit: Visited vertices = [ C, D, A B, F, G, E], unvisited vertices = [ ]	
        Distances 
    C to C = 0
    C to A = 3 [D]
    C to B = 5 [D]
    C to D = 2 [C]
    C to E = 9 [D]
    C to F = 5 [C]
    C to G = 6 [D]

    So the shortest distance from C to E is C -- D -- E whose total distance is equal to 9

## 7a,

>Priority Queue (2016-Spring/7a)

- Priority Queue is a collection of element such that each element has been assigned a priority and such that the order in which element are processed and deleted from follows the rules as:-
- An element with higher priority is processed before any elements of lower priority.
- Two elements with same priority are processed according to the order in which they are added to the queue.
- It can be of two types:-
    - Ascending priority queue
    - Descending priority queue

## 7b,

>Min vs Max heap (2016-Spring/7b)

- Heap is a special type of complete binary tree in which the values of the parent node are compared with the values in its children nodes.There are two types of heap, they are:-
    - **Min heap** is a type of heap in which the value of the parent node must be less than or equal to the values of its children nodes.
    - **Max heap** is a type of heap in which the value of the parent node must be greater than or equal to the values of its children nodes.



 7c,

>Tree traversal

- Tree traversal is the process of traveling from a node to another node reading all the datas available in a tree only once. 
- It is used when we want to search certain elements from the tree, either to find its location, or delete it from the tree.
- We use different types of traversal for traversing in trees. They are:-
    - **In-order** ( left - node - right ) Here we first visit the left subtree then the root node and the right subtree.
    - **Pre-order** ( node - left - right ) Here we first visit the root node, then the left subtree and the right subtree.
    - **Post-order** ( left - right - node ) Here we first visit the left subtree, then the right subtree and the root node.
