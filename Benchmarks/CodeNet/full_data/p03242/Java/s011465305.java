import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        String N2 = String.valueOf(N);
        String result = "";

        for(int i = 0; i<N2.length(); i++){
            String temp = N2.substring(i,i+1);
            if(temp.equals("9")) {
                temp = "1";
            }else{
                temp = "9";
            }

            result += temp;
        }
        System.out.print(result);
    }
}
