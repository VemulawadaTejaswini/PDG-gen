import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long P = sc.nextLong();

        /*
        - 素因数分解する
        - 2: 9つ
        - 3: 3つ
        - 5: 5つ
        ...
        この場合に、それぞれの数をNで割った商（切り捨て）をかけ合わせたものが答え？
        上の例だと N=4 の場合は、2* 2つ * 5*1つ
        */
        Map<Integer, Integer> map = new HashMap<>();
        int divisor = 2;
        while (divisor <= P) {
            if (P % divisor == 0) {
                if (map.containsKey(divisor)) {
                    int value = map.get(divisor);
                    map.put(divisor, value + 1);
                } else {
                    map.put(divisor, 1);
                }
                P /= divisor;
            } else {
                divisor++;
            }
        }

        int answer = 1;
        for(Map.Entry<Integer, Integer> e : map.entrySet()) {
            int count = e.getValue() / N;
            if (count != 0) {
                answer *= count * e.getKey();
            }
        }
        
        System.out.println(answer);
	}
}