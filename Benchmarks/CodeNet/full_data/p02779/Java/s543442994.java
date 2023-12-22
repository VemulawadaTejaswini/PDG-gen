import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = Long.parseLong(sc.nextLine());
        Stream<Long> stream = Arrays.stream(sc.nextLine().split(" ")).map(Long::parseLong);
        sc.close();
        Long[] arrays = (Long[]) stream.toArray();

        Arrays.sort(arrays);

        for(int i = 0; i < N; i++){
            long tt = arrays[i];
            if(i != N -1){
                long nt = arrays[i + 1];
                if(tt == nt){
                    System.out.println("No");
                    break;
                }
            }else{
                System.out.println("Yes");
            }
        }
    }
}