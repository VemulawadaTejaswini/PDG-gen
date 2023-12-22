import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    char[] c = s.toCharArray();
    
    String t = "abcdefghijklmnopqrstuvwxyz";
    char[] al = t.toCharArray();
    
    for(int i = 0; i < t.length(); i++){
      if(c[0] == al[i]){
        System.out.println(al[i+1]);
      }
    }
    
  }
}
