import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = new Integer(scanner.nextLine());
        String[] temp = scanner.nextLine().split(" ");
        int A = new Integer(temp[0]);
        int B = new Integer(temp[1]);
        List<Integer> P = new ArrayList<>();
        temp = scanner.nextLine().split(" ");
        for (int i = 0; i < N; i++) {
            P.add(new Integer(temp[i]));
        }

        Collections.sort(P);

        int count = 0;
        while (true) {
            if (P.size() < 3 || P.get(0) > A || P.get(P.size()-1) < B+1) {
                break;
            }

            P.remove(0);
            int index = -1;
            for (int i = 0; i < P.size(); i++) {
                int p = P.get(i);
                if (A+1 <= p && p <= B) {
                    index = i;
                    break;
                }
            }
            if (index == -1) {
                break;
            }
            P.remove(index);
            index = -1;
            for (int i = 0; i < P.size(); i++) {
                int p = P.get(i);
                if (B+1 <= p) {
                    index = i;
                    break;
                }
            }
            if (index == -1) {
                break;
            }
            P.remove(index);
            count++;
        }

        System.out.println(count);
    }

}
