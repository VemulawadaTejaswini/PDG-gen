import java.io.*;
import java.util.*;

public class Main{
    public static void main (String args[]){
         int a = Integer.valueOf(args[0]);
         int b = Integer.valueOf(args[1]);
         EasyMod(a,b);
    }
    
    static void EasyMod(int a, int b){
        if ((args[0]*args[1]) % 2 == 0)
            System.out.println("Even");
        else 
            System.out.println("Odd")
    }
}
