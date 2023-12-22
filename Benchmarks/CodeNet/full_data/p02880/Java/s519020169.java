import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    boolean isOk = false;
    for(int i=1; i<=9; i++){
      if( N%i == 0 && String.valueOf(N/i).length() == 1){
        isOk = true;
        break;
      }
    }
    if(isOk){
      System.out.print("Yes");
    }else{
      System.out.print("No");
    }
  }
}
