import java.util.*;
public class Main
{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int N = reader.nextInt();
        int temp = 1;
        long jumlah = 0;
        while(temp<N){
            if(temp % 5 != 0 && temp % 3!= 0){
                jumlah = jumlah + temp;
                
            }
            temp++;
        }
        System.out.println(jumlah);
    }
}
