import java.util.*;
class Main{public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int m=sc.nextInt();
int x=sc.nextInt();
int[]a=new int[n];
int []b=new int[m];
int nmin=Integer.MAX_VALUE;
int mmin=Integer.MAX_VALUE;
for(int i=0;i<n;i++){
    a[i]=sc.nextInt();
    nmin=(nmin<a[i])?nmin:a[i];
}

for(int i=0;i<m;i++){
    b[i]=sc.nextInt();
    mmin=(mmin<b[i])?mmin:b[i];
}
int sum=nmin+mmin;
for(int i=0;i<x;i++){
    int po=a[sc.nextInt()-1]+b[sc.nextInt()-1]-sc.nextInt();
    sum=(sum<po)?sum:po;
}System.out.println(sum);
}}