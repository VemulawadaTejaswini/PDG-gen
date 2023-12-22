import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static boolean debug = true;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        HashMap<String,Integer> map = new HashMap<>();

        for(int i=0; i< n;i++){
            String x = sc.next();
            char[] array = x.toCharArray();
            Arrays.sort(array);

            String result = new String(array);

            if(map.containsKey(result)){
                int count = map.get(result);
                map.put(result,count+1);
            }else{
                map.put(result,1);
            }
        }

        long count =0;
        for(int c:map.values()){
            //System.out.println(c + " ");
            int temp = c * (c-1) / 2;
            count += temp;

        }
        System.out.println(count);

    }
}