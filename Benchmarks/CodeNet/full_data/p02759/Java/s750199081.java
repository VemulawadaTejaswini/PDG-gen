
package javaapplication30;

import java.util.Scanner;

public class JavaApplication30 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);   
        int n=sc.nextInt();
        if(n%2!=0)
            n=n/2+1;
        else 
            n=n/2;
        System.out.println(n);
    }
    
}
