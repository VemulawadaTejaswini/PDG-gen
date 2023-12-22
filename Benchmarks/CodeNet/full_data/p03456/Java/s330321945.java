import java.util.*;

class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String a = sc.next();
      String b = sc.next();
      int c = Integer.parseInt(a+b);
      String res = "NO";
      for (int i = 1; i*i <= c; i++) {
            if(c == i*i){
                res = "Yes";
            }
        }
     	System.out.println(res);
	  
    }
}