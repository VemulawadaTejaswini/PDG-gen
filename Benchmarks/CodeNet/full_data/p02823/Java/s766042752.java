import java.util.*;

class Main{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        int N=sc.nextInt(),A=sc.nextInt(),B=sc.nextInt(),d=B-A;
        if(d%2==0){
            System.out.println(d/2);
        }
        else{
            int c=Math.min(A-1,N-B);
            System.out.println(d/2+c+1);
        }
    }
}
