import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long val = 0;
        if(n < 9){System.out.println(n);return;}
        else{
            Deque<Long> l = new ArrayDeque<>();
            for(long i = 1; i <= 9; i++){
                l.add(i);
            }
            for(int i = 0; i < n; i++){
                val = l.poll();
                if(val%10!=0){l.add(val*10 + val%10-1);}
                l.add(val*10+val%10);
                if(val%10!=9){l.add(val*10+val%10+1);}
            }
        }
        System.out.println(val);
    }
}

