import java.util.*;
public class Main {

 public static void main(String[] args) {
  Scanner no=new Scanner(System.in);
  int n=no.nextInt();
  int arr[]=new int[1000000];
  int max=0;
  boolean t=true;
  for(int i=0;i<n;i++){
    int r=no.nextInt();
    if(r>n||(n%2==0&&r%2==0)||(n%2==1&&r%2==1)){
      System.out.println("0");
      t=false;
    }
    if(r>max){
      max=r;
    }
    arr[r]++;
  }
  if(t){
   if(n%2==0){
     boolean t1=true;
     for(int i=0;i<max;i++){
       if(arr[i]>2){
         System.out.println("0");
         t1=false;
         break;  
       }
     }
     if(t1){
       int o=n/2;
       System.out.println((o*o)%1000000007);
     }
   }
   else if(n%2==1){
     boolean t1=true;
     for(int i=0;i<max;i++){
       if(arr[i]>2||arr[0]>1){
         System.out.println("0");
         t1=false;
         break;  
       }
     }
     if(t1){
     int o=n/2;
       System.out.println((o*o)%1000000007);
     }
   }
  }
 }

}
