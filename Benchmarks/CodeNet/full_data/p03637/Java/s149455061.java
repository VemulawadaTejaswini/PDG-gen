import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int numOfOne = 0;
        int numOfTwo = 0;
        int numOfFour = 0;
        
        for (int i = 0; i < N; i++) {
            long value = sc.nextLong();
            if (value % 2 == 1) {
                numOfOne++; // 1
            } else if (value % 4 == 0) {
                numOfFour++; // 4
            } else {
                numOfTwo++; // 2
            }
        }
        if (numOfTwo > 0) {
            numOfOne++;
        }
        System.out.println(numOfFour + 1 >= numOfOne ? "Yes" : "No");
    }
}