import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        // Here your code !
        Scanner sc = new Scanner(System.in);
        String[] S = new String[3];
        for(int i=0;i<3;i++){
            S[i] = sc.next();
        }
        int next = 0;
        boolean end = false;
        String winner = null;
        while(!end){
            if(S[next].equals("")){
                switch(next){
                    case 0:
                        winner = "a";
                        break;
                    case 1:
                        winner = "b";
                        break;
                    case 2:
                        winner = "c";
                        break;
                }
                end = true;
            }else{
                switch(S[next].substring(0)){
                case "a":
                    next = 0;
                    break;
                case "b":
                    next = 1;
                    break;
                case "c":
                    next = 2;
                    break;
                }
                S[next] = S[next].substring(1,S[next].length());
                
            }
            
        }
        System.out.println(winner);
    }
}
