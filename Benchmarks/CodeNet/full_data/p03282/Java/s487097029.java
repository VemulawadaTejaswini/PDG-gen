import java.util.*;
 
public class Main{
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    String S = sc.next();
    long K = sc.nextLong();
    int temp = 0;
    for (int i=0;i<S.length();i++){
        if (S.charAt(i) != '1'){
            temp = i;
            break;
        }
    }

    if (K < temp+1){
        System.out.println(1);
    }
    else{
        System.out.println(S.charAt(temp));
    }
    return;
  }
}