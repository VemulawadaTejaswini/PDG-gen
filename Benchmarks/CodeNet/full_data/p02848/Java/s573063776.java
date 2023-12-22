import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    char[] s = sc.next().toCharArray();
    for(int i = 0; i < s.length; i++){
      s[i] = (char)((s[i] - 'A' + n) % 26 + 'A');
  }
  System.out.println(String.valueOf(s));
}
}