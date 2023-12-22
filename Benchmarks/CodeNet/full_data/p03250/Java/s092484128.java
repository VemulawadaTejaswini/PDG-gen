import java.util.*;
public class Main{
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    int m=Math.max(a,b);
    int n=Math.min(a,b);
    int min=Math.min(n,c);
    int max=Math.max(m,c);
    int mid=0;
    String p="null";
    if ((a==max || a==min) && a!=b || a!=c){
        if(min!=b || max!=b &&(b!=c)){
        mid=b;
        }else{
        mid=c;
        }
    
    }else {
    mid =a;
    }
    p=Integer.toString(max)+Integer.toString(mid);
    int result = Integer.parseInt(p); 
    System.out.println(result+min);
    }
}