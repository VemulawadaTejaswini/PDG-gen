import java.util.*;
public class Main{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int k=sc.nextInt();
  int arr[]=new int[n];
  for(int i=0;i<n;i++)
    arr[i]=sc.nextInt();
  
  int sto[]=new int[n];
  
  sto[0]=0;
 
  for(int i=1;i<n;i++){
      sto[i]=10000001;
     int kk=k;
  for(int j=i-1;j>=0;j--){
      if(kk==0)break;
       
        
    sto[i]=Math.min(sto[i],sto[j]+Math.abs(arr[i]-arr[j]));
    kk--;
    
  }
  }
  System.out.println(sto[n-1]);
}
 
 
}