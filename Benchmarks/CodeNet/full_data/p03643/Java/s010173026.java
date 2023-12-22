import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        if(n<10) System.out.println("ABC00"+n);
        else if(n<100) System.out.println("ABC0"+n);
        else System.out.println("ABC"+n);
    }
    
}
