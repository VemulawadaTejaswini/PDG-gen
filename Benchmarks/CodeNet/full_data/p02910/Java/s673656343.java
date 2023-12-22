import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String s = in.readLine();
    boolean flg = true;
    for(int i=0; i<=s.length()/2; i=i+2){
      if(s.charAt(i)!='R' && s.charAt(i)!='U' && s.charAt(i)!='D') {
        flg = false;
      }
    }
    for(int i=1; i<=s.length()/2+1; i=i+2){
      if(s.charAt(i)!='L' && s.charAt(i)!='U' && s.charAt(i)!='D') {
        flg = false;
      }
    }
    System.out.println(flg==false?"No":"Yes");
  }
}
     