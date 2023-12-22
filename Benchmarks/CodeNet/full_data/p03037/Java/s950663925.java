import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] line1 = line.split(" ");
        int a = Integer.parseInt(line1[0]);
        int b = Integer.parseInt(line1[1]);
        int[][] ary = new int[b][2];
        for(int i = 0; i < b; i++){
            String line2 = sc.nextLine();
            String[] line3 = line2.split(" ");
            ary[i][0] = Integer.parseInt(line3[0]);
            ary[i][1] = Integer.parseInt(line3[1]);
            //System.out.println(ary[i][0] + " " + ary[i][1]);
        }
        int count = 0;
        int count1 = 0;
        for(int i = 1; i < a + 1; i++){
            for(int j = 0; j < b; j++){
                if(ary[j][0] <= i && i <= ary[j][1])
                count++;
                //System.out.println(count);
            }
            if(count == b)
            count1++;
            count = 0;
        }
        System.out.println(count1);
    }
}