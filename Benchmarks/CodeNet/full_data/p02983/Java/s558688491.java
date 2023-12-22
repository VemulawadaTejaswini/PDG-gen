import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int L = sc.nextInt();
        int R = sc.nextInt();

        int min = 2019;
        if( (R-L) >= 2019)
            min = 0;
        else  {
            for(int i = 0; i <= (R-L+-1); i++){
                for(int j = i+1; j <= (R-L); j++){
                    int mod_i = (L+i) % 2019;
                    int mod_j = (L+j) % 2019;
                    int mod_ij = (mod_i * mod_j) % 2019;
                    if(mod_ij < min)
                        min = mod_ij;
                }
            }
        }
        System.out.println(min);
        sc.close();
    }
}