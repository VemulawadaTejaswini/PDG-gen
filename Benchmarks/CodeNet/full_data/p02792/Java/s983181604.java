import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long ans = 0;
        for(int a = 1 ; a <= n ; a++){
            int tmp = 1;
            while(tmp*10 < a){
                tmp *= 10;
            }
            ans += count(a% 10, a/tmp, n);
        }
        System.out.println(ans);
    }

    static long count(int first, int last, int max){
        if(first == 0 || last == 0){
            return(0);
        }
        int keta = 0;
        int tmp = max;
        while(tmp > 0){
            tmp /= 10;
            keta++;
        }

        long ans = 0;
        if(first == last && max >= first){
            ans = 1;
        }
        if(keta == 1){
            return(ans);
        }

        long tens = 1;
        for(int i = 2 ; i < keta ; i++){
            ans += tens;
            tens *= 10;
        }


        long F = first*tens*10+last;
        long L = first*tens*10+last;
        long tens2 = 10;
        for(int i = 1; i < keta ; i++){
            L += 9*tens2;
            tens2 *= 10;
        }

        if(F <= max){
            ans += tens;
        }else{
            ans += (max - F)/10 < 0 ? 0 : (max - F)/10;
        }

        return(ans);
    }
}