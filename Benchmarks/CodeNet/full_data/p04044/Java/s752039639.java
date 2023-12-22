import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> S = new ArrayList<>();

        System.out.println("文字の長さは?");
        String L = sc.next();
        System.out.println("文字列の数は?");
        int N = sc.nextInt();

        for(int i = 0; i < N; i++){
            S.add(sc.next());
        }
        Collections.sort(S);
        System.out.println(String.join("", S));

    }
}