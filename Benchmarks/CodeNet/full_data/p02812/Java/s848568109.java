
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       int x = input.nextInt();
       String s = input.next();
       
        int c=0;
        for(int i = 0;i<x-2;i++){
            
           if(s.charAt(i)=='A'&&s.charAt(i+1)=='B'&&s.charAt(i+2)=='C'){
               c++;
               
           }
            
            
    
    }
        System.out.println(c);
    
}}
