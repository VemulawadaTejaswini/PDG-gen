import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static Parser parser = new Parser();

    public static void main(String[] args) {
        int N = parser.parseInt();

        int[] a = new int[N * 3];
        for(int i = 0; i < N * 3; i++){
            int v = parser.parseInt();
            a[i] = v;
        }

        long preSum = 0;
        long[] preSums = new long[N + 1];
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for(int i = 0; i < N; i++){
            int v = a[i];
            preSum += v;
            priorityQueue.add(v);
        }
        preSums[0] = preSum;

        for(int i = 0; i < N; i++){
            int v = a[N + i];
            if(!priorityQueue.isEmpty() && priorityQueue.peek() < v){
                preSum -= priorityQueue.poll();
                preSum += v;
                priorityQueue.add(v);
            }
            preSums[i + 1] = preSum;
        }
        priorityQueue.clear();

        long postSum = 0;
        long[] postSums = new long[N + 1];
        PriorityQueue<Integer> reversePriorityQueue = new PriorityQueue<>(Comparator.reverseOrder());

        for(int i = 0; i < N; i++){
            int v = a[3 * N - 1 - i];
            postSum += v;
            reversePriorityQueue.add(v);
        }
        postSums[0] = postSum;

        for(int i = 0; i < N; i++){
            int v = a[N * 2 - 1 - i];
            if(!reversePriorityQueue.isEmpty() && reversePriorityQueue.peek() > v){
                postSum -= reversePriorityQueue.poll();
                postSum += v;
                reversePriorityQueue.add(v);
            }
            postSums[i + 1] = postSum;
        }

        long ans = Long.MIN_VALUE;
        for(int i = 0; i <= N; i++){
            ans = Math.max(ans, preSums[i] - postSums[N - i]);
        }

        System.out.println(ans);
    }

}

class Parser {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final Iterator<String> stringIterator = br.lines().iterator();
    private static final Deque<String> inputs = new ArrayDeque<>();

    void fill() {
        if(inputs.isEmpty()){
            if(!stringIterator.hasNext()) throw new NoSuchElementException();
            inputs.addAll(Arrays.asList(stringIterator.next().split(" ")));
        }
    }

    Integer parseInt() {
        fill();
        if(!inputs.isEmpty()) {
            return Integer.parseInt(inputs.pollFirst());
        }
        throw new NoSuchElementException();
    }

    Long parseLong() {
        fill();
        if(!inputs.isEmpty()) {
            return Long.parseLong(inputs.pollFirst());
        }
        throw new NoSuchElementException();
    }

    Double parseDouble() {
        fill();
        if(!inputs.isEmpty()) {
            return Double.parseDouble(inputs.pollFirst());
        }
        throw new NoSuchElementException();
    }

    String parseString() {
        fill();
        return inputs.removeFirst();
    }

}