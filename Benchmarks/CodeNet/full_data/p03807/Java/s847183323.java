package grand_04_02_17;

import java.util.Scanner;

/**
 * Created by srikanth on 04-02-2017.
 */
public class Addition {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int even=0,odd=0;
        int N=scan.nextInt();
        while(N-->0){
            int i=scan.nextInt();
            if(i%2==0){
                even++;

            }
            else{
                odd++;
            }
        }
        if(odd%2==1 && even>0)
            System.out.println("NO");
        else{
            System.out.println("YES");
        }
    }
}
