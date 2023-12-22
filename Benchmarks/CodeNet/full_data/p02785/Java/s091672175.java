import java.util.Scanner;
import java.util.Arrays;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int k=sc.nextInt();
    int[] num=new int[n];
    for(int i=0;i<n;i++){
      num[i]=sc.nextInt();
    }
    System.out.println(attackTurn(num,k,n));
  }
  public static int attackTurn(int[] num,int k,int n){
    Arrays.sort(num);
    int res=0;
    for(int i=0;i<n-k;i++){
      res+=num[i];
    }
    return res;
  }
} 