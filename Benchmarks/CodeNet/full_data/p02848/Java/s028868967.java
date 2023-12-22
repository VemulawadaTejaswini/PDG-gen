import java.util.*;
public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int x = sc.nextInt();
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        String s = sc.next();
        int count = s.length();
        String ss[] = new String[count];


        char[] moji = s.toCharArray();

        for(int i=0;i<count;i++) {
            moji[i]+=n;
            if(moji[i]>90)
            {
                moji[i]-=26;
            }
            System.out.print(moji[i]);
        }




    }
}
