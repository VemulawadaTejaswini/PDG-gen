
import java.util.*;


class Main {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();


        int l= Integer.toString(n,k).length();

        System.out.println(l);


    }
    public static void main2(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();


        if(n>=10){
            System.out.println(k);
            return;
        }

        int hoge=k+100*(10-n);
        System.out.println(hoge);


    }
}