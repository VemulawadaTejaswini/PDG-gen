import java.util.*;
import java.util.HashSet;
import java.util.Set;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        for(;;){}
            String a=String.valueOf(A);
            char[]aa=a.toCharArray();
            if((aa[0]==aa[4])&&(aa[1]==aa[3])){
                break;
            }
            A++;
        }
        for(;;){
            if(B>=10000){
            String a=String.valueOf(B);
            char[]aa=a.toCharArray();
            if((aa[0]==aa[4])&&(aa[1]==aa[3])){
                break;
            }}else{
                break;
            }
            B--;
        }
        System.out.println((B-A)/100+1);


        }
       
        
    }
