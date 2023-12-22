import java.util.*;
import java.util.HashSet;
import java.util.Set;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        if(A<B){
        for(;;){
            String a=String.valueOf(A);
            char[]aa=a.toCharArray();
            if((aa[0]==aa[4])&&(aa[1]==aa[3])){
                break;
            }
            A++;
        }
        for(;;){
            String a=String.valueOf(B);
            char[]aa=a.toCharArray();
            if((aa[0]==aa[4])&&(aa[1]==aa[3])){
                break;
            }
            B--;
        }
        if(B>=A){
        System.out.println((B-A)/100+1);}}
        else{
            String a=String.valueOf(B);
            char[]aa=a.toCharArray();
            if((aa[0]==aa[4])&&(aa[1]==aa[3])){
                System.out.println(1);
            }else{
                System.out.println(0);
            }
        }
        
 
 
        }
       
        
    }