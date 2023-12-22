import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        String[] a1 = scan.nextLine().split(" ");
        String[] a2 = scan.nextLine().split(" ");

        int max = 0;
        for(int i=0; i<n; i++){
            int cnt = 0;
            for(int j=0; j<=i; j++){
                cnt += Integer.parseInt(a1[j]);
            }
            for(int j=i; j<n; j++){
                cnt += Integer.parseInt(a2[j]);
            }
            if(cnt > max) max = cnt;
        }

        System.out.println(max);

        scan.close();
    
    }

}