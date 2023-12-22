import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        Integer[] arr = new Integer[N];
        for (int i=0;i<N;i++){
            arr[i] = Integer.parseInt(sc.next());
        }
        if(!Arrays.asList(arr).contains(1)){
            System.out.println(-1);
        }else {
            int lengthOfOringin = arr.length;
            int validIndex = 0;
            int lookedNum = 1;
            while (true) {
                if (Arrays.asList(arr).contains(lookedNum)) {
                    validIndex = Arrays.asList(arr).indexOf(lookedNum);
                    lookedNum++;
                    arr = Arrays.copyOfRange(arr, validIndex, arr.length);
                } else {
                    break;
                }
            }
            //System.out.println(lookedNum);
            System.out.println(lengthOfOringin - lookedNum + 1);
        }


    }

}