import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String line = sc.nextLine();
        String[] line1 = line.split(" ");
        String line2 = sc.nextLine();
        String[] line3 = line2.split(" ");
        int[] ary1 = new int[n + 1];
        int[] ary2 = new int[n];
        int count = 0;
        for(int i = 0; i < n + 1; i++)  ary1[i] = Integer.parseInt(line1[i]);
        for(int i = 0; i < n; i++)  ary2[i] = Integer.parseInt(line3[i]);
        for(int i = 0; i < n; i++){
            if(ary1[i] < ary2[i]){
                int a = ary2[i] - ary1[i];
                count += ary1[i];
                //ary1[i] = 0;
                if(a <= ary1[i + 1]){
                    ary1[i + 1] -= a;
                    count += a;
                }
                else{
                    count += ary1[i + 1];
                    ary1[i + 1] = 0;
                }
            }
            else    count += ary2[i];
        }
        System.out.println(count);
    }
}