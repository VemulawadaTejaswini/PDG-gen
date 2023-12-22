import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int w = sc.nextInt();

        String[][] s = new String[h+2][w+2];

        for (int i=1;i<h+1;i++){
            for (int j=1;j<w+1;j++){
                s[i][j] = sc.next();
            }
        }

        int cnt = 0;
        for (int i=1; i<h+1; i++){
            for (int j=1; j<w+1; j++){
                if (s[i][j].equals("#") && !s[i-1][j].equals("#")
                        && !s[i+1][j].equals("#") && !s[i][j-1].equals("#")
                            && !s[i][j+1].equals("#")){
                    cnt++;
                }

            }
        }
        if (cnt==0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}