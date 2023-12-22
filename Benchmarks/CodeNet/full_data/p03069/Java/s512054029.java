import java.util.Scanner;

public class AtCoder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();

        int count =0;
        boolean start=false;
        for (int i = 0; i <N ; i++) {
            char c2  = S.charAt(i);
            if(c2 == '#' ){
                start=true;
            }
            if(start && c2 =='.'){
                count++;
            }
        }

        System.out.println(count);
    }

}
