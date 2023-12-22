import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
      int m=sc.nextInt();
      String po=sc.next();
      for(int i=0;i<m;i++){
      	int a=sc.nextInt();
        int b=sc.nextInt();
        String aaa=po.substring(a-1,b);
        String aa=aaa.replace("AC","");
        System.out.println((aaa.length()-aa.length())/2);
      }
    }
}
