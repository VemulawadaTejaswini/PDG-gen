import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    char[] S = sc.next().toCharArray();
    int cnt = 0;
    for(int i=0; i<S.length/2; i++){
      if(S[i] != S[S.length-i-1]){
        cnt++;
      }
    }
    System.out.print(cnt);
  }
}
