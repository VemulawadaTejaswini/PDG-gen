import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        sc.nextLine();
        int i;
        for(i=1;N==0;i++){
            N/=K;
        }
        System.out.println(i);
    }
}