import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        ArrayList<ArrayList<Integer>> divisors = new ArrayList<>(k);

        for(int i = 1 ; i <= k ; i++){
            ArrayList<Integer> divs = new ArrayList<>();
            for(int j = k ; j >= 1 ; j--){
                if((i % j) == 0){
                    divs.add(j);
                }
            }
            divisors.add(divs);
        }

        long sum = 0;
        for(int i = 1 ; i <= k ; i++){
            for(int j = 1 ; j <= k ; j++){
                for(int l = 1 ; l <= k ; l++){
                    int m = Math.min(Math.min(i,j),l);
                    for(int d : divisors.get(m-1)){
                        if((i % d) == 0 && (j % d) == 0 && (l % d) == 0){
                            sum += d;
                            break;
                        }
                    }
                }
            }
        }

        System.out.println(sum);
    }
}
