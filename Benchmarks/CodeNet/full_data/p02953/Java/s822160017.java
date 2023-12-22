import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] ary = new int[n];
        String line = sc.nextLine();
        String[] line1 = line.split(" ");
        boolean ans = true;
        for(int i = 0; i < n; i++)  ary[i] = Integer.parseInt(line1[i]);
        for(int i = 0; i < n - 1; i++){
            if(ary[i] > ary[i + 1]){
                ary[i] -= 1;
                break;
            }
        }
        for(int i = 0; i < n - 1; i++){
            if(ary[i] > ary[i + 1]) ans = false;
        }
        if(ans) System.out.println("Yes");
        else    System.out.println("No");
    }
}