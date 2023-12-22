import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cnt = Integer.parseInt(scan.next());
        String slimes = scan.next();

        //int second = Integer.parseInt(scan.next());
        //long in = Long.parseLong(scan.next());
        //String s = scan.next();
        //String second = scan.next();
        List<String> result = new ArrayList<>();
        for (int i = 0; i <cnt; i++) {
            if(i==0) {
                result.add(slimes.substring(0, 1));
            } else if(!slimes.substring(i-1,i).equals(slimes.substring(i, i+1))) {
                result.add(slimes.substring(i, i + 1));
            }
        }
        System.out.println(result.size());
        //result(sum>=power);
    }

    public static void result(boolean flg) {
        if(flg) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
