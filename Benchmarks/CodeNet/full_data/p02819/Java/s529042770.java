import java.util.Scanner;
public class Main{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
    int X = sc.nextInt();
    while(true){
      boolean hantei = true;
      for(int i = 2; i <X; i++){
        if(X % i == 0){hantei = false; break;}
      }
      if(hantei == true)break;
      else X++;
    }
    System.out.println(X);
  }
}