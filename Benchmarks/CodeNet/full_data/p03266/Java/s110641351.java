import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextInt();
        long k=sc.nextInt();
        if(k%2==0){
            System.out.println((long)Math.pow(((n+k/2)/k),3)+(long)Math.pow(n/k,3));
        }else{
            System.out.println((long)Math.pow(n/k,3));
        }

    }
}