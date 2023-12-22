import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args){
        new Main().run();
    }
    TreeSet<Integer> set;

    private void run() {
        Scanner scanner = new Scanner(System.in);
        Integer N = scanner.nextInt();
        int K = scanner.nextInt();
        set = new TreeSet<>();
        for(int i = 0; i < 10; i++) {
            set.add(i);
        }
        for(int i = 0; i < K; i++) {
            set.remove(scanner.nextInt());
        }
        for(int i = N; i < Integer.MAX_VALUE; i++) {
            if(correct(i)){
                System.out.println(i);
                return;
            }
        }
    }

    private boolean correct(Integer i) {
        for(char c : i.toString().toCharArray()){
            if(!set.contains(c - '0')) return false;
        }
        return true;
    }
}