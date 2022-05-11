//reverse a linked list
//https://practice.geeksforgeeks.org/problems/reverse-a-linked-list/1/?page=1&category[]=Linked%20List&sortBy=submissions#


import java.util.*;
import java.io.*;





class revLL
{
    //Function to reverse a linked list.
    Node reverseList(Node head)
    {
        // code here
        Node prev=null;
        Node Next=null;
        Node c=head;
        while(c!=null){
            Next=c.next;
            c.next=prev;
            prev=c;
            c=Next;
        }
        head=prev;
        return head;
    }
}
