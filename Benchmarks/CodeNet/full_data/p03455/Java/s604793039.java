import java.io.*;
import java.util.*;

public class Main{
    public static void main (String args[]){
         EasyMod(Integer.valueOf(args[0]), Integer.valueOf(args[1]));
    }
    
    static void EasyMod(int a, int b){
        if ((a*b) % 2 == 0)
            System.out.println("Even");
        else 
            System.out.println("Odd");
    }
}
