import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    String s;
    Scanner scanner = new Scanner(System.in);
    s = scanner.nextLine();
    int n = s.length();
    int k = 1;
    int l = 1;

    boolean beforeDouble = false;
    for(int i = 1; i < n; i++){
      if((s.charAt(i) != s.charAt(i - 1)) || beforeDouble){
        k++;
        beforeDouble = false;
      }else{
        i++;
        if(i < n){
          k++;
        }
        beforeDouble = true;
      }
    }
    beforeDouble = false;
    for(int i = n - 2; i >= 0; i--){
      if((s.charAt(i) != s.charAt(i + 1)) || beforeDouble){
        l++;
        beforeDouble = false;
      }else{
        i--;
        if(i >= 0){
          l++;
        }
        beforeDouble = true;
      }
    }
    
    System.out.println(Math.max(k, l));
  }
}
