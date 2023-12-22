import java.util.Scanner;
 
class Main {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    long L = scanner.nextLong();
    long R = scanner.nextLong();
    
    double L_d = (double)(((long)L % 2019)/2019);
    double R_d = (double)(((long)R % 2019)/2019);   
    if(L_d>=R_d){
      System.out.println("0");
    }else{
      String result = String.valueOf(L*(L+1)%2019);
      System.out.println(result);
    }
  }
}