import java.util.*;

public class Main {

    static long X;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        X = sc.nextLong();
        System.out.println(findMinTimeToGoHome(0, 0));
    }

    static long findMinTimeToGoHome(long currentTime, long currentPosition) {
        if(currentPosition == X) return currentTime;
        if(currentPosition > X) return Long.MAX_VALUE;
        if(currentTime > X) return Long.MAX_VALUE;
        long candidateTime1 = findMinTimeToGoHome(currentTime + 1, currentPosition);
        long candidateTime2 = findMinTimeToGoHome(currentTime + 1, currentPosition + (currentTime + 1));
        long candidateTime3 = findMinTimeToGoHome(currentTime + 1, currentPosition - (currentTime - 1));
        return Math.min(Math.min(candidateTime1, candidateTime2), candidateTime3);
    }
}
