import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int x = sc.nextInt();
        int[] box = new int[k*2-1];
        
        for(int i=0; i<box.length;i++) {
            box[i]=(x-k)+(i+1);
            System.out.println(box[i]);
        }
    }
}