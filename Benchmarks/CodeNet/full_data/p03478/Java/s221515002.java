import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    // 標準入力
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // 標準入力数値配列用
    static int[] inputval() throws Exception {
        String[] strarray = br.readLine().trim().split(" ");
        int[] intarray = new int[strarray.length];
        for (int i = 0; i < intarray.length; i++) {
            intarray[i] = Integer.parseInt(strarray[i]);
        }
        return intarray;
    }

    public static void main(String[] args) throws Exception {
	// write your code here
        int[] intArray = inputval();
        int n = intArray[0];
        int a = intArray[1];
        int b = intArray[2];
        int ans = 0;

        for (int i=1; i<=n; i++){
            String nStr = String.valueOf(i);
            int num = 0;
            for (int j=0; j<nStr.length(); j++){
                char numPart = nStr.charAt(j);
                num += Character.getNumericValue(numPart);
            }
            if (num >= a && num <=b){
                ans += i;
            }
        }

        System.out.println(ans);
    }

}

