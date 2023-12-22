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
        ArrayList<Long>al=new ArrayList<>();
        int i=1;
        long k=in.nextLong();
        int power=0;
        for (int j = 1; j < 10; j++) {
            al.add((long) j);
        }
        l:
        while(true){
            power++;
                for (int j = 1; j <= 9; j++) {
                    if(al.get(al.size() - 1) + Math.pow(10, power)>(long)1e15){
                        break l;
                    }
                    al.add((long) (al.get(al.size() - 1) + Math.pow(10, power)));
                }
        }
        if(k>al.size()){
            for (int j = 0; j < al.size(); j++) {
                System.out.println(al.get(j));
            }
        }else{
            for (int j = 0; j < k; j++) {
                System.out.println(al.get(j));
            }
        }

    }

    private static double sum(int i) {
        double sum=0;
        while(i>0){
            sum+=i%10;
            i=i/10;
        }
        return sum;
    }
}