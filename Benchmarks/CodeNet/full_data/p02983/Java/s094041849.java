import java.util.*;
import java.util.Collections;
import java.util.ArrayList;
 
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
 
        int L = sc.nextInt();
        int R = sc.nextInt();
        int min = 2019;

        loop:for(int i=L; i<R; i++){
            if(i%2019==0){
                continue;
            }
            for(int j=i+1; j<=R; j++){
                if(j*i%2019!=0){
                    min = Math.min(min, j*i%2019);
                }
                else if(j*i%2019==0 && (i!=L || j!=L+1)){
                    break loop;
                }
            }
        }
        System.out.println(min);
    }
}