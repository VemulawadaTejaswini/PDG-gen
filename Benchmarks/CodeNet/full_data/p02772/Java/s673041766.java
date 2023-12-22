import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean ok = true;
        for(int i = 0;i < n;i++){
            int num = sc.nextInt();
            if(num%2 != 0||(num%3==0||num%5==0)){
                ok = true;
            }else{
                ok = false;
                break;
            }
        }
        System.out.println(ok?"APPROVED":"DENIED");
    }
}
