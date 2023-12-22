import java.util.*;
public class Main {

 public static void main(String[] args) {
   Scanner no=new Scanner(System.in);
   StringBuilder sb=new StringBuilder();
   int n=no.nextInt();
   int m=no.nextInt();
   String s1=Integer.toString(m);
   String s=Integer.toString(n);
   int y1=s.charAt(0)-'0';
   //System.out.println(y1);
   //int min=Integer.MAX_Value;
   int arr[]=new int[100000];
   int min2=0;
   for(int i=0;i<m;i++){
     int p=no.nextInt();
     arr[p]++;
   }
  // sb.append(min);
   for(int i=1;i<100000;i++){
     if(arr[i]==0&&i>=y1){
       min2=i;
       break;
     }
   }
   sb.append(min2);
   if(arr[0]==0){
     for(int i=0;i<s.length()-1;i++){
       sb.append(arr[0]);
     }
   }
   else{
     for(int i=0;i<s.length()-1;i++){
       sb.append(min2);
     }
   }
   int u=Integer.parseInt(sb.toString());
   if(u<m){
     while(u<m){
       u++;
     }
   }
   System.out.println(u);
  }

}
 