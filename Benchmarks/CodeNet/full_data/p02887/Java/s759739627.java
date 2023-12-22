import java.util.Scanner;
public class MainC{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    String S = sc.next();  
    StringBuilder s = new StringBuilder();
    s.append(S.charAt(0)); 
    for(int i=1;i<S.length();i++){
      char tmp = S.charAt(i);
        if(S.charAt(i-1)!=tmp){
            s.append(tmp);
        }
    }
    System.out.print(s.length());
    return;
  }
}

