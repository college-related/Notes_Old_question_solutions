# 2018-Fall

## 1a, 

>Abstract Data type(ADT)

- ADT is a useful tool for specifying the logical properties of the data type. The definition of ADT only mentions what operations are to be performed but not how these operations will be implemented. It does not specify how data will be organized in memory and what algorithms will be used for implementing the operations. ADT is a Black box that hides the inner structure and design of the data type. Since ADT hides the implementation of the data types only showing how to use them so, ADT is an abstract data type.

>What data structure are used in following areas:-

- **Print jobs:-**  They use queue data structures in their working process. Sometimes priority queue is also used as a working data structure.
- **Network model:-** They use graph-like structure for its data structure and are allowed to have more than one parent node.
- **Hierarchy model:-** They use tree-like structure for its data structure with a single root to which all the data is linked.

![Example image]()

## 1b, = 

>Advantage of Postfix expression over infix expression

- Any formula can be expressed without parenthesis.
- It is very convenient for evaluating formulas on a computer with stacks.
- Postfix expression doesn't have the operator precedence.
- Postfix is slightly easier to evaluate.
- It reflects the order in which operations are performed.
- You need to worry about the left and right associativity.
 
>Evaluate the given expression A*(B+C)-(D/E)  using Prefix notation

    Step 1:- Convert the given infix expression to prefix expression
	    Reverse the expression (E/D)-(C+B)*A

