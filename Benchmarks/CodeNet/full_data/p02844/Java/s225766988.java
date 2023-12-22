import  java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        String S1 = scan.next();
        char[] S = S1.toCharArray();
        String[] pass = new String[1000]; //最高でも10^3通り
        int c=0;

        for(int i=0; i<N-2; i++){
            pass[c] = "" + S[i];
            for(int j=i+1; j<N-1; j++) {
                pass[c] = pass[c] + S[j];
                String tmp1 = pass[c].substring(0,1);
                for (int k = j + 1; k < N; k++) {
                    pass[c] = pass[c] + S[k];
                    String tmp2 = pass[c].substring(0,2);
                    if(c==0){
                        c++;
                        pass[c] = tmp2;
                    }else {
                        for (int l = 0; l < c; l++) {
                            if (pass[c].equals(pass[l])) {
                                pass[c] = tmp2;
                                break;
                            } else if (l == c - 1) {
                                c++;
                                pass[c] = tmp2;
                                break;
                            }
                        }
                    }
                }
                pass[c] = tmp1;
            }
        }
        System.out.println(c);
    }
}