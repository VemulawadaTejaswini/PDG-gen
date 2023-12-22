import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int arr[]= new int[10000];
        int p []= new int[1000];
        int q []= new int[1000];
        for (int i = 0; i <a ; i++) {
            p[i]= in.nextInt();
            q[i]= in.nextInt();

        }
        int min = 10000000,store=0;
        boolean flag = true;
        for (int i = 0; i <a ; i++) {
            if(q[i]<=b && p[i]<=a) {
                //System.out.println("TLE");
                //break;
                flag = false;
                if (min > q[i]) {
                    min = q[i];
                    store = p[i];
                    //flag = true;
                }

            }
        }
        if(flag==true )
            System.out.println("TLE");
        else
            System.out.println(store);
    }
}
