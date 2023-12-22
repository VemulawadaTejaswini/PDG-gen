import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] b = new int[n];
        String line = sc.nextLine();
        String[] line1 = line.split(" ");
        for(int i = 0; i < n - 1; i++) b[i] = Integer.parseInt(line1[i]);
        //for(int i = 0; i < n - 1; i++)  System.out.print(b[i]);
        int count = b[0] * 2;
        if(n != 2){
            for(int i = 1; i < n - 2; i++){
                if(b[i] > b[i + 1]) count += b[i + 1];
                else count += b[i];
            }
            count += b[b.length - 2];
        }
        System.out.println(count);
    }
}