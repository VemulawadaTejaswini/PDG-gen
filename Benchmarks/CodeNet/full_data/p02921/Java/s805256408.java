import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    char[] S = sc.nextLine().toCharArray();
    char[] T = sc.nextLine().toCharArray();
    int count = 0;
    for(int i = 0; i < S.length; i++){
      if(S[i] == T[i]){
        count++;
      }
    }
    System.out.println(count);
  }
}
