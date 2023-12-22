import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        int[] apple = new int[n];
        for(int i = 0; i < n; i++){
            apple[i] = l + i;
        }
        int taste = 0;
        for(int i = 0; i < n; i++){
            taste = taste + apple[i];
        }
        int taste2 = 0;
        int sub = 100000;
        int eaten = 0;
        for(int i = 0; i < n; i++){
            taste2 = taste - apple[i];
            if(sub > Math.abs(taste-taste2)){
                sub = Math.abs(taste - taste2);
                eaten = i;
            }
        }
        System.out.print(taste - apple[eaten]);
    }
}