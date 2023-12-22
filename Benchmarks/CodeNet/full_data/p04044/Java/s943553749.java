import java.util.*;

public class Main {
  public static void main(String[] args ) throws Exception {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int L = sc.nextInt();
    
    List<String> ary = new ArrayList();

    for(int i = 0; i < N; i++) {
        String str = sc.next();
        
        if(str.length() == L) {
            ary.add(str);
        }
    }
    
    Collections.sort(ary);
    
    String res = String.join("",ary);

    System.out.println(res);
 
  }
}
