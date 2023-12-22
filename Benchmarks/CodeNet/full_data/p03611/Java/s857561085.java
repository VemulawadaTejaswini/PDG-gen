import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for (int i=0;i<n;i++){
            a.add(scanner.nextInt());
        }
        int max = 0;
        for (int i:new LinkedHashSet<>(a)){
            int count = 0;
            for (int j:a){
                if (i==j||i==j+1||i==j-1){
                    count++;
                }
            }
            if (count>max){
                max = count;
            }
        }
        System.out.println(max);
    }

}