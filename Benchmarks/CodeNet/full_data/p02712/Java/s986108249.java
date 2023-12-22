import java.util.Scanner;
 
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N=sc.nextInt();
    
    int a=N/3;
    int b=N/5;
    int c=N/15;
    
    int sumN=N*(N-1)/2;
    int suma=a*(a-1)/2;
    int sumb=b*(b-1)/2;
    int sumc=c*(c-1)/2;
    
    int X=sumN-3*suma-5*sumb+15*sumc;
    System.out.println(X);
  }
}