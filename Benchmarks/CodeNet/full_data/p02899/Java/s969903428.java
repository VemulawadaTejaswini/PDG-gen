import java.util.*;

class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int[] ret = new int[a];
        int wk;
        for(int i =0;i<a;i++){
            wk =Integer.parseInt(sc.next());
            ret[wk-1] = i;
        }
        StringBuilder retstr = new StringBuilder();
        for(int x : ret){
            retstr.append(x+1).append(" ");
        }
        retstr.setLength(retstr.length()-1);
        System.out.println(retstr.toString());
        sc.close();
    }
}