import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        long n = stdIn.nextLong();
        long blue = stdIn.nextLong();
        long red = stdIn.nextLong();
        String s = "";
        long rb_sum = 0;
        long sum = 0;

        while(n > rb_sum){
            for(long i = 0; i < blue; i++){
                s += 'b';
            }
            for(long i = 0; i < red; i++){
                s += 'r';
            }
            rb_sum += (red + blue);
        }

        for(int i = 0; i < n; i++){
            if(s.charAt(i) == 'b'){
                sum++;
            }
        }

        System.out.println(sum);
    }
}