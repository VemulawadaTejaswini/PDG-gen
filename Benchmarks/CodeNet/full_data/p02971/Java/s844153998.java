import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> original = new ArrayList<>();
        ArrayList<Integer> sorted = new ArrayList<>();

        int N = scanner.nextInt();

        for(int i=0; i<N; i++){
            int tmp = scanner.nextInt();
            original.add(tmp);
            sorted.add(tmp);
        }

        Collections.sort(sorted, Collections.reverseOrder());

        for(int i=0; i<N; i++){
            if(original.get(i) == sorted.get(0)){
                System.out.println(sorted.get(1));
            }else{
                System.out.println(sorted.get(0));
            }
        }
    }
}
