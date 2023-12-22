import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String result = "NO";
        if(isPassible(sc.nextInt(),sc.nextInt(),sc.nextInt())){
            result = "YES";
        }
        System.out.println(result);

    }

    public static boolean isPassible(int base, int divider, int mod) {
        int lcm = calcLCM(base,divider);
        int max = lcm / base;
        for(int i = 1; i <= max;i++){
            if((base * i)% divider == mod){
                return true;
            }
        }

        return false;
    }

    private static int calcLCM(int val1, int val2) {
        int maxValue = Math.max(val1, val2);
        int minValue = Math.min(val1, val2);
        long val3    = maxValue * minValue;

        if(minValue==0) return maxValue;

        int temp;
        while( (temp=maxValue%minValue)!=0 ) {
            maxValue=minValue;
            minValue=temp;
        }

        return (int)(val3/minValue);
    }
}
