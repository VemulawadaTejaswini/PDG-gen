import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        int[] yono = new int[5];
        Arrays.fill(yono , 0);
        for(int i = 0 ; i < n ; i++ ){
            s[i] = sc.next();
            if(s[i].charAt(0) == 'M'){
                yono[0]++;
            }
            if(s[i].charAt(0) == 'A'){
                yono[1]++;
            }
            if(s[i].charAt(0) == 'R'){
                yono[2]++;
            }
            if(s[i].charAt(0) == 'C'){
                yono[3]++;
            }
            if(s[i].charAt(0) == 'H'){
                yono[4]++;
            }
        }
        sc.close();
        long ebishu = 0;
        for(int i = 0 ; i < 5 ; i++){
            for(int j = 0 ; j < i ; j++){
                for(int k = 0 ; k < j ; k++){
                    ebishu += (yono[i] * yono[j] * yono[k]);
                }
            }
        }
        System.out.println(ebishu);
    }
}