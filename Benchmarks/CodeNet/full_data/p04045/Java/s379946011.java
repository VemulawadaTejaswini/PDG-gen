import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args){
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        Integer N = scanner.nextInt();
        int K = scanner.nextInt();
        TreeSet<Integer> set = new TreeSet<>();
        int ret = 0;
        for(int i = 0; i < 10; i++) {
            set.add(i);
        }
        for(int i = 0; i < K; i++) {
            set.remove(scanner.nextInt());
        }
        char[] cc = N.toString().toCharArray();
//        int n = cc[0] - '0';


        for(int i = 0; i < cc.length; i++){
            int n = cc[i] - '0';
            if(set.ceiling(n) != null) {
                ret += set.ceiling(n);
            }else{
                if(set.contains(0)) {
                    ret += set.ceiling(1) * 10;
                }else{
                    ret += set.ceiling(1) * 10;
                    ret += set.ceiling(1);
                }
                for(int j = i + 1; j < cc.length; j++) {
                    if(set.contains(0)) {
                        ret *= 10;
                    }else{
                        ret *= 10;
                        ret += set.ceiling(1);
                    }
                }
                System.out.println(ret);
                return;
            }
            ret *= 10;
        }
        System.out.println(ret / 10);
    }
}