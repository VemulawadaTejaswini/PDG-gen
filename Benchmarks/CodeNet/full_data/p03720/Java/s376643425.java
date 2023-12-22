import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for(int i=0; i<M; i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            if(hashMap.containsKey(a)){
                int tmp = hashMap.get(a);
                tmp += 1;
                hashMap.put(a, tmp);
            }else{
                hashMap.put(a, 1);
            }

            if(hashMap.containsKey(b)){
                int tmp = hashMap.get(b);
                tmp += 1;
                hashMap.put(b, tmp);
            }else{
                hashMap.put(b, 1);
            }
        }

        for(int i=1; i<=N; i++){
            if(hashMap.containsKey(i)){
                System.out.println(hashMap.get(i));
            }else{
                System.out.println(0);
            }
        }
    }
}
