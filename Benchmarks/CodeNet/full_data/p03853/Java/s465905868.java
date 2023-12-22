import java.util.*;
public class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        char[][] c =new char[h][w];



        for(int i =0;i<h;i++){
            String moji = sc.next();
            for(int j = 0;j<w;j++){
                c[i][j] = moji.charAt(j);
            }
        }

        for(int i = 0;i<h;i++){
            for(int j =0;j<w;j++){
                System.out.print(c[i][j]);
            }
            System.out.println();
            for(int j =0;j<w;j++){
                System.out.print(c[i][j]);
            }
            System.out.println();
        }
            

    }
}




