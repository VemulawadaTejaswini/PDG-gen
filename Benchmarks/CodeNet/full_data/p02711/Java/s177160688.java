import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int h=n/100;
    int i=n%100;
    int j=i/10;
    int k=i%10;
    if(100<=n&&n<=999){
      if((h==7)||(j==7)||(k==7)){
        System.out.println("Yes");
      }else{
        System.out.println("No");
      }
    }
  }
}
