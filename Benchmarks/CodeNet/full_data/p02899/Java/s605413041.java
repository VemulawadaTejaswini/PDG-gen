import java.util.Scanner;

public class Main{
  public static void main(String[]args){
    Scanner kbd=new Scanner(System.in);
    int n=kbd.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++){
      a[i]=kbd.nextInt();
    }
    boolean att[]= new boolean[n];
    for(int i=0;i<=n;i++){
      for(int j=0;j<n;j++){
        if(true)continue;
        if(a[j]==i){
          System.out.print(j+1+" ");
          att=true;
        }
      }
    }

  }
}
