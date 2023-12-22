import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] stringList = new String[n];
        for (int i=0;i<n;i++){
            stringList[i] = scanner.next();
        }
        long count = 0;

        Map<String, Long> hashMap = new HashMap<>();
        for (int i=0;i<n;i++){
            char[] c = stringList[i].toCharArray();
            Arrays.sort(c);
            String str = String.valueOf(c);
            if (hashMap.containsKey(str)){
                long num = hashMap.get(str);
                count += num;
                hashMap.put(str,num+1);
            }else {
                hashMap.put(str,1l);
            }
        }
        System.out.println(count);
    }
}
