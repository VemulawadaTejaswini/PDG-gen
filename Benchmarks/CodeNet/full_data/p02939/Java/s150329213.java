import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    String s;
    Scanner scanner = new Scanner(System.in);
    s = scanner.nextLine();
    int n = s.length();
    int k = 1;
    int l = 1;
    int m = 1;
    int o = 1;
    for(int i = 0; i < n - 1; i++){
      if(s.charAt(i) != s.charAt(i + 1)){
        k++;
        continue;
      }else{
        i++;
        k++;
      }
    }
    
    for(int i = 1; i < n - 1; i++){
      if(s.charAt(i) != s.charAt(i + 1)){
        l++;
        continue;
      }else{
        i++;
        l++;
      }
    }
    
    for(int i = m - 1; i > 0; i--){
      if(s.charAt(i) != s.charAt(i - 1)){
        m++;
        continue;
      }else{
        i--;
        m++;
      }
    }
    
    for(int i = m - 2; i > 0; i--){
      if(s.charAt(i) != s.charAt(i - 1)){
        o++;
        continue;
      }else{
        i--;
        o++;
      }
    }
    
    System.out.println(Math.max(Math.max(k, l), Math.max(m, o)));
  }
}
