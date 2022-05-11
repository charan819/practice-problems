//Sorting Elements of an Array by Frequency 
//https://practice.geeksforgeeks.org/problems/sorting-elements-of-an-array-by-frequency-1587115621/1/?page=6&category[]=Arrays&sortBy=submissions#


import java.util.*;
import java.io.*;
import java.lang.*;
import java.util.Map.Entry;








class freqSort
{
    //Function to sort the array according to frequency of elements.
    static ArrayList<Integer> sortByFreq(int arr[], int n)
    {
        // add your code here
        ArrayList<Integer> ar=new ArrayList<Integer>();
        HashMap<Integer,Integer> hs=new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++)
        hs.put(arr[i],hs.getOrDefault(arr[i],0)+1);
        PriorityQueue<Integer>pq=new PriorityQueue<>((a,b)->{
            if(hs.get(b)==hs.get(a))
                return a-b;
            return hs.get(b) - hs.get(a);
        });
        for(int rn:hs.keySet())
        {
            pq.add(rn);
        }
        while(pq.size()>0){
            int fre=pq.poll();
            for(int j=0;j<hs.get(fre);j++){
                ar.add(fre);
            }
        }
        return ar;
    
        
        
    }
}