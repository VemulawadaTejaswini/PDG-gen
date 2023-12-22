import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> List = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            int j = sc.nextInt();
            List.add(j);
        }
        int k = sc.nextInt();
        int num = 0;
        for (int i = 0; i < 4; i++) {
            for(int j=i+1;j<5;j++){
                if (List.get(j) - List.get(i) > k) num++;
            }
        }
        if (num == 0) System.out.println("Yay!");
        else System.out.println(":(");
    }
}