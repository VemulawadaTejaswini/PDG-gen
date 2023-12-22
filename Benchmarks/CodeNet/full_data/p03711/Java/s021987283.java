import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    int y=sc.nextInt();
    int[] a={1,2,1,4,1,4,1,1,4,1,4,1};
    if(a[x-1]==a[y-1]){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}