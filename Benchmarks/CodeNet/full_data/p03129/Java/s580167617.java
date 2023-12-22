import java.util.*;

class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        if(N>=K*2-1){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        
    }

}