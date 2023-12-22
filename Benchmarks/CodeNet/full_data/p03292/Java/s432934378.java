import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);


int[] A=new int[3];
A[0]=Integer.parseInt(sc.next());
A[1]=Integer.parseInt(sc.next());
A[2]=Integer.parseInt(sc.next());
int a=Math.abs(A[1]-A[0])+Math.abs(A[2]-A[1]);
int b=Math.abs(A[2]-A[0])+Math.abs(A[1]-A[2]);
int ans=Math.min(a, b);
int c=Math.abs(A[2]-A[1])+Math.abs(A[0]-A[2]);
ans=Math.min(ans,c);
int d=Math.abs(A[0]-A[1])+Math.abs(A[2]-A[0]);
ans=Math.min(ans, d);
int e=Math.abs(A[1]-A[2])+Math.abs(A[0]-A[1]);
ans=Math.min(ans, e);
int f=Math.abs(A[0]-A[2])+Math.abs(A[1]-A[0]);
ans=Math.min(ans,f);
System.out.println(ans);


}}