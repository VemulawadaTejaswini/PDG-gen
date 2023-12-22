import java.util.*;
public class Main {

 public static void main(String[] args) {
  Scanner no=new Scanner(System.in);
  int n=no.nextInt();
  int arr[]=new int[n];
 // int sum1[]=new int[n];
  for(int i=0;i<n;i++){
    arr[i]=no.nextInt();
   /* if(i==0){
      sum1[i]=arr[i];
    }
    else{
      sum1[i]=sum1[i]+sum1[i-1];
    }*/
  }
  int sum=0;
  int count=0;
  if(arr[0]>0){
    sum=arr[0];
    for(int i=1;i<n;i++){
      if(i%2==1&&sum+arr[i]>=0){
        int t=arr[i];
        arr[i]=(sum+1)*-1;
        count=count+Math.abs((t-arr[i]));
       // sum=sum+arr[i];
      }
      else if(i%2==0&&sum+arr[i]<=0){
        int t=arr[i];
        arr[i]=(Math.abs(sum)+1);
        count=count+Math.abs((Math.abs(t)-arr[i]));
        //sum=sum+arr[i];
      }
      /*else if(sum+arr[i]==0){
        count++;
      }*/
      sum=sum+arr[i];
    }
  }
  else if(arr[0]<0){
    sum=arr[0];
    for(int i=1;i<n;i++){
      if(i%2==1&&sum+arr[i]<=0){
        int t=arr[i];
        arr[i]=(Math.abs(sum)+1);
        count=count+Math.abs((Math.abs(t)-arr[i]));
       // sum=sum+arr[i];
      // System.out.println(count);
      }
      else if(i%2==0&&sum+arr[i]>=0){
        int t=arr[i];
        arr[i]=(sum+1)*-1;
        count=count+Math.abs((t-arr[i]));
        //System.out.println(count);
        //sum=sum+arr[i];
      }
     /* else if(sum+arr[i]==0){
        count++;
      }*/
      sum=sum+arr[i];
    }
  }
  System.out.println(count);
 }

}
