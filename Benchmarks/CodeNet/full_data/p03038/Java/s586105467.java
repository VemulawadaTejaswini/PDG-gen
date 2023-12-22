import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        int bal[] = new int[n];
        for(int i=0;i<n;i++){
            bal[i] = Integer.parseInt(sc.next());
        }
        Arrays.sort(bal);
        int cal[][] = new int[m][2];
        for(int i=0;i<m;i++){
            cal[i][0] = Integer.parseInt(sc.next());
            cal[i][1] = Integer.parseInt(sc.next());
        }
        Arrays.sort(cal, new Comparator<int[]>() {
            @Override
            public int compare(int[] a1, int[] a2){
                return Integer.compare(a2[1], a1[1]);
            }
        });

        int j=0; boolean f=true;
        for(int i=0;i<m;i++){
            while(cal[i][0]>0){
                if(cal[i][1] <= bal[j]){
                    f = false;
                    break;
                }
                bal[j] = cal[i][1];
                j++;
                cal[i][0] -= 1;
            }
            if(!f){
                break;
            }
        }
        Long sum = new Long(0);
        for(int i=0;i<n;i++){
            sum += bal[i];
        }
        System.out.println(sum);
        sc.close();
    }
}