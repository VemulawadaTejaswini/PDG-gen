import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] stringList = new String[n];
        char[][] character = new char[n][10];
        for (int i=0;i<n;i++){
            stringList[i] = scanner.next();
            for (int j=0;j<10;j++){
                character[i][j] = stringList[i].charAt(j);
            }
        }
        int count = 0;
        Map<String, Long> hashMap = new HashMap<>();
        for (int i=0;i<n;i++){
            Arrays.sort(character[i]);
            if (hashMap.containsKey(Arrays.toString(character[i]))){
                count += hashMap.get(Arrays.toString(character[i]));
                hashMap.replace(Arrays.toString(character[i]),hashMap.get(Arrays.toString(character[i]))+1);
            }else {
                hashMap.put(Arrays.toString(character[i]),1l);
            }
        }
        System.out.println(count);
    }
}
