
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rn-sshawish
 */
public class Main{

    public static void main(String[] args) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(input.readLine());
        long[] a = new long[n];
        long[] b = new long[n];
        StringTokenizer tokn = new StringTokenizer(input.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Long.parseLong(tokn.nextToken());
        }

        tokn = new StringTokenizer(input.readLine());
        for (int i = 0; i < n; i++) {
            b[i] = Long.parseLong(tokn.nextToken());
        }
        BigInteger xor = BigInteger.valueOf(a[0]).add(BigInteger.valueOf(b[0]));
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0) continue;
                xor = xor.xor(BigInteger.valueOf(a[i]).add(BigInteger.valueOf(b[j])));
            }
        }
        System.out.println(xor);
    }
}
