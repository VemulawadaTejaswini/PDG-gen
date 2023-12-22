import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int ans = 0;
    char[] c = s.toCharArray();
    for(int i = 0; i < c.length; i++){
      int count = 0;
      for(int j = i; j < c.length - i; j++){
        if(c[j] == 'A' || c[j] == 'C' || c[j] == 'G' || c[j] == 'T'){
          count++;
        }
        else {
        	break;
        }
      }
      if(count > ans){
        ans = count;
      }
    }
    System.out.println(ans);
  }
}