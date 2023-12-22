import java.util.*;

public class Main {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String[]> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] str = new String[3];

            str[0] = sc.next();
            str[1] = sc.next();
            str[2] = String.valueOf(i);
            list.add(str);
        }

        Collections.sort(list, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                if (o1[0].compareTo(o2[0]) != 0) {
                    return o1[0].compareTo(o2[0]);
                } else {
                    return Integer.parseInt(o2[1]) - Integer.parseInt(o1[1]);
                }
            }
        });


        for (String[] strs : list) {
            System.out.println(Integer.parseInt(strs[2]) + 1);
        }
    }
}

