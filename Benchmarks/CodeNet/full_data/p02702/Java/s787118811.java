import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    String str = scan.nextLine();
    String number = "";

    int count = 0;
    for(int i = 0; i < str.length(); i++){
      for(int j = i+4; j <= str.length(); j++){
        number = str.substring(i, j);
        double num = Double.parseDouble(number);
        if(num % 2019.0 == 0.0){
          count++;
        }
      }
    }
    System.out.println(count);
  }
}
