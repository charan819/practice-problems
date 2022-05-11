//Height of Binary Tree 
//https://practice.geeksforgeeks.org/problems/height-of-binary-tree/1/?page=1&category[]=Tree&sortBy=submissions#

import java.util.LinkedList; 
import java.util.Queue; 
import java.io.*;
import java.util.*;
import java.lang.*; 


class Btheight {
    //Function to find the height of a binary tree.
    int height(Node node) 
    {
        // code here 
        if(node!=null){
            int lh=height(node.left);
            int rh=height(node.right);
            return 1+Math.max(lh,rh);
        }
        return 0;
    }
}
