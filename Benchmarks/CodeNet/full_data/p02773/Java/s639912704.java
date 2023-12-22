import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Map<String, Integer> map = new TreeMap<>();
        for(int i = 0; i < num; i++){
            String word = sc.next();
            if(map.containsKey(word))
              map.put(word, map.get(word)+1);
            else
              map.put(word, 1);
        }

        int most = 0;
        for(String n: map.keySet()){
          if(map.get(n) > most)
            most = map.get(n);
        }
        for(String n: map.keySet()){
          if(map.get(n) == most)
            System.out.println(n);
        }
    }
}
