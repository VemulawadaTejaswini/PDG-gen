import java.util.*;
import java.util.ArrayList;
public class Main{
    public static void main(String[]args){  
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    int A=sc.nextInt();
    int B=sc.nextInt();
    int sum=0;
    for(int i=0;i<N;i++){
        String a=String.valueOf(N-i);
        char[]aa=a.toCharArray();
        int[]aaa=new int[a.length()];
        for(int j=0;j<a.length();j++){
            aaa[j]=Integer.parseInt(""+aa[j]);
        }
        int summ=0;
        for(int k=0;k<a.length();k++){
            summ=summ+aaa[k];
        }
        if((summ>=A)&&(summ<=B)){
            sum=sum+(N-i);
        }


    }
    System.out.println(sum);
    
    }
}