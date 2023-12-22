import java.util.*;

class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int count =1;

        for(int i = 1;i<=N;i++){
            i += 2;
            count ++;
        }
        if(count>=K){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        
    }

}