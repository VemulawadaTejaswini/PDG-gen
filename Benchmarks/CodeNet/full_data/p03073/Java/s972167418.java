import java.util.*;

public class Main{

    public static List<Integer> P;
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        char [] cha = S.toCharArray();

        int countFrom1 = 0;
        int countFrom0 = 0;
        for(int i=0; i<S.length(); i++){
            if(i%2==0 && cha[i]=='1'){
                countFrom0++;
            }
            if(i%2==1 && cha[i]=='0'){
                countFrom0++;
            }
            if(i%2==0 && cha[i]=='0'){
                countFrom1++;
            }
            if(i%2==1 && cha[i]=='1'){
                countFrom1++;
            }
        }
        System.out.println(Math.min(countFrom0, countFrom1));
    }
}