import java.util.*;
import java.util.Arrays;
import java.util.Set;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
       int A=sc.nextInt();
       int B=sc.nextInt();
       int C=sc.nextInt();
       int D=sc.nextInt();
       int E=0;
       if(A>=B){
           E=B;
       }else{
           E=A;
       }
       int F=0;
       if(C>=D){
           F=D;
       }else{
           F=C;
       }
       System.out.println(E+F);


        

       
        
    }}