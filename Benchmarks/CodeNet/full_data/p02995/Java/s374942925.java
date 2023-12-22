import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();
        sc.close();
        int count = 0;
        //A以上B以下で回す
        for(long i = a; i <= b; i++){
            //CでもDでも割り切れない
            if(((i % c) != 0) && ((i % d) != 0)){
                count++;
            }
        }
        System.out.println(count);
    }
}   