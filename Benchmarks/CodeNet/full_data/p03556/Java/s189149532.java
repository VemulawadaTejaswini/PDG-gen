import java.util.*;
public class Main{
    public static void main(String[]args){  
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    int max=0;
    for(int i=0;i*i<=N;i++){
        max=i*i;
    }
    System.out.println(max);
    
    
    }
}