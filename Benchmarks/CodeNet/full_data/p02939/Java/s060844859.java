import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    String s;
    Scanner scanner = new Scanner(System.in);
    s = scanner.nextLine();
    int n = s.length();
    int k = 1;

    boolean beforeDouble = false;
    for(int i = 1; i < n; i++){
      if((s.charAt(i) != s.charAt(i - 1)) || beforeDouble){
        k++;
        beforeDouble = false;
      }else{
        i++;
        if(i < n - 1){
          k++;
        }
        beforeDouble = true;
      }
    }
    
    System.out.println(k);
  }
}