|Read|Stack|Output list|
|--|--|--|
|‘(‘|(||
|'E’|(|E|
|‘/’|(/|E|
|‘D’|(/|ED|
|‘)’ `since closing parenthesis is encountered the operators till the opening parenthesis is popped first`||ED/|
|‘-’|-|ED/|
|‘(’|-(|ED/|
|‘C’|-(|ED/C|
|‘+’|-(+|ED/C|
|‘B’|-(+|ED/CB|
|‘)’ `since closing parenthesis is encountered the operators till the opening parenthesis is popped first`|-|ED/CB+|
|‘*’|-*|ED/CB+|
|‘A’|-*|ED/CB+A|
|`since no more character to read remaining operators are popped and pushed to output list`||ED/CB+A*-|

    Step 2:- Evaluate the prefix expression {Given A=5, B=6, C=2, D=,12 E=4}
	    Put the expression one by one on the stack
	    If operator is encountered pop the top two operand and calculate as B..A
 
|Stack|Operation|Output|
|--|--|--|
|4||4|
|4,12||4,12|
|4,12,/|12/4=3|3|
|3,2||3,2|
|3,2,6||3,2,6|
|3,2,6,+|6+2=8|3,8|
|3,8,5||3,8,5|
|3,8,5,*|5*8=40|3,40|
|3,40,-|40-3|37|
 
## 2a, =

>Difference Between linear and circular queue

|Linear Queue|Circular Queue|
|--|--|
|In this queue the front and rear pointer points at different places.|In this queue the front and rear pointer points at the same place.|
|In this queue the last node is not connected to the first node.|In this queue the last node is connected to the first node to make a circle.|
|Pointers are updated by 1.|Pointers are updated by (P+1)%n , where P = pointer value, n = max value|
|For inserting data more than the size of the queue, the queue has to be empty first.|For inserting data more than the size of the queue, we can delete the first data and add the new data there.|
 
 
>Algorithm for insertion in circular queue

    Initialize front and rear as -1 and an array Q[max]
    Step 1: Start
    Step 2: if (front == (rear+1)%max)
        print error "Circular queue overflow"
    Step 3: else
        {
    rear = (rear+1)%max 
    Q[rear] = element;
        if(front == -1) f=0;
        }
    Step 4: stop
 
>Algorithm for deletion in circular queue

    Initialize element = 0 
    Step 1: Start
    Step 2: If((front == rear) && (rear == -1))
        print error "circular queue underflow"
    Step 3: else
        { 
    element = Q[front]
        If(front == rear) front = rear = -1
        Else
        front = (front+1)%max
        } 
    Step 4: End
 
 
 
## 2b, =

>Tower of hanoi for 4 discs

    Let us suppose top disc(t), lower to t (t+1), lower to t+1 (t+2) and bottom disc (n)
    Source (starting peg), aux (auxiliary peg) , dest (destination peg)
        Step 1: Move disc t from source to aux
        Step 2: Move disc t+1 from source to dest
        Step 3: Move disc t from aux to dest
        Step 4: Move disc t+2 from source to aux
        Step 5: Move disc t from dest to source
        Step 6: Move disc t+1 from dest to aux
        Step 7: Move disc t from source to aux
        Step 8: Move disc n from source to dest
        Step 9: Move disc t from aux to dest
        Step 10: Move disc t+1 from aux to source
        Step 11: Move disc t from dest to source
        Step 12: Move disc t+2 from aux to dest
        Step 13: Move disc t from source to aux
        Step 14: Move disc t+1 from source to dest
        Step 15: Move disc t from aux to dest
 
## 3a, =

>Differentiate between static and dynamic list

|Static list|Dynamic list|
|--|--|
|Memory allocation is done in compile time.|Memory allocation is done in runtime.|
|Data is stored in a stack.|Data is stored in heap.|
|Datas cannot be changed during the program.|Datas are determined during the program.|
|Max size is predetermined.|Max size of the list can be determined during program time.|
 
>Algorithm to insert node at the end of doubly linked list

    Step 1: Create a new node
    Step 2: t = start, where t is temporary variable
    Step 3: Traverse the tree until t->right = null
    Step 4: t->right = n
    Step 5: n->left = t

## 3b, = 

>Circular linked list

- Circular linked list is a type of linked list in which the next field of the last node is connected back to the first node.

>Algorithm for Insertion in a linked list At the first of list

    [start = points to the first node of the list]
    [->next points to next node address]
        Step 1: create a new node named (newnode)
        Step 2: newnode->next = start 
        Step 3: start = newnode
 
>Algorithm for Insertion in a linked list At the end of list

    Step 1: create a new node
    Step 2: t = start
    Step 3: while(t->next != NULL) { t=t->next }
    Step 4: t->next = newnode
 
>Algorithm for Insertion in a linked list At the given position or after a node

    Step 1: create a new node
    Step 2: read the position of the node given (p)
    Step 3: t = start
    Step 4: traverse the list up to position as
        while(t->next != p->next) { t = t->next }
    Step 5: newnode->next = t->next
    Step 6: t->next = newnode

>Algorithm for Deletion in a linked list From the first of list

    Step 1: t1 = start
    Step 2: start = start->next
    Step 3: delete(t1)

>Algorithm for Deletion in a linked list From the end of list

    Step 1: t = t1 = start
    Step 2: traverse t upto last node
        While (t->next != null) { t = t->next }
    Step 3: traverse the list up to t node
        While (t1->next != t) { t1 = t1->next } 
    Step 4: t1->next = t->next
    Step 5: delete(t)

>Algorithm for Deletion in a linked list From the given position

    Step 1: p = t1 = start
    Step 2: read the position of the node to be deleted (p)
    Step 3: traverse the list up to p-1 node 
        While ( t1->next != p ) { t1 = t1->next }
    Step 5: t1->next = p->next
    Step 6: delete(p)
 
## 4a, =

>Construct a BST tree of  (J,R,D,T,G,E,A,M,H,F,Q,U,B)

![BST constructed tree]()

`(V= visit a node, L=Visit the left subtree, R=visit the right subtree)`

>VLR (PreOrder)

    J,D,A,B,G,E,F,H,R,M,Q,T,U

>LVR (InOrder)

    A,B,D,E,F,G,H,J,M,Q,R,T,U

>LRV(PostOrder)

    B,A,F,E,H,G,D,Q,M,U,T,R,J
 
## 4b, =
 
>Structure definition to represent AVL
 
- AVL tree is a special type of BST tree that is a self-balancing height tree. In this tree every node must have height balanced, i.e the difference between height of left subtree and right subtree is no more than 1.
 
>Create AVL tree with the following data (3,5,118,4,1,12,7,2)

![AVL tree constructed]()

## 5a, =

>Use quick sort to sort the following data (43, 16, 11, 89, 35, 47, 1, 92)

    We take a pivot point, usually the first data and divide the remaining datas either to left if small than pivot or to right if greater than pivot.
        16, 11, 1, 35, `43`, 89, 47, 92
    Repeat the same process in the sub groups
        11, 1, `16`, 35, `43`, 47, `89`, 92
        1, `11`, `16`, `35`, `43`, `47`, `89`, `92`

## 5b, = 

>Collision in hashing

- Hashing is the process of making tables or lists of data using hash functions that convert the given key into smaller key that is used for indexing the table.
- A situation in which a newly inserted data maps to an already occupied slot in the table is called collision hashing

>Collision resolving technique

- To handle collision we have two main techniques:-
    - Open hashing (Separate chaining)
        - It is the method in which each cell of the table where collision occurs points to a linked list.
        - It is used mostly when we don’t know the number of datas to be inserted or deleted.
        - Advantage:-
            - It is simple to implement.
            - Hash table never fills up.
        - Disadvantage:-
            - If the chain becomes long, searching time becomes long.
            - Uses extra spaces for links
    - Closed hashing (Open addressing)
        - It is the method in which each data is stored in the hash table itself.
        - It is used when the number of datas to be inserted or deleted is known.
        - Advantage:-   
            - No extra spaces for links.
            - Every slot of the hash table is used.
        - Disadvantage:-
            - It requires more computation.
            - Clustering and load factor may occur.
        - There are three ways of obtaining Closed hashing:-
            - Linear probing
                - It is the method in which probing (Searching for next empty slot) is linear.
                - Clustering occurs while using this method as more collision occurs.
            - Quadratic probing
                - It is the method in which probing is quadratic.
                - It works in i2 in i’th iteration.
            - Double hashing
                - It is the method in which a second hashing function is done for the same key.
                - Clustering is not encountered but time for 2 hashing functions is more.
  
## 6a, =

>Spanning tree

- Spanning tree is a subset of a tree that contains all the nodes in the parent tree and have no cyclic graph formed.
 
>Find the minimum spanning tree of the graph using kruskal’s algorithm

    We have number of vertices (V) = 6
        Step 1: Sort all the edges in ascending order.
        (2,3), (2,4), (3,4), (6,2), (6,4), (1,2), (5,4), (1,5), (1,6), (5,6)
        Step 2: Take the smallest edge (2,3) and repeat taking the next small edge.
            If new edge forms a cycle then take the next small edge and check for cyclic.
        (2,3), (2,4), (2,6), (2,1), (4,5)

![Spanning tree figure]()

        It has (V-1) = 6-1 = 5 edges
 
## 6b, =

>BFS (Breadth First Search)

- BFS is a way of traversing in the graph, where we start from the node we want to start searching from (Usually root node) and visit all its unvisited neighbour nodes in that depth before moving to the next depth level of the node.
- In this traversal all the nodes from a level are visited first before moving to more deep level.

>DFS (Depth First Search)

- DFS is a way of traversing in the graph, where we start from the node we want to start searching from (Usually root node) and visit all its children nodes moving to the next depth level of the node, then coming back to move to the next unvisited neighbour’s children nodes.  
- In this traversal nodes from the deepest level are visited first and move backup to visit next neighbour nodes.

- Example:

![A graph figure]()

    In BFS: A,B,C,D,E,F,G,H,I
    In DFS: A,B,E,F,C,G,H,I,D
 
## 7a, = 

>Divide and conquer algorithm

- Divide and conquer algorithm is a type of algorithm in which we divide the given sets of data into sub groups and repeat the same algorithm within those sub groups until we get the desired output.
- Some of the divide and conquer algorithm are:- quick sort, merge sort, etc


## 7b, = 

>Radix sort

- It is a type of sort in which the numbers are sorted comparing the digits according to their positions.
- It can be used to sort only positive numbers.
- Each position is compared in a pass, from ones to tens to hundreds to so on.
- It is also called as bucket sort as the numbers are compared and put at a bucket from 0 - 9


## 7c, =

>Worst case complexity

- Worst case complexity is a method that measures the resources(i.e running time, memory, etc) of an algorithm for the given number of inputs.
- It gives an upper bound of the algorithm determining the maximum time an algorithm is running or maximum memory usage it does.
- It is used to check the efficiency of two or more algorithms for a given number of inputs.
