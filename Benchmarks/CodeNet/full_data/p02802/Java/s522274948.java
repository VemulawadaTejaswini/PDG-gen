import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] valArr = sc.nextLine().split(" ");
        long n = Long.parseLong(valArr[0]);
        long m = Long.parseLong(valArr[1]);
        long acCount = 0;
        long waCount = 0;

        if (m == 0) {
            sc.close();
            System.out.println("0 0");
        } else {
            Map<Long, Boolean> resultMap = new HashMap<>();
            for (long i = 1; i <= n; i++) {
                resultMap.put(i, false);
            }

            while (sc.hasNext()) {
                String apply = sc.nextLine();
                Long problemNo = Long.parseLong(apply.split(" ")[0]);
                String result = apply.split(" ")[1];
                boolean registedResult = resultMap.get(problemNo);
                if (result.equals("AC")) {
                    if (registedResult) {
                        continue;
                    } else {
                        acCount++;
                        resultMap.put(problemNo, true);
                    }
                } else {
                    if (registedResult) {
                        continue;
                    } else {
                        waCount++;
                    }
                }
            }

            sc.close();

            System.out.println(acCount + " " + waCount);
        }
    }

}