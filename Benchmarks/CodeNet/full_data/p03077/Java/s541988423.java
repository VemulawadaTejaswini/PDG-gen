import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        List<Long> transportTimeList = new ArrayList<>();

        for (int i = 0; i < 5; i ++){
            transportTimeList.add(sc.nextLong());
        }

        Collections.sort(transportTimeList);
        long weakestWay = transportTimeList.get(0);

        long longestTimeToTransport = n / weakestWay + 1L;
        long minimumTime = 5L;
        long answer = minimumTime + longestTimeToTransport -1L;

        System.out.println(answer);


    }

}