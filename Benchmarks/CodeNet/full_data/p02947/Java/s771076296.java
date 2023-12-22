import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        
        int N = Integer.parseInt(line);
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < N; i++) {
            list.add(sc.nextLine());
        }
        
        long count = 0;
        for (int i = 0; i < N ; i++) {
            for (int j = i + 1; j < N ; j++) {
                char[] arr1 = list.get(i).toCharArray();
                char[] arr2 = list.get(j).toCharArray();
                Arrays.sort(arr1);
                Arrays.sort(arr2);
                if (Arrays.equals(arr1, arr2)) {
                    count++;
                }
            }
        }
        
        System.out.println(count);

    }
}