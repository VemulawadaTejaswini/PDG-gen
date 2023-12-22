import java.util.Scanner;

public class Main {

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().compute();
    }

    void compute() {
        int N = scanner.nextInt();
        ArrayList<Integer> used = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int current = scanner.nextInt();
            if(used.contains(current)){
                used.remove(new Integer(current));
            }else{
                used.add(current);
            }
        }
        System.out.println(used.size());
    }
}
