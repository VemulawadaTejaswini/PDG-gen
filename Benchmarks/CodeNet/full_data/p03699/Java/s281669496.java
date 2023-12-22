import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(in);
    int n = sc.nextInt();
    int[] s=new int[n];
    for (int i = 0; i < n; i++) {
        s[i]=sc.nextInt();
    }
    int sum=0;
    for (int i = 0; i < n; i++) {
        sum+=s[i];
    }
    int m=100;
    if(sum%10!=0){
        out.println(sum);
    }else{
        for (int i = 0; i < n; i++) {
            if(s[i]%10!=0){
                m=min(m,s[i]);
            }
        }
        if(m%10!=0){
            out.println(sum-m);
        }else{
            out.println(0);
        }
    }
}}