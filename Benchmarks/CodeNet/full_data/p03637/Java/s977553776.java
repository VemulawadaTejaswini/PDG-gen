import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean ok = false;
        List<Integer> a = new ArrayList<>();
        for(int i = 0; i < n; i++){
            a.add(sc.nextInt());
        }

        for(int i = 0; i < a.size(); i++){
            for(int m = 1; m < a.size(); m++){
                int a1 = a.get(i);
                int a2 = a.get(m);
                if((a1 * a2) % 4 == 0){
                    ok = true;
                }
            }
        }
        if(ok){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
