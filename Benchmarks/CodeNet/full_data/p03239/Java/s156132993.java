import java.util.Scanner;

class Main {
    public static void main(String[] arg){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt(),t=sc.nextInt();
        int cost=10000;
        for(int i=0;i<n;i++){
            int ci=sc.nextInt(),ti=sc.nextInt();
            if(ti<=t && ci<cost)cost=ci;
        }
        System.out.println(cost==10000?"TLE":cost);
    }
}