import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int h=sc.nextInt();
    int w=sc.nextInt();
    int[] a=new int[h];
    for(int i=0;i<h;i++){
      a[i]=sc.nextInt();
    }
    for(int i=0;i<w+2;i++){
      System.out.print("#");
    }
    System.out.println("");//改行
    for(int i=0;i<h;i++){
      System.out.print("#");
      System.out.print(a[i]);
      System.out.println("#");
    }
    for(int i=0;i<w+2;i++){
      System.out.print("#");
    }
    System.out.println("");//改行
  }
}