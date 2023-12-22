import java.util.*;
class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String sra = sc.next();
      String wk = "";
        String pre = "";
        int ret = 0;
        for (int i =0;i<n;i++){
            wk = sra.substring(i,i+1);
            if(! wk.equals(pre)) ret ++;
            pre = wk;
        }
        System.out.println(ret);
        sc.close();
    }
}

