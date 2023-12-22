import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    char[] s = sc.next().toCharArray();
    int l = s.length;
    boolean bl = true;
    if(l % 2 == 0){
      for(int i = 0; i < l; i++){
        if(s[i] == s[l - 1 - i]){
          continue;
        }else{
          bl = false;
          break;
        }
      }
      if(bl){
        System.out.println("Yes");
      }else{
        System.our.println("No");
      }
    }
}
}