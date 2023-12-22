import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String S = sc.nextLine();
    int[] al = new int[26];
    for(int i = 0; i < S.length(); i++){
      al[(int)S.charAt(i) - 97]++;
    }
    
    for(int i = 0; i < 26; i++){
      if(al[i] % 2 != 0){
        System.out.println("No");
        return;
      }
    }
    
    System.out.println("Yes");
  }
}