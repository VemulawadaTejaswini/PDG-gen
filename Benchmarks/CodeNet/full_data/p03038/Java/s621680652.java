import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] line1 = line.split(" ");
        int a = Integer.parseInt(line1[0]);
        int b = Integer.parseInt(line1[1]);
        Long[] ary = new Long[a];
        String line2 = sc.nextLine();
        String[] line3 = line2.split(" ");
        for(int i = 0; i < a; i++)
        ary[i] = Long.parseLong(line3[i]);
        Arrays.sort(ary);
        int[] c = new int[b];
        Long[] d = new Long[b];
        for(int i = 0; i < b; i++){
            String line4 = sc.nextLine();
            String[] line5 = line4.split(" ");
            c[i] = Integer.parseInt(line5[0]);
            d[i] = Long.parseLong(line5[1]);
        }
        for(int i = 0; i < d.length - 1; i++){
            for(int j = d.length - 1; j > i; j--){
                if(d[j - 1] > d[j]){
                    Long temp = d[j - 1];
                    d[j - 1] = d[j];
                    d[j] = temp;
                    int temp2 = c[j - 1];
                    c[j - 1] = c[j];
                    c[j] = temp2;
                }
            }
        }
        for(int i = 0; i < b; i++){
            for(int j = 0; j < c[i]; j++){
                if(d[i] > ary[j])
                ary[j] = d[i];
            }
            Arrays.sort(ary);
        }
        long e = 0;
        for(int i = 0; i < ary.length; i++)
        e = e + ary[i];
        System.out.println(e);
    }
}