import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
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
        Map<Long, Long> map = new HashMap<>();
        long divisor = 2;
        while (divisor <= P) {
            if (P % divisor == 0) {
                if (map.containsKey(divisor)) {
                    long value = map.get(divisor);
                    map.put(divisor, (long)(value + 1));
                } else {
                    map.put(divisor, (long)1);
                }
                P /= divisor;
            } else {
                divisor++;
            }
        }

        long answer = 1;
        for(Map.Entry<Long, Long> e : map.entrySet()) {
            long count = e.getValue() / N;
            if (count != 0) {
                answer *= Math.pow(e.getKey(), count);
            }
        }
        
        System.out.println(answer);
	}
}