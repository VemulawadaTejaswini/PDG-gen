import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int b=sc.nextInt();
      int c=sc.nextInt();
      if((b-a+2)/2<=c){
      	for(int i=a;i<=b;i++)System.out.println(i);
      }
      else   {
      for(int i=a;i<=a+c-1;i++)System.out.println(i);for(int i=b-c+1;i<=b;i++)System.out.println(i);
      }
    }
}
