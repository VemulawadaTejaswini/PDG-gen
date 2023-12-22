import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();
        for( int i=1; i<= num; i++ ) {
            int val = Integer.valueOf(sc.nextInt());
            if( i%2 == 0 ) {
                map2.put( val, map2.getOrDefault( val, 0 ) + 1 );
                continue;
            }
            map1.put( val, map1.getOrDefault( val, 0 ) + 1 );
        }
        Stream<Map.Entry<Integer, Integer>> s1 = map1.entrySet().stream().sorted((o1, o2) -> Integer.compare(o2.getValue(), o1.getValue()));
        int aNum = s1.map(Map.Entry::getValue).collect(Collectors.toList()).get(0);
        s1 = map1.entrySet().stream().sorted((o1, o2) -> Integer.compare(o2.getValue(), o1.getValue()));
        int aKey = s1.map(Map.Entry::getKey).collect(Collectors.toList()).get(0);

        Stream<Map.Entry<Integer, Integer>> s2 = map2.entrySet().stream().sorted((o1, o2) -> Integer.compare(o2.getValue(), o1.getValue()));
        int bNum = s2.map(Map.Entry::getValue).collect(Collectors.toList()).get(0);
        s2 = map2.entrySet().stream().sorted((o1, o2) -> Integer.compare(o2.getValue(), o1.getValue()));
        int bKey = s2.map(Map.Entry::getKey).collect(Collectors.toList()).get(0);

        if( aKey == bKey ) {
            aNum = num/2;
            bNum = 0;
        } else {
            aNum = (num / 2 == aNum) ? 0 : Math.abs((num / 2) - aNum);
            bNum = (num / 2 == bNum) ? 0 : Math.abs((num / 2) - bNum);
        }

        System.out.println( aNum + bNum );
    }
}