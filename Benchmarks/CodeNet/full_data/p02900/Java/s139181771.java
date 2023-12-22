import java.util.*;
class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b = sc.nextInt();
        long wk_no = a < b ? a : b;
        boolean tar_flg;
        int cont = 0;
       
        for(long i = 1 ;i < wk_no ; i++){
            tar_flg = true;
            if(a%i == 0 && b%i == 0){
                for(long m = 2 ; m < i ; m++){
                    if(i%m == 0){
                        tar_flg = false;
                        break;
                    } 
                }
                if(tar_flg) cont ++;
            }
        }
        if(a == 1 ||  b == 1) cont ++;
        System.out.println(cont);
        sc.close();
    }
}
