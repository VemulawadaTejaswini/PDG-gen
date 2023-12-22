import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        String[] arr = new String[num];
        
        for (int i = 0;i < num;i++){
            char[] chars = in.next().toCharArray();
            Arrays.sort(chars);
            arr[i] = new String(chars);
        }
        int count = 0;
        end:for (int i = 0;i < num - 1;i++){
            for (int j = i + 1;j < num;j++){
                if (arr[i].equals(arr[j] )){
                    count++;
                }
                if (count == num - 1){break end;}
            }
        }
        System.out.println(count);

    }
}
