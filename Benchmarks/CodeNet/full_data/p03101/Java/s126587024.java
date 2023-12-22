import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        int hMax = sn.nextInt();
        int wMax = sn.nextInt();
        int h = sn.nextInt();
        int w = sn.nextInt();
        
        System.out.println(hMax * wMax - (h * wMax + hMax * w - h * w));
        
    }
}