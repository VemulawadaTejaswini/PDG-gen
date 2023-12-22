import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String S = "";

        int N = scan.nextInt();

        while(true){
            if(N == 1){
                S = "1" + S;
                break;
            }
            if(N % -2 == -1){
                S = "1" + S;
                N = N/-2 + 1;
            }
            else if(N  % -2 == 1){
                S = "1" + S;
                N = N/-2;
            }
            else{
                S = "0" + S;
                N = N/-2;
            }
        }
        System.out.println(S);
    }
}
