import java.util.*;

public class Main {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int N = Integer.parseInt(scan.next());
        long X = Integer.parseInt(scan.next());

        long distance;
        long[] distanceArray = new long[N];
        for(int i = 0; i < N; i++){
            distance = Long.parseLong(scan.next()) - X;
            if(distance < 0) distance = -(distance);
            distanceArray[i] = distance;
        }

        Arrays.sort(distanceArray);

        if(distanceArray.length == 1){

            System.out.println(distanceArray[0]);

        }else{

            long ans = distanceArray[distanceArray.length-1];
            for(int i = distanceArray.length -1; -1 < i ; i-- ){

                ans = gcd(ans, distanceArray[i]);
            }
            
            System.out.println(ans);
        }

    }

    private static long gcd(long a, long b){

        if(a%b == 0){

            return b;

        }else{

            return gcd(b, a%b);

        }
    }
}