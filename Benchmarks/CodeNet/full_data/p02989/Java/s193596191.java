import java.util.*;

public class Main {
    public static void main(String[] args){
        new Main().run();
    }

    int N;
//    int[] d;
    private void run() {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        List<Integer> d = new ArrayList<>();
        for(int i = 0; i < N; i++) {
            d.add(i, scanner.nextInt());
        }
        if(N % 2 == 1) {
            System.out.println(0);
            return;
        }
        // sort
        d.sort(Comparator.naturalOrder());
        int index = N / 2;
        int a = d.get(index);
        int b = d.get(index-1);

        System.out.println(a-b);
    }

}