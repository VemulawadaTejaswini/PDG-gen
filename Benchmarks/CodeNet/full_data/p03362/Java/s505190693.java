import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {
            11, 31, 41, 61, 71, 101, 131, 151, 181, 
            191, 211, 241, 251, 271, 281, 311, 331, 
            401, 421, 431, 461, 491, 521, 541, 571, 
            601, 631, 641, 661, 691, 701, 751, 761, 
            811, 821, 881, 911, 941, 971, 991, 1021, 
            1031, 1051, 1061, 1091, 1151, 1171, 1181, 
            1201, 1231, 1291, 1301, 1321, 1361, 1381, 1451};
        int n = in.nextInt();
        for(int i = 0; i < n; i++) {
            System.out.print(i==0 ? arr[i] : " " + arr[i]);
        }
    }
}