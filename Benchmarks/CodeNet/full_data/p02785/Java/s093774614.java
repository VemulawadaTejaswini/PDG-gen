
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int Hissatu = scanner.nextInt();

        ArrayList<BigInteger> monsters = new ArrayList<>();
        for(int i=0;i<N;i++) {
            monsters.add(scanner.nextBigInteger());
        }

        //except
        if(Hissatu >= N){
            System.out.println(0);
            return;
        }

        PriorityQueue<BigInteger> queue = new PriorityQueue<>(Collections.reverseOrder());
        for(BigInteger h : monsters){
            queue.add(h);
        }

        for(int i=0;i<Hissatu;i++){
            queue.poll();
        }

        BigInteger answer = BigInteger.ZERO;
        for(BigInteger health : queue){
            answer = answer.add(health);
        }

        System.out.println(answer);
    }
}