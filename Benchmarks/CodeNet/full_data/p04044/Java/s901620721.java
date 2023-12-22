import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        ArrayList<String> li = new ArrayList<String>();
        for(int i = 0; i < n; i++){
            li.add(sc.next());
        }
        Collections.sort(li);
        String ans = "";
        for(String s : li){
            ans += s;
        }
        System.out.println(ans);
    }
}
