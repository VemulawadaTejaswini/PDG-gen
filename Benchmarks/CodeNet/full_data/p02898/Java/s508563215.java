import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int C = 0;
        String str = sc.nextLine();
        String str1 = sc.nextLine();
        String[] input = str.split(" ");
        int N = parseInt(input[0]);
        int K = parseInt(input[1]);
        String[] input2 = str1.split(" ");
        int T = input2.length;
        for(String sot : input2){
            if(parseInt(sot)>=K){
                C++;
            }
        }
        System.out.println(C);
    }
}
