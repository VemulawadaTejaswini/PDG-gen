import java.util.Scanner;

public class Main{

    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        Integer n = Integer.parseInt(scan.next());
        Integer p[] = new Integer[n];

        for(int i=0;i<n;i++)   
            p[i] = Integer.parseInt(scan.next());

        int cnt = 0;
        for(int i=1;i<n-1;i++){
            if((p[i] < p[i-1] && p[i] > p[i+1]) || (p[i] > p[i-1] && p[i] < p[i+1])){
                cnt++;
            }
        }

        System.out.println(cnt);

    }
}