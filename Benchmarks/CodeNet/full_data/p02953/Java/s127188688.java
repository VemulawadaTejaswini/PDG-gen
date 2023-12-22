import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<Integer> val = new ArrayList<>();
        for(int i=0; i<N; i++){
            val.add(scanner.nextInt());
        }
        int minRight = val.get(N-1);
        String result = "Yes";
        for(int i=N-2; i>=0; i--){
            if(val.get(i) >= minRight+2){
                result = "No";
            }
            if(minRight>val.get(i)){
                minRight = val.get(i);
            }
        }
        System.out.println(result);
    }
}