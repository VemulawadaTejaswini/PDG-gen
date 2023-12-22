import java.io.*;
import java.util.*;
import java.lang.String;
import java.util.Arrays;

import static java.lang.Integer.*;

public class Main extends PrintWriter {
    Main() { super(System.out, true); }
    Scanner sc = new Scanner(System.in);
    public static void main(String[] $) {
        Main o = new Main(); o.main(); o.flush();
    }
    //took bsearch from Dukkha
    private static int binSearch(Integer[] arr, int number){
        int left=0,right=arr.length-1,mid=(left+right)/2,ind=0;
        while(left<=right){
            if(arr[mid]<=number){
                ind=mid+1;
                left=mid+1;
            }
            else
                right=mid-1;
            mid=(left+right)/2;
        }
        return ind;
    }

    void main() {

        String S = sc.next();
        if(S.charAt(2) == S.charAt(3) && S.charAt(4) == S.charAt(5)){
            print("Yes");
        }
        else print("No");

    }
}