import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    char[] ltrs = new char[n]
    String str = sc.next();
    for(int i = 0; i < n; i++){
      ltrs[i] = str.charAt(i);
    }
    ltrs[k-1] = ltrs[k - 1] - 32;
    String out = new String(ltrs);
    System.out.println(out);
    
  }
}