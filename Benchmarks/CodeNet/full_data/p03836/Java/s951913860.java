import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int x = Integer.parseInt(s[0]);
        int y = Integer.parseInt(s[1]);
        int x_ = Integer.parseInt(s[2]);
        int y_ = Integer.parseInt(s[3]);

        int hor = y_ - y;
        int ver = x_ - x;

        StringBuilder ans = new StringBuilder();

        StringBuilder sbf = new StringBuilder();
        for(int i=0; i<ver; i++) sbf.append("U");
        for(int i=0; i<hor; i++) sbf.append("R");
        String forward = new String(sbf);
        ans.append(forward);

        StringBuilder sbb = new StringBuilder();
        for(int i=0; i<ver; i++) sbb.append("D");
        for(int i=0; i<hor; i++) sbb.append("L");
        String backward = new String(sbb);
        ans.append(backward);

        sbf.delete(0, sbf.length());
        sbf.append("LU");
        sbf.append(forward);
        sbf.append("RD");
        forward = new String(sbf);
        ans.append(forward);

        sbb.delete(0, sbb.length());
        sbb.append("RD");
        sbb.append(backward);
        sbb.append("LU");
        backward = new String(sbb);
        ans.append(backward);

        System.out.println(ans);
    }
}