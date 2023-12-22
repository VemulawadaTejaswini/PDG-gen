import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k[]=new int[n+1];
    for(int i=1;i<n;i++){
    	k[sc.nextInt()]++;
    }
    for(int i=1;i<=n;i++){
    	pl(k[i]+"");
    }
  }

  public static void pr(String str){
    System.out.print(str);
  }
  public static void pl(String str){
    System.out.println(str);
  }
}
