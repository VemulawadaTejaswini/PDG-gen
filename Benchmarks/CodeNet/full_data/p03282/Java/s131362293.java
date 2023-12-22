import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    long k = sc.nextLong();
    int j_ = 0;
    for(int j = 0; j < s.length(); j++){
      if(s.charAt(j) != '1'){
        j_ = j;
        break;
      }
    }
    if(j_ >= k){
      System.out.println("1");
    }
    else{
      System.out.println(s.charAt(j_));
    }
  }
}
