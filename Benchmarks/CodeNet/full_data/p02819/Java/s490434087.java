import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());

    boolean b = false;
    while(b==false){
      b = checkNum(N);
      N++;
    }
    System.out.print(N-1);
  }
  
  static boolean checkNum(int num){
    for(int i=2;i<= num/2;i++){
      if(num%i==0){
        return false;
      }
    }
    return true;
  }
}

