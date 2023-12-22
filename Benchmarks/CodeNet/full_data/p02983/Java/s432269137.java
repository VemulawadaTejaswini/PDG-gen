import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    private static final int fixedValue = 2019;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int L = scanner.nextInt();
        int R = scanner.nextInt();
        int min = -1;
        if (R - L >= fixedValue) {
            System.out.println(0);
        } else {
            int result = -1;
            for (int i = 0; i < fixedValue; i++) {
                int finalI = i;
                long filteredResultNum = IntStream.range(L, R + 1).filter(x -> x % fixedValue == finalI).count();
                if (filteredResultNum > 0 && IntStream.range(L,R+1).filter(x-> (x+finalI)%fixedValue == 0).count()>0) {
                    result = finalI*finalI;
                    break;
                }else{
                    if(min == -1){
                        min = finalI;
                    }else{
                        result = min * finalI;
                    }
                }
            }
            System.out.println(result%fixedValue);
        }
    }
}
