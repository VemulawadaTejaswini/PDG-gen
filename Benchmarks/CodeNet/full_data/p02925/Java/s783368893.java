import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Queue;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] wait = new int[n+1];
        wait[n] = n;

        Queue<Integer>[] deq = new Queue[n];

        for (int i=0; i<n; i++){
            deq[i] = new ArrayDeque<>();
            wait[i] = sc.nextInt()-1;
            for (int j=0; j<n-2; j++){
                deq[i].add(sc.nextInt()-1);
            }
        }

        int[] lastMatch = new int[n];

        int memo = n;

        while (memo>0){
            boolean updated = false;
            for (int i=0; i<n; i++){
                if (wait[wait[i]]==i){
                    lastMatch[i] = lastMatch[wait[i]] = Math.max(lastMatch[i], lastMatch[wait[i]])+1;
                    updated = true;

                    if (!deq[wait[i]].isEmpty()){
                        wait[wait[i]] = deq[wait[i]].poll();
                    }else{
                        wait[wait[i]] = n;
                        memo--;
                    }

                    if (!deq[i].isEmpty()){
                        wait[i] = deq[i].poll();
                    }else{
                        wait[i] = n;
                        memo--;
                    }
                }
            }
            if (!updated){
                System.out.println(-1);
                return;
            }
        }
        Arrays.stream(lastMatch).max().ifPresent(System.out::println);
    }
}