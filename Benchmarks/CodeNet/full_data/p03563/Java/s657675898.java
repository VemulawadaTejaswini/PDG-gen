import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int n=Integer.parseInt(sc.next());
int[] a=new int[n];
int[] b=new int[n];
int[] c=new int[n];
for(int i=0;i<n;i++){a[i]=Integer.parseInt(sc.next());}
for(int i=0;i<n;i++){b[i]=Integer.parseInt(sc.next());}
for(int i=0;i<n;i++){c[i]=Integer.parseInt(sc.next());}
Arrays.sort(a);
Arrays.sort(b);
Arrays.sort(c);
long ans=0;
for(int i=0;i<n;i++){
int count1=0,count2=0;
    int L=0;
    while(L<n&&a[L]<b[i]){
    L++;
    count1++;
    }
    int R=n-1;
    while(R>=0&&b[i]<c[R]){
    R--;
    count2++;
    }
ans+=count1*count2;
}
System.out.println(ans);
}}