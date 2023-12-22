import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        ArrayList<Integer> intList = new ArrayList<Integer>();
        int sum = 0;
        for (int x = 0; x < a; x++) {
            int c = sc.nextInt();
            intList.add(new Integer(c));
            sum += c;
        }
        Collections.sort(intList);
        if ((double)intList.get(intList.size() - b) > (double) (sum /(4 * b))) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}