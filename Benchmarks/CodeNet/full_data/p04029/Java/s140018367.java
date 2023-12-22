package cont;

import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        int s = 0;
        int a = input.nextInt();
        for (int i=1; i <= a ; i++)
            s = s + i;
        
        System.out.println(s);
    }
    
}