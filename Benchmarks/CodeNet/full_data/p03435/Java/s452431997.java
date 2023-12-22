import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int leftTop = sc.nextInt();
        int middleTop = sc.nextInt();
        int rightTop = sc.nextInt();
        int leftMiddle = sc.nextInt();
        int middleMiddle = sc.nextInt();
        int rightMiddle = sc.nextInt();
        int leftDown = sc.nextInt();
        int middleDown = sc.nextInt();
        int rightDown = sc.nextInt();

        String ans = "Yes";
        int[] aTop = {0, leftTop - middleTop, leftTop - rightTop};
        int[] aMiddle = {0, leftMiddle - middleMiddle, leftMiddle - rightMiddle};
        int[] aDown = {0, leftDown - middleDown, leftDown - rightDown};

        int[] bLeft = {0, leftTop - leftMiddle, leftTop - leftDown};
        int[] bMiddle = {0, middleTop - middleMiddle, middleTop - middleDown};
        int[] bRight = {0, rightTop - rightMiddle, rightTop - rightDown};

        if (!Arrays.equals(aTop, aMiddle) || !Arrays.equals(aTop, aDown)) {
            ans = "No";
        }

        if (!Arrays.equals(bLeft, bMiddle) || !Arrays.equals(bLeft, bRight)) {
            ans = "No";
        }

        System.out.println(ans);
    }
}