import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int k = sc.nextInt();

        List<Long> aValues = new ArrayList<>(x);
        List<Long> bValues = new ArrayList<>(y);
        List<Long> cValues = new ArrayList<>(z);

        for (int i = 0; i < x; i ++){
            aValues.add(sc.nextLong());
        }
        for (int i = 0; i < y; i ++){
            bValues.add(sc.nextLong());
        }
        for (int i = 0; i < z; i ++) {
            cValues.add(sc.nextLong());
        }

        aValues.sort(Collections.reverseOrder());
        bValues.sort(Collections.reverseOrder());
        cValues.sort(Collections.reverseOrder());

        List<Long> tasteSumValues = new ArrayList<>();

        for (int i = 0; i < x; i++){
            if (i > k){
                break;
            }

            for (int j = 0; j < y; j++){
                if (i * j > k){
                    break;
                }

                for (int m = 0; m < z; m++){
                    if (i * j * m > k){
                        break;
                    }
                    long tasteSum = aValues.get(i) + bValues.get(j) + cValues.get(m);
                    tasteSumValues.add(tasteSum);
                }
            }
        }

        tasteSumValues.sort(Collections.reverseOrder());

        for (int i = 0; i < k; i++){
            System.out.println(tasteSumValues.get(i));
        }
    }

}