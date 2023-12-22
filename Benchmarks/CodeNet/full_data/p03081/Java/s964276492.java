import java.util.Scanner;

public class Main {
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    String[] s = sc.nextLine().split(" ",0);
    int N = Integer.parseInt(s[0]);
    int Q = Integer.parseInt(s[1]);
    String str = sc.nextLine();
    int a = str.length();
    String[] st = new String[N];
    String[][] b = new String[Q][2];
    int[] location = new int [N];
    for (int i = 0;i < N;i++){
            st[i] = str.substring(i,i+1);
            location[i] = 1;
    }
    for (int i =0;i < Q;i++){
            s = sc.nextLine().split(" ",0);
            b[i][0] = s[0];
            b[i][1] = s[1];
    }
    int[] buf = new int [N];
    for (int i  = 0;i < Q;i++){
        for (int k = 0;k < N;k++) {
            buf[k] = location[k];
        }
        for (int j= 0;j <N;j++){
            if (b[i][0].equals(st[j])) {
                if (b[i][1].equals("L") && j== 0){
                    location[j]--;
                } else if (b[i][1].equals("R") && j== a-1){
                    location[j]--;
                } else if (b[i][1].equals("R")){
                    location[j]--;
                    location[j + 1]++;
                } else if (b[i][1].equals("L")){
                    location[j - 1]++;
                    
                }
            }
        }
        for (int k = 0;k < N;k++) {
            if (buf[k]==0 && k ==0) {
                if (b[i][0].equals("L")) {
                    location[k] = 0;
                }
            } else if (buf[k]==0 && k ==N-1) {
                if (b[i][0].equals("R")) {
                    location[k] = 0;
                }
            } else if (buf[k]==0) {
                if (b[i][0].equals("L")) {
                    location[k] = 0;
                    location[k-1]--;
                } else if(b[i][0].equals("R")) {
                    location[k] = 0;
                    location[k + 1]--;
                }
            }
        }
    }
    
    
    int sum = 0;
    for (int i = 0;i < N;i++ ) {
        sum = sum + location[i];
    }
    System.out.println(sum);
  }

}
