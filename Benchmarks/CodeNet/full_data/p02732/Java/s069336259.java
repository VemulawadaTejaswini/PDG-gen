import java.util.*;
class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int[]a=new int[n+1];
  int b[]=new int[n];
  for(int i=0;i<n;i++){
    b[i]=sc.nextInt();
  	a[b[i]]++;
  }
  long sum=0;
  for(int i=0;i<n+1;i++){
    sum+=a[i]*(a[i]-1)/2;
  }
  for(int i=0;i<n;i++){
  	System.out.println(sum-a[b[i]]*(a[b[i]]-1)/2+(a[b[i]]-2)*(a[b[i]]-1)/2);
  }
}
}
