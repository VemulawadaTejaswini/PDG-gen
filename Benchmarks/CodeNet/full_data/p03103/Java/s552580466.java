import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong(), M = scanner.nextLong();
        Map<Long, Long> drinks = new HashMap<>();
        for(int i = 0; i < N; i++){
            drinks.put(scanner.nextLong(), scanner.nextLong());
        }
       drinks = drinks.entrySet().stream().sorted(Map.Entry.comparingByKey((v1, v2) -> v1.compareTo(v2) ))
               .collect(Collectors.toMap(v -> v.getKey(),v1 -> v1.getValue()));

        long num = 0;
        long yosan = 0;
        for( long key : drinks.keySet()){
            if(M - num > drinks.get(key)) {
                num += drinks.get(key);
                yosan += key * drinks.get(key);
            }else{
                yosan += key * (M - num);
                break;
            }
        }
        System.out.println(yosan);
    }
}
