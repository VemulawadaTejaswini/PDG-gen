import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] list2 = new String[n];
        for(int i = 0; i < n; i++){
            String line = sc.nextLine();
            char[] line1 = line.toCharArray();
            java.util.Arrays.sort(line1);
            list2[i] = String.valueOf(line1);
        }
        long count = 0;
        for(int i = 0; i < n - 1; i++){
            for(int j = i + 1; j < n; j++){
                if(list2[i].equals(list2[j]))    count++;
            }
        }
        System.out.println(count);
    }
}