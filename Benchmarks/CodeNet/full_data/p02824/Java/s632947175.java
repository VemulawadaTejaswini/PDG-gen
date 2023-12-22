import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        init();

        int n = nextInt();
        long m = nextLong();
        int v = nextInt(), p = nextInt();

        ArrayList<Long> problemScores = new ArrayList<>();
        for (int i = 0; i < n; i++) problemScores.add(nextLong());

        problemScores.sort(Comparator.reverseOrder());
        Map<Long, Integer> firstPosition = new HashMap<>();
//        System.out.println(problemScores);
        for (int i = n - 1; i >= 0; i--) {
            firstPosition.put(problemScores.get(i), i);
        }
        long toBeat = problemScores.get(p - 1);
        long can = 0;
        int leverage = p - 1;
        long totalLeverage = 0L;
        int leverageContributors = 0;
        long prevScore = -1;
        for (Long score : problemScores) {
            if (score >= toBeat) can++;
            else {
                long canIncrease = p - 1 + n - firstPosition.get(score);
                long remainder = m * Math.max(0, v - canIncrease);
                totalLeverage -= (prevScore - score)*leverageContributors;
                while (leverage < firstPosition.get(score)) {
                    totalLeverage += (score + m - problemScores.get(leverage));
                    leverage++;
                    leverageContributors++;
                }
//                System.out.println(score + " " + totalLeverage + " " + remainder);
                if (totalLeverage >= remainder && score + m >= toBeat) can++;
            }
            prevScore = score;
        }

        System.out.println(can);
    }

    //Input Reader
    private static BufferedReader reader;
    private static StringTokenizer tokenizer;

    private static void init() {
        reader = new BufferedReader(new InputStreamReader(System.in));
        tokenizer = new StringTokenizer("");
    }

    private static String next() throws IOException {
        String read;
        while (!tokenizer.hasMoreTokens()) {
            read = reader.readLine();
            if (read == null || read.equals(""))
                return "-1";
            tokenizer = new StringTokenizer(read);
        }

        return tokenizer.nextToken();
    }

    private static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    private static long nextLong() throws IOException {
        return Long.parseLong(next());
    }
}