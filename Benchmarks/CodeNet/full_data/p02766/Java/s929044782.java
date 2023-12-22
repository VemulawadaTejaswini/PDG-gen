import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        sc.nextLine();
        int i=1;
        for(;;){
            N/=K;
            if(N==0)break;
            i++;
        }
        System.out.println(i);
    }
}