import java.util.*;
 class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long x = in.nextLong();
        int count=0;
        for(long i=a;i<=b;i++){
            if(i%x==0){
                count++;
            }
        }
        System.out.println(count);
    }

}