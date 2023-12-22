import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    String b = sc.next();
    String[] c = a.split("");
    String[] d = b.split("");
    int cnt = 0;
    for(int i = 0; i < 3; i++){
      if(c[i].equals(d[i])){
        cnt++;
      }
    }
    System.out.println(cnt);
  }
}