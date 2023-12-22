import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int numArray[] = new int[n];
        for (int i = 0; i < n; i++) {
            numArray[i] = scan.nextInt();
        }
        int latestNum = numArray[0];
        int maxCount = 0, tmpCount = 0;
        for (int i = 1; i < n; i++) {
            if (latestNum >= numArray[i]) {
                tmpCount++;
            }
            else{
                if(maxCount < tmpCount){
                    maxCount = tmpCount;
                }
                tmpCount = 0;
            }
            latestNum = numArray[i];
        }
        if(maxCount < tmpCount){
            maxCount = tmpCount;
        }
        System.out.println(maxCount);
    }
}
