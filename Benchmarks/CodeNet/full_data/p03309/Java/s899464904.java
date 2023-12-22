import java.util.*;


public class Main {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        
        int standard = s.nextInt();
        int array[] = new int[standard];

        int distance = 0;
        for (int i = 0; i < standard; i++) {
            array[i] = s.nextInt();

            distance += (array[i] - i - 1); 
        }

        int b = distance / standard;

        int ans[] = new int[3];

        for (int i = 0; i < standard; i++) {
            ans[0] += Math.abs(array[i]-(b + i + 1));
            ans[1] += Math.abs(array[i]-(b + i));
            ans[2] += Math.abs(array[i]-(b + i - 1));
        }

        int min = ans[0];
        for (int i = 1; i < 3; i++) {
            int temp = ans[i];
            if (temp < min ) {
                min = temp;
            }
        }
        System.out.println(min);
    }
}