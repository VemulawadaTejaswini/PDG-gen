import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] sArr = sc.next().split("");

        System.out.println(sArr[0] + Integer.valueOf(sArr.length-2).toString() + sArr[sArr.length-1]);
    }
}
