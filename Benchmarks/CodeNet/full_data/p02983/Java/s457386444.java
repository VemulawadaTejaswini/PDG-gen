import java.io.BufferedReader;
import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Collections;
import java.util.Arrays;

public class Main {
	public static void main(final String[] args){
    
    final Scanner sc = new Scanner(System.in);
    final long l = sc.nextLong();
    final long r = sc.nextLong();
    //final List<Integer> list = new ArrayList<>();
    long min = 10000;
    long min2 = 10000;
    long hoge1 = 0;
    long hoge2 = 0;
    long ans = 0;

    long check = r - l + 1;
    if(check >= 2019){
        System.out.println(0);
    }else{
        for(long i = l ; i <= r ; i++){
            for(long j = i + 1; j <= r ; j++){
                hoge1 = i;
                hoge2 = j;
                hoge1 = hoge1 % 2019;
                hoge2 = hoge2 % 2019;

                ans = hoge1 * hoge2;

                while(ans >= 2019){
                    ans = ans % 2019;
                }
                if(min >= ans){
                    min = ans;
                }
            }
        }
        System.out.println(min);
    }
    


    



    





}
}