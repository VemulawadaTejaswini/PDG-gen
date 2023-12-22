import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        List<Integer> nums = new ArrayList<>();

        for(int i=0; i<n; i++){
            nums.add(sc.nextInt());
        }

        int ans = nums.stream().sorted((x,y) -> y-x).mapToInt(x -> x).limit(k).sum();


        System.out.println(ans);


    }
}
