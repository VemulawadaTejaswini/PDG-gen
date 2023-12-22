import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<String> W = new ArrayList<String>();
        String preWordEnd = new String();
        boolean ans = true;
        for(int i = 0; i < N; i++){
            String s = sc.next();
            if(i != 0){
                if(W.contains(s) || !s.startsWith(preWordEnd)) {
                    ans = false;
                    break;
                }
            }
            W.add(s);
            preWordEnd = s.substring(s.length()-1, s.length());
        }
        if(ans) System.out.println("Yes");
        else System.out.println("No");
        sc.close();

    }

}
