import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        x=x+y;
        y=x-y;
        x=x-y;

        x=x+z;
        z=x-z;
        x=x-z;

        System.out.println(x + " " + y + " " + z);
        
        sc.close();
    }

    // public static int[] swap(int a, int b){
    //     int[] arr = new int[2];
    //     a=a+b;
    //     b=a-b;
    //     a=a-b;
    //     arr[0]=a;
    //     arr[1]=b;
    //     return arr;
    // }

}



