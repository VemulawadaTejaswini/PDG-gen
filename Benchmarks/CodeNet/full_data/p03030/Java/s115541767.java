
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[] shop = new String[n];
        int[] point = new int[n];

        for (int i = 0; i < n; i++) {
            shop[i] = sc.next();
            point[i] = 100 - sc.nextInt();
        }

        String[] num = new String[n];

        String[] list = new String[n];

        for(int j=0; j<n;j++){
            num[j]= String.valueOf(point[j]);
            list[j]= shop[j]+num[j]+"$"+(j+1);
        }

        Arrays.sort(list);

        for(int k=0; k<n;k++){
            int index = list[k].indexOf("$");
            index += "$".length();
            System.out.println(list[k].substring(index));
        }
    }
}