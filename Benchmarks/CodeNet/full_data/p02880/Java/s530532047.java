import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    final int N=sc.nextInt();
    int[] a={1,2,3,4,5,6,7,8,9};
    int counter=0;
    boolean flg=false;
    for(int i=counter;i<9;i++){
      for(int j=0;j<9;j++){
        if(a[i]*a[j]==N){
          flg=true;
        }
      }
    }
    if(flg){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}