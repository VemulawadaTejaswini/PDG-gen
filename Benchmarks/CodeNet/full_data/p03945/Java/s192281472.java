import java.util.Scanner;

public class Main {
    public static void debug(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {

        String S;


        try (Scanner sc = new Scanner(System.in)) {
            S = sc.next();
        }
        char[] clist = S.toCharArray();
        int result = 0;
        for(int i = 1;i < clist.length;i++){
            if(clist[i] != clist[i-1]){
                result++;
            }
        }


        System.out.println(result);
    }

}
