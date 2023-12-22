import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Long N = sc.nextLong();
        Long[] cities = new Long[5];
        for(int i = 0 ; i < 5 ; i++){
            cities[i] = sc.nextLong();
        }
        sc.close();

        Arrays.sort(cities);
        long min = cities[0];

        long ans = 0 ;
        ans += N/min;
        if(N%min != 0){
            System.out.println(ans + 5);
        }
        else{
            System.out.println(ans + 6);
        }



    }
}