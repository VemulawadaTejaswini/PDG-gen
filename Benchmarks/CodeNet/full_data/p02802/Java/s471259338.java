import java.util.*;
import java.lang.*;
import java.util.stream.*;
import java.util.function.*;

//Stream作成途中終わったら他のCをやるいこと
// 2 5
// 1 WA
// 2 AC
// 2 WA
// 1 AC
// 2 WA
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] firstArr = sc.nextLine().split(" ");
        System.out.println(solve(getInputAsArray(sc, firstArr[1])));
    }

    private static List<String[]> getInputAsArray(Scanner sc, String count) {
        List<String[]> result = new ArrayList<>();
        IntStream.range(0, Integer.parseInt(count)).forEach(i -> result.add(sc.nextLine().split(" ")));
        return result;
    }

    private static Long[] convertStrToInt(String[] strArray) {
        return Arrays.stream(strArray).map(e -> new Long(Long.parseLong(e))).toArray(Long[]::new);
    }

    private static long outputResult(long a, long b) {
        return LongStream.range(0, b).reduce((long) 0, (sum, i) -> sum += (Math.pow(10, i) * a));
    }

    private static String solve(List<String[]> input) {
        Map<String, Integer> map = new HashMap<>();
        Map<String, Boolean> acMap = new HashMap<>();

        input = input.stream().sorted((e1,e2)->e1[0].compareTo(e2[0])).collect(Collectors.toList());

        int acCountTotal = 0;
        int wcCount = 0;
        int wcCountTotal = 0;
        String beforeStr = "";
        boolean changed = true;
        boolean accepted = false;

        int count = 1;
        for (String[] strArr : input) {
            // System.out.println(String.valueOf(count++));
            changed = beforeStr == strArr[0];
            beforeStr = strArr[0];

            if (!changed && accepted) {
                continue;
            }

            if (changed) {
                wcCount = 0;
                accepted = false;
            }
            if (strArr[1].equals("WA")) {
                // System.out.println("wsws");
                wcCount++;
            } else {
                // System.out.println("acac");
                accepted = true;
                acCountTotal++;
                wcCountTotal += wcCount;
                wcCount = 0;
            }
        }
        return String.valueOf(acCountTotal) + " " + String.valueOf(wcCountTotal);
    }
}

class Resp {
    private long min = Long.MAX_VALUE;
    private int cont = 0;

    public Resp(long min, int cont) {
        this.min = min;
        this.cont = cont;
    }

    public long getMin() {
        return this.min;
    }

    public void setMin(long min) {
        this.min = min;
    }

    public int getCont() {
        return this.cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

    public void addCont() {
        this.cont++;
    }

}
