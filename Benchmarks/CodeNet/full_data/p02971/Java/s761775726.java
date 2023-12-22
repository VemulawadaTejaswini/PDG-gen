import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N;
        List<Integer> numbers = new ArrayList<>();
        try {
            N  = Integer.parseInt(br.readLine());
            for (int i=0; i<N; i++) {
                numbers.add(i, Integer.parseInt(br.readLine()));
            }
            int max = 0;
            int index = -1;
            for (int i=0; i<N; i++) {
                if (numbers.get(i) > max) {
                    max = numbers.get(i);
                    index = numbers.indexOf(max);
                }
            }
            int second = 0;
            int index2 = -1;
            for (int i=0; i<N; i++) {
                if (i != index && numbers.get(i) > second) {
                    second = numbers.get(i);
                    index2 = numbers.indexOf(second);
                }
            }
            if (max == second) {
                for (int i=0; i<N; i++) {
                    System.out.println(max);
                }
            }
            else {
                for (int i=0; i<N; i++) {
                    if (i == index) {
                        System.out.println(second);
                    }
                    else {
                        System.out.println(max);
                    }
                }
            }
        }
        catch(Exception e) {
        }
    }
}