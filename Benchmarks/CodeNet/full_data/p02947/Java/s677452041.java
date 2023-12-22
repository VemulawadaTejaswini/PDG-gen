import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        List<String> strList = new ArrayList<>();
        for (int i=1; i<= n; i++) {
            strList.add(scan.next());
        }
        List<String> answer = new ArrayList<>();
        for (String data: strList) {
            String[] array = data.split("");
            Arrays.sort(array, new Comparator<String>() {
                @Override
                public int compare(String obj0, String obj1) {
                    return obj0.compareTo(obj1);
                }
            });
            answer.add(String.join(",", array));
        }

        int count = 0;
        int i = 1;
        for (int y =0; y < answer.size(); y++) {
            i = y + 1;
            for (; i < answer.size(); i++) {
                if (answer.get(y).equals(answer.get(i))) {
                    count++;
                }
            }
        }

        System.out.print(count);
    }
}

