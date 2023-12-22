// Java implementation of Kosaraju's algorithm to print all SCCs
import java.io.*;
import java.util.*;
import java.util.LinkedList;

// This class represents a directed graph using adjacency list
// representation
public class Main
{ // Driver method
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt(),k=in.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=in.nextInt();
        }
        if(k>=n){
            System.out.println(1);
        }else{
            int ans=1;
            int rem=n-k;
            int x=(int)Math.ceil((n-k)/((k-1)*1.0));
            System.out.println(x+ans);
        }
    }
}