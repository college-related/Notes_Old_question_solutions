# 2017-Fall

[1a](#1a) | [1b](#1b) | [2a](#2a) | [2b](#2b) | [3a](#3a) | [3b](#3b) | [41](#41) | [4b](#4b) | [5a](#5a) | [5b](#5b) | [6a](#6a) | [6b](#6b) | [7](#7)

## 1.a 

>ADT

[2018-sp-1a]()

>Different primitive operation on data structure

- Push operation
    - It is the process of adding or inserting data items into the data structure.
    - It can be done at the top, rear, etc of the data structure as needed.
    - We need to check for the availability of empty slots in the data structure before pushing an item.
- Pop Operation
    - It is the process of removing or deleting data items from the data structure.
    - It can be done at the top , front ,rear, etc of the data structure as needed.
    - We need to check if the data structure is empty or not before popping an item.


## 1.b =

>Difference between data structure and data types

|Data structure|Data types|
|--|--|
|Data structure is the collection that holds data which can be manipulated and used in programming so that operations and algorithms can be more easily applied.|Data type is the representation of nature and type of data that has been going to be used in programming or in other words data type describes all that data which share a common property.|
|Data Structures in programming are implemented in concrete implementation as their definition is already defined by the language that what type of data they are going to store and deal with.|Data types in programming are implemented in abstract implementation whose definition is provided by different languages in different ways.|
|In Data structure the data is assigned to using some set of algorithms and operations like push, pop and so on.|In case of data type the value of data is not stored as it only represents the type of data that can be stored.|
|Time complexity comes in the case of data structure as it mainly deals with manipulation and execution of logic over data that it stores.|In case of data type only type and nature of data is concerned then there is no issue of time complexity

>Linear data structure

- Linear data structure is that kind of data structures which have data elements connected sequentially.
- All the elements are present at a single level.
- Examples:- Array, list, Queue, etc

>Non-Linear data structure

- Non-Linear data structure is that kind of data structure which has data elements connected hierarchically.
- Elements are present at multiple levels.
- Examples:- Map, Tree, Graph, etc

## 1.c =

>Application of stack

- In computing field
    - It is used to evaluate post, pre and infix expressions.
    - It is used to do syntax parsing.
    - It is used for proper parenthesis opening and closing check.
    - It is used to reverse strings.
- In non-computing field
    - Stacking plates in a cupboard.
    - Parking cars in a one car width garage.

>Condition to check if the element is last in a linear queue

    Suppose the element is e, the queue is Q[] with front and rear pointers then
	If ( e == Q[rear] )
		Print “The element is last element”
	Else
		Print “The element is not last element”

>Check the total number of elements in a queue

    Suppose a queue Q[ ] , with max size (m), then total elements (total)
	For (int i=0; i<m; i++){
		total++;
	}

## 2.a =

>Algorithm to convert infix to postfix expression

    Step 1: Initialize an empty stack and output list
    Step 2: Read the characters from the infix expression
        If (character == operand) push to the output list
        if(character == operator) push to the stack

    Step 3: If the operator has lower or equal precedence than that of the previous operator in the stack then the previous operator is popped and pushed to the output list.
        If the operator is closing bracket then pop all the operators in the stack until the opening bracket is found.
    Step 4: Repeat Step 2 and 3 until all the character is read
    Step 5: Finally pop all the operators from the stack and push to the output list.

>Convert the abc-+de-fg-h+/* postfix expression to infix expression

|Read|operation|Output|
|--|--|--|
|‘a’||a|
|‘b’||ab|
|‘c’||abc|
|‘-’|(b-c)|a(b-c)|
|‘+’|a+(b-c)|{a+(b-c)}|
|‘d’||{a+(b-c)}d|
|‘e’||{a+(b-c)}de|
|‘-’|(d-e)|{a+(b-c)}(d-e)|
|‘f’||{a+(b-c)}(d-e)f|
|‘g’||{a+(b-c)}(d-e)fg|
|‘-’|(f-g)|{a+(b-c)}(d-e)(f-g)|
|‘h’||{a+(b-c)}(d-e)(f-g)h|
|‘+’|(f-g)+h|{a+(b-c)}(d-e){(f-g)+h}|
|‘/’|(d-e)/{(f-g)+h}|{a+(b-c)}[(d-e)/{(f-g)+h}]|
|‘*’|{a+(b-c)}*[(d-e)/{(f-g)+h}]|{a+(b-c)}*[(d-e)/{(f-g)+h}]|


## 2.b =

>What is a double ended queue?

- Double ended queue is a more generalized form of linear queue where insertion and deletion can take place from both rear and front end.
- It will have two insertion operations they are:-
    - Push to front
    - Push to rear
- And two deletion operations they are:-
    - Pop from front
    - Pop from rear

>Advantage of circular queue over linear queue

- It takes up less memory than the linear queue.
- A new item can be inserted in the location from where a previous item is deleted.
- Infinite number of elements can be added continuously but deletion must be used.

>Algorithm for traversing in circular queue

    Suppose queue is Q[ ] , Max size (Max), front and rear pointers

    Step 1: if ( ( front == -1) && (rear == -1) )
        Print “Queue underflow” Go to step 3
    Step 2: if ( front < rear )
        For (i = front; i <= rear; i++)
            Q[ i ];
        Else
            For (i = front; i <= Max; i++)
                Q[ i ];
            For (i = 0; i <= rear; i++)
                Q[ i ];
                i++;

    Step 3: End


## 3.a =

>Advantages of Linked list

- Linked list is a dynamic data structure so it can grow and shrink at runtime by allocating and deallocating memory.
- Insertion and deletion of nodes are really easier. 
- Data structures such as stack and queues can be easily implemented using linked list.
- As the size of the linked list can increase or decrease at run time so there is no memory wastage.

>Disadvantages of Linked list

- Elements or nodes traversal is difficult in a linked list.
- In linked list reverse traversing is really difficult.
- More memory is required to store elements in the linked list as compared to array.

>Algorithm to delete a specific node from the linked list

[already 2.b = (2018-Spring)]()

## 3.b =

>Application of linked list

- Implementation of stacks and queues
- Performing arithmetic operations on long integers
- Manipulation of polynomials by storing constants in the node of linked list
- Implementation of graphs

>Addition of two polynomials using linked list

    #include <iostream>
    using namespace std;

    class polyll {
    private:
        struct polynode {
            float coeff;
            int exp;
            polynode* link;
        } * p;

    public:
        polyll();
        void poly_append(float c, int e);
        void display_poly();
        void poly_add(polyll& l1, polyll& l2);
        ~polyll();
    };
    polyll::polyll()
    {
        p = NULL;
    }
    void polyll::poly_append(float c, int e)
    {
        polynode* temp = p;
        if (temp == NULL) {
            temp = new polynode;
            p = temp;
        }
        else {
            while (temp->link != NULL)
                temp = temp->link;
            temp->link = new polynode;
            temp = temp->link;
        }
        temp->coeff = c;
        temp->exp = e;
        temp->link = NULL;
    }
    void polyll::display_poly()
    {
        polynode* temp = p;
        int f = 0;

        cout << endl; while (temp != NULL) { if (f != 0) { if (temp->coeff > 0)
                    cout << " + ";
                else
                    cout << " "; } if (temp->exp != 0)
                cout << temp->coeff << "x^" << temp->exp;
            else
                cout << temp->coeff;
            temp = temp->link;
            f = 1;
        }
    }
    void polyll::poly_add(polyll& l1, polyll& l2)
    {
        polynode* z;
        if (l1.p == NULL && l2.p == NULL)
            return;
        polynode *temp1, *temp2;
        temp1 = l1.p;
        temp2 = l2.p;
        while (temp1 != NULL && temp2 != NULL) {
            if (p == NULL) {
                p = new polynode;
                z = p;
            }
            else {
                z->link = new polynode;
                z = z->link;
            }
            if (temp1->exp < temp2->exp) {
                z->coeff = temp2->coeff;
                z->exp = temp2->exp;
                temp2 = temp2->link;
            }
            else {
                if (temp1->exp > temp2->exp) {
                    z->coeff = temp1->coeff;
                    z->exp = temp1->exp;
                    temp1 = temp1->link;
                }
                else {
                    if (temp1->exp == temp2->exp) {
                        z->coeff = temp1->coeff + temp2->coeff;
                        z->exp = temp1->exp;
                        temp1 = temp1->link;
                        temp2 = temp2->link;
                    }
                }
            }
        }
        while (temp1 != NULL) {
            if (p == NULL) {
                p = new polynode;
                z = p;
            }
            else {
                z->link = new polynode;
                z = z->link;
            }
            z->coeff = temp1->coeff;
            z->exp = temp1->exp;
            temp1 = temp1->link;
        }
        while (temp2 != NULL) {
            if (p == NULL) {
                p = new polynode;
                z = p;
            }
            else {
                z->link = new polynode;
                z = z->link;
            }
            z->coeff = temp2->coeff;
            z->exp = temp2->exp;
            temp2 = temp2->link;
        }
        z->link = NULL;
    }
    polyll::~polyll()
    {
        polynode* q;
        while (p != NULL) {
            q = p->link;
            delete p;
            p = q;
        }
    }
    int main()
    {
        polyll p1;
        p1.poly_append(1.4, 5);
        p1.poly_append(1.5, 4);
        p1.poly_append(1.7, 2);
        p1.poly_append(1.8, 1);
        p1.poly_append(1.9, 0);
        cout << "\nFirst polynomial:";
        p1.display_poly();
        polyll p2;
        p2.poly_append(1.5, 6);
        p2.poly_append(2.5, 5);
        p2.poly_append(-3.5, 4);
        p2.poly_append(4.5, 3);
        p2.poly_append(6.5, 1);
        cout << "\nSecond polynomial:";
        p2.display_poly();
        polyll p3;
        p3.poly_add(p1, p2);
        cout << "\nResultant polynomial: ";
        p3.display_poly();
        getch();
}


## 4.a =

>BST construction (39, 45, 30, 60, 42, 35, 25, 32, 44)

![Image of constructed BST tree]()

**InOrder:-** 25, 30, 32, 35, 39, 42, 44, 45, 60

**PreOrder:-** 39, 30, 25, 35, 32, 45, 42, 44, 60

**PostOrder:-** 25, 32, 35, 30, 44, 42, 60, 45, 39


## 4.b =

>What is a weight balanced tree?

- A weight balanced tree is a binary tree that has balanced weight that is the difference between the left subtree leaves to the right subtree leaves is not more than 1.
- Leaves refer to the node in the tree which doesn’t have any child.
- Example:- 𝝰-weight balanced-tree, etc  

>AVL tree construction in InOrder (BRIJESH, FIZZA, IMRAN, NAVIN, LOVELY, PRITY, SAMIT)

![Image of AVL tree]()

## 5.a =

>Difference between iteration and recursion in contrast of “Fibonacci sequence using recursion is not as efficient as compare with iteration”

- Memory management becomes difficult when using recursion in the series as the function has to be called over and over again.
- Algorithms can be much easier when used in iteration rather than recursion.
- Execution time will be much faster when using iteration than recursion.

## 5.b =

>Stable sorting

- A sorting algorithm is said to be stable if two objects with equal keys appear in the same order in sorted output as they appear in the input array to be sorted.
- Example:- Merge sort, Bubble sort, insertion sort, etc

>Unstable sorting

- A sorting algorithm is said to be unstable if two objects with equal keys appear in the different order in sorted output as they appear in the input array to be sorted.
- Example:- Quick sort, heap sort, etc

>Quick sort algorithm for (25,30,18,16,45,40,60,20,10,7,30,100,12,14)

    - 18,16,20,10,7,12,14, `25` , 30, 45, 40, 60, 30,100
    - 16, 10, 7, 12, 14, `18`, 20, `25`, `30`, 45, 40, 60, 30, 100
    - 10, 7, 12, 14, `16`, `18`, `20`, `25`, `30`, 40, 30, `45`, 60, 100
    - 7, `10`, 12, 14, `16`, `18`, `20`, `25`, `30`, `30`, 40, `45`, `60`, 100
    - 7, 10, 12, 14, 16, 18, 20, 25, 30, 30, 40, 45, 60, 100

## 6.a =

>Compare set matrix and linked list representation of graph

|Set matrix representation(Adjacency matrix)|Linked list representation(Adjacency list)|
|--|--|
|This representation makes use of the VxV matrix. Where V is the number of vertices in the graph.|In this representation, for every vertex we store its neighbours in a linked list.|
|Space required in worst case is O(V2).|Space required in worst case is O(V+E)|
|In order to add a new vertex to VxV matrix the storage must be increases to (V+1)2.|In order to add a new vertex we add a new node with a pointer next pointing to the neighbour vertex.|
|To add an edge say from i to j, matrix[i][j] = 1|We check the availability of the vertices and add linked nodes accordingly.|

>Difference between traversing in graph and traversing in tree

|Traversing in Graph|Traversing in Tree|
|--|--|
|Graphs can have unidirectional and bidirectional Path between vertices.|Trees can have only one path between any two vertices.|
|We use BFS (Breadth First Search) and DFS (Depth First Search) traversing in Graphs.|We use in-order, pre-order and post-order traversing in Trees.|
|It has a network model.|It has a hierarchy model.|
|It can have loops and self-loops. Making traversing difficult.|It cannot have loops and self-loops.Hence traversing is easy compared to graphs.|


## 6.b =

>Use division method as hash function, linear probing and chaining method for resolving collision in a hash table with 10 positions. (76,26,37,59,21,65,75,49,11)

By using division method

    (76 mod 10) = 6
    (26 mod 10) = 6
    (37 mod 10) = 7
    (59 mod 10) = 9
    (21 mod 10) = 1
    (65 mod 10) = 5
    (75 mod 10) = 5
    (49 mod 10) = 9
    (11 mod 10) = 1


**Using chaining method**

|0|||
|--|--|--|
|1|21|11|
|2||
|3||
|4||
|5|65|75|
|6|76|26|
|7|37|
|8||
|9|59|49|

**Using linear probing method** (hash + i)%10 where i = 1,2,3,..

|0|75|
|--|--|
|1|21|
|2|49|
|3|11|
|4||
|5|65|
|6|76|
|7|26|
|8|37|
|9|59|

## 7.a =

>Heap sort

- Heap sort is a comparison based sorting technique based on Binary Heap data structure. It is similar to selection sort where we first find the maximum element and place the maximum element at the end. We repeat the same process for the remaining element.
- Algorithm for heap sort:-
    - Build a max heap from the input data.
    - At this point, the largest item is stored at the root of the heap. Replace it with the last item of the heap followed by reducing the size of heap by 1.
    - Repeat above steps while the size of the heap is greater than 1.

## 7.b =

>Transitive closure

- Transitive closure is the set of relation (r*) in a graph G that contains all the possible direct links from one vertex to another if they are linked in some way in as minimum relations as possible. Where the set of relation (r)  is the subset of (r*)

![Transitive closure example image]()

## 7.c =

>Big OH notation

- Big o notation is a notation used to describe the performance and complexity of an algorithm.
- It specifically denotes the worst case scenario and can be used to describe the execution time required on the space used by the algorithm.
- It is helpful in the sense that it helps to build much more efficient algorithms for certain tasks in programs.
