import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String s = sc.next();
        int K = sc.nextInt();
        String slist[] = s.split("");
        String check = slist[K-1];
        //System.out.println(check);
        for(int i = 0; i < s.length(); i++){
            if(!(slist[i].equals(check))){
                slist[i] = "*";
            }
        }
        for(int i = 0; i < s.length(); i++){
            System.out.print(slist[i]);
        }
    }
}
