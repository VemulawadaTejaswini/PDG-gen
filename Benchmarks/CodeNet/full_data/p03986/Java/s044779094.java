import java.util.*;

public class Main{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String X = sc.next();
        sc.close();

        char[] c = new char[X.length()];
        int left_s = 0; //最も左のS
        int right_t = X.length(); //最も右のT
        for(int i = 0; i < X.length(); i++){
            c[i] = X.charAt(i);
        }
        for(int i = 0; i < X.length(); i++){
            if(c[i] == 'S'){
                left_s = i;
                break;
            }
        }
        for(int i = X.length()-1; i >= 0; i--){
            if(c[i] == 'T'){
                right_t = i;
                break;
            }
        }

        if(right_t < left_s)
            System.out.println(X.length());
        else{
            int counts = 0;
            int countt = 0;
            for(int i = left_s; i <= right_t; i++){
                if(c[i] == 'S')
                    counts++;
                else
                    countt++;
            }
            System.out.println(X.length() - 2*Math.min(counts, countt));
        }
    }
}