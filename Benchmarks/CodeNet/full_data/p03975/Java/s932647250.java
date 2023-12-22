import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int n=scan.nextInt();
        int left=scan.nextInt();
        int right=scan.nextInt();
        int cnt=0;
        int temp;
        for(int i=0;i<n;i++){
            temp=scan.nextInt();
            if(temp<left || right<=temp)
                cnt++;
        }
        System.out.println(cnt);
    }
}
