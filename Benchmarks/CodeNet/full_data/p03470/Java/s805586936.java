import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> ds = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();

        for(int i=0; i<n; i++){
            ds.add(sc.nextInt());
        }

        ds = ds.stream().sorted((x,y)->x-y).collect(Collectors.toList());

        for(Integer item:ds){
            if(ans.indexOf(item) == -1){
                ans.add(item);
            }
        }

        System.out.println(ans.size());


    }
}
