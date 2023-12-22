import java.util.Scanner;

class Main{
    static String jadg(int n){
        for(int i = 1; i <= 9; i++){
            for(int j = 1; j <= 9; j++){
                if(n == i * j){
                    return "Yes";
                }
            }
        }
        return "No";
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        String ans = jadg(n);

        System.out.println(ans);
    }
}
