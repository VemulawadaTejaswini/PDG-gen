import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<String> set = new HashSet<>();
        char end = '0';
        for(int i = 0; i < n; i++){
            String w = sc.next();
            if(i != 0){
                if(set.contains(w) || end != w.charAt(0)){
                    System.out.println("No");
                    return;
                }
            }
            end = w.charAt(w.length()-1);
            set.add(w);

        }
        System.out.println("Yes");
    }
}
