import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int n=Integer.parseInt(sc.next());
int d=Integer.parseInt(sc.next());
int x=Integer.parseInt(sc.next());
int[] a=new int[n];
for(int i=0;i<n;i++){a[i]=Integer.parseInt(sc.next());}
int sum=x;
for(int i=0;i<n;i++){
    for(int j=0;j*a[i]+1<=d;j++){
    sum++;
    }
}
System.out.println(sum);
}}