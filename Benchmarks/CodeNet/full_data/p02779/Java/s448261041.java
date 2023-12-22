import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String ans = "YES";
        Set<Integer> a = new HashSet<>();
        for(int i = 0; i < num; i++){
            a.add(sc.nextInt());
        }
        if(a.size() != num){
            ans = "NO";
        }
        
        System.out.println(ans);
    }
}