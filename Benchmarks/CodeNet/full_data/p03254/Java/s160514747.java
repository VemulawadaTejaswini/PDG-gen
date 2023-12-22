import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        List<Integer> eats = new ArrayList<>();
        int count = 0;

        for(int i=0; i<n; i++){
            eats.add(sc.nextInt());
        }

        eats = eats.stream().sorted((a,b)->a-b).collect(Collectors.toList());

        for(Integer eat:eats){
            if(eat <= x && n != 1){
                x -= eat;
                n -= 1;
                count++;
            }else if(eat == x && n == 1){
                count++;
                break;
            }else{
                break;
            }
        }
        System.out.println(count);

    }

}
