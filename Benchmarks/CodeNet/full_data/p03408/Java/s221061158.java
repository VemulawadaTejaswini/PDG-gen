import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    private static Scanner sc;
    public static void main(String[] args) {
        sc = new Scanner(System.in);

        HashMap<String,Integer> blueCards = initMap();
        HashMap<String,Integer> redCards = initMap();

        int ans = 0;

        for (Map.Entry<String, Integer> entry : blueCards.entrySet()) {
            String key = entry.getKey();
            int val = entry.getValue();
            int thisPoint = 0;
            if (redCards.containsKey(key)) {
                thisPoint = val - redCards.get(key);
            } else {
                thisPoint = val;
            }
            if (thisPoint > ans) ans = thisPoint;
        }
        System.out.println(ans);
        sc.close();
    }

    public static HashMap<String, Integer> initMap(){
        HashMap<String,Integer> cards = new HashMap<>();
        IntStream.range(0,sc.nextInt())
                .forEach(i->{
                    String key = sc.next();
                    int val = 0;
                    if (cards.containsKey(key)){
                        val = cards.get(key);
                        cards.replace(key,val+1);
                    }else{
                        cards.put(key, 1);
                    }
                });
        return cards;
    }
}