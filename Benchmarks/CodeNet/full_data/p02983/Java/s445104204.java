import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.List;

public class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int l=sc.nextInt();
        int r=sc.nextInt();
        int x=0;
        int ans=0;
        for (int i=0;x<=r;i++){
            x=i*2019;
            if (x>=l && x<=r){
                ans=0;
                break;
            }else if (x<l){
                ans=l*(l+1);
            }
        }
        System.out.println(ans%2019);


    }

}

