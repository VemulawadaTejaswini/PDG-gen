import java.util.*;
public class Main{

	public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      int ar[]=new int[t];
      for (int i=0;i<t-1;i++){
      int a=sc.nextInt();
        ar[a]++;
      }
      for (int i=0;i<t;i++){
      System.out.println(ar[i]);
      }
    
    
    }


}