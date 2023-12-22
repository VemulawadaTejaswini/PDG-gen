import java.util.Scanner;

class Main{
  public static void main(String... args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    StringBuilder f = new StringBuilder(s);
    StringBuilder b = new StringBuilder(s);

    if(s.length()%2 == 0){
      f.delete(s.length()/2, s.length());
      b.delete(0, s.length()/2).reverse();
    }else{
      f.delete(s.length()/2+1, s.length());
      b.delete(0, s.length()/2).reverse();
    }

    int cnt = 0;
    for(int i = 0; i < f.length(); i++){
      if(f.charAt(i) != b.charAt(i)){
        f.setCharAt(i, b.charAt(i));
        cnt++;
      }
    }
    System.out.println(cnt);
  }
}
