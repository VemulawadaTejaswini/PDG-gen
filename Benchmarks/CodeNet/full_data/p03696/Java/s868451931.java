import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String S = sc.next();

        byte[] bytes = S.getBytes();
        for(int i = 0; i < N; i++){
            if(bytes[i] != '('){
                continue;
            }
            for(int j = i + 1; j < N; j++){
                if(bytes[j] == ')'){
                    bytes[i] = bytes[j] = 0;
                    break;
                }
            }
        }

        int lcnt = 0;
        int rcnt = 0;
        for(int i = 0; i < N; i++){
            if(bytes[i] == '('){
                lcnt += 1;
            }

            if(bytes[i] == ')'){
                rcnt += 1;
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append("(".repeat(rcnt));
        sb.append(S);
        sb.append(")".repeat(lcnt));

        System.out.println(sb.toString());
    }
}
