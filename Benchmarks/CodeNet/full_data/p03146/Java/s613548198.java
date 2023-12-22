import java.util.*;




public class Main {


    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int s = cin.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        map.put(s,1);
        for (int i = 2; true; i++) {
            int n = s;
            s = n%2==0? n/2 : 3*n+1;
            if (map.get(s) != null) {
                System.out.println(i);
                break;
            }
            map.put(s,1);
        }
    }


}
