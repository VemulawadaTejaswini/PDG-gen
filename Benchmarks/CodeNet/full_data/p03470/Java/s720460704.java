import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    static HashMap<String,Integer>dp;
    public static void main(String []args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int i=0;
        HashSet<Integer>set=new HashSet<>();
        while(n-->0){
            int a=in.nextInt();
            set.add(a);
        }
        System.out.println(set.size());
    }
}




