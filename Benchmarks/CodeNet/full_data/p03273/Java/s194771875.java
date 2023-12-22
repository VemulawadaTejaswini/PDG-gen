import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h = Integer.parseInt(sc.next());
        int w = Integer.parseInt(sc.next());
        sc.nextLine();
        String[][] darr = new String[h][w];
        for (int i = 0; i < h ; i++) {
            String[] str = sc.nextLine().split("");
            for (int j = 0; j < w; j++) {
                darr[i][j] = str[j];
            }
        }
        //search yoko
        boolean flag = false;
        for (int i = 0; i < h ; i++) {
            for (int j = 0; j < w; j++) {
                flag = darr[i][j].equals(".")||darr[i][j].equals("0")? true : false;
                if(!flag) break;
            }
            if (flag) {
                //System.out.println("ok");
                for (int j = 0; j < w; j++) {
                    darr[i][j] = "0";
                }
            }
            flag = false;
        }
        //seatch tate
        for (int i = 0; i < w ; i++) {
            for (int j = 0; j < h; j++) {
                flag = darr[j][i].equals(".")||darr[j][i].equals("0")? true : false;
                if(!flag) break;
            }
            if (flag) {
                //System.out.println("ok");
                for (int j = 0; j < w; j++) {
                    darr[j][i] = "0";
                }
            }
            flag = false;
        }
        //print
        boolean f = false;
        String  strr ="";
        //System.out.println(Arrays.deepToString(darr));
        for (int i = 0; i < h ; i++) {
            for (int j = 0; j < w; j++) {
                if(!darr[i][j].equals("0")){
                    strr += darr[i][j];;
                }
            }
            if(!strr.equals(""))System.out.println(strr);  
            strr ="";
        }
    }
}