import java.util.*;
import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner stdIn=new Scanner(System.in);
        long N=stdIn.nextInt();
        long A=stdIn.nextInt();
        long B=stdIn.nextInt();

        
        long tt=(N-2)*(B-A)+1;
        if(tt<0){
            System.out.println(0);
        }else{
            System.out.println(tt);
        }
    }
}