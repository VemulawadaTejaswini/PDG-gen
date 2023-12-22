import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            while (sc.hasNext()) {
                String[] strs = sc.nextLine().split(" ");
                int[] abc = new int[3];
                abc[0] = Integer.parseInt(strs[0]);
                abc[1] = Integer.parseInt(strs[1]);
                abc[2] = Integer.parseInt(strs[2]);
                Arrays.sort(abc);
                int r1 = twoup(abc[0],abc[1]) + abc[2]-abc[1];
                int r2 = twoup(abc[0],abc[2]) + twoup(abc[1],abc[2]);
                int r3 = abc[2] *2 - abc[0] - abc[1];
                
                System.out.println(Math.min(r1,Math.min(r2,r3)));
            }
        }
    }
    private static int twoup(int a, int b){
        return (b-a)/2 + (((b-a)%2!=0)?2:0);
    }
}