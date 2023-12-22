import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            a = scan.nextInt();
            map.put(a, i+1);
        }
        
        for(int i = 0; i < n; i++){
            System.out.print(map.get(i+1)+" ");
        }
    }
}