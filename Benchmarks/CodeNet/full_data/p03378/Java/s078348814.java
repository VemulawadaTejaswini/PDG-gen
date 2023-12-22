import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int x = scanner.nextInt();
        List<Integer> placeList = new ArrayList<>();
        for (int i = 0; i < n + 1; i++) {
            placeList.add(0);
        }
        int[] costPlaceList = new int[m];
        for (int i = 0; i < m; i++) {
            costPlaceList[i] =scanner.nextInt();
        }

        for(int costPlace : costPlaceList){
            placeList.set(costPlace, 1);
        }

        int leftCost = sum(placeList.subList(0, x));
        int rightCost = sum(placeList.subList(x+1, placeList.size()));

        if(leftCost < rightCost) {
            System.out.println(leftCost);
        } else {
            System.out.println(rightCost);
        }
    }

    private static int sum(List<Integer> list){
        int result = 0;
        for(int element : list) {
            result += element;
        }
        return result;
    }
}
