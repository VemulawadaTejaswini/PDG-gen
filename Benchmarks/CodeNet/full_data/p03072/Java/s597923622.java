import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    ArrayList<Integer> ar = new ArrayList<>();

    for(int i = 0; i < N; i++){
        ar.add(sc.nextInt());
    }

    int count = 1;
    int max = ar.get(0);
    for(int i = 1;i < N;i++){
        if(ar.get(i) >= max){
            count++;
            max = ar.get(i);
        }
    }

    System.out.println(count);
    }










    public static Integer min(List<Integer> ar){
        int min = 10000;
        int index = 0;
        for(int i = 0; i< ar.size();i++){
            if(min > ar.get(i)){
                min = ar.get(i);
                index = i;
            }
        }
        return min;
    }
}
