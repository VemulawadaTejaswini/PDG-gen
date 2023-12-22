import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int rem = 0;

        List<Character> list = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            list.add(s.charAt(i));
        }

        while (true) {
            boolean isExist = false;
            List<Integer> tmp = new LinkedList<>();
            for (int i = 1; i < list.size(); i++) {
                if (list.get(i-1) != list.get(i)) {
                    tmp.add(i-1);
                    tmp.add(i);
                    list.set(i-1, '2');
                    list.set(i, '2');
                    rem+=2;
                    i++;
                    isExist = true;
                }
            }
            if (!isExist) break;
            while (list.contains(Character.valueOf('2'))) list.remove(Character.valueOf('2'));
        }
        System.out.println(rem);

    }

}
