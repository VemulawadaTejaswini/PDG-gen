import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] s = new int[n];
        int[] c = new int[n];
        for(int i = 0; i < n; i ++){
            s[i] = sca.nextInt();
            c[i] = s[i];
        }
        Arrays.sort(c);
        for(int j = 0; j < n; j++){
            if(c[j] != s[j]){
                counter++;
            }
        }
        System.out.print((counter==2 ? "YES" : "NO"));
        scan.close();
    }
}