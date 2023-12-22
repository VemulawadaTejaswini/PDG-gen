import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String S = "";

        int N = scan.nextInt();
        if(N==0)i{
            System.out.println("0");    
            System.exit(0);
        }
        while(N != 1){
            if(N % -2 == -1){
                S = "1" + S;
                N = N/-2 + 1;
            }
            else if(N % -2 == 1){
                S = "1" + S;
                N = N/-2;
            }
            else{
                S = "0" + S;
                N = N/-2;
            }
        }
        S = "1" + S;
        System.out.println(S);
    }
}
