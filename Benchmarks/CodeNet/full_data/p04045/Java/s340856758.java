import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        String number = sc.next();
        int k = sc.nextInt();
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            list.add(String.valueOf(i));
        }
        while (k-- > 0) {
            list.remove(sc.next());
        }
        
        String tmp = "";
        for (int i = number.length() - 1; i >= 0; i--) {
            int x = Integer.parseInt(String.valueOf(number.charAt(i)));
            
            boolean done = false;
            for (String num : list) {
                if (Integer.parseInt(num) >= x) {
                    tmp = num + tmp;
                    done = true;
                    break;
                }
            }
            
            if (!done) {
                tmp = String.valueOf(list.get(0)) + tmp;
            }
        }
        
        if (Integer.parseInt(tmp) < Integer.parseInt(number)) {
            if (list.get(0).equals("0")) {
                tmp = String.valueOf(list.get(1)) + tmp;
            } else {
                tmp = String.valueOf(list.get(0)) + tmp;
            }
        }
        
        System.out.println(tmp);
    }
}
