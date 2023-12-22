import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantity = sc.nextInt();
        Set<Integer> numSet = new HashSet<>();
        
        String result = "Yes";
        for (int i = 0; i < quantity; i++){
            if (!numSet.add(sc.nextInt())) {
                result = "No";
                break;
            }
        }
        System.out.println(result);
    }

}