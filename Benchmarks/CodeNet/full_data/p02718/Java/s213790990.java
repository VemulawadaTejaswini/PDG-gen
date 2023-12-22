import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        ArrayList<int> intList = new ArrayList<int>();
        for (int x=0; x<=a; x++) {
          intList.add(sc.nextInt());
        }
        Collections.sort(intList);
        if(intList[b] > 4 * a) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}