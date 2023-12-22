
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rn-sshawish
 */
public class Atcoder91B {

    public static void main(String[] args) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(input.readLine());
        HashSet<String> hashSet = new HashSet<>();
        for (int i = 0; i < n; i++) {
            hashSet.add(input.readLine());
        }
        int m = Integer.parseInt(input.readLine());
        HashSet<String> hashSet2 = new HashSet<>();
        for (int i = 0; i < m; i++) {
            hashSet2.add(input.readLine());
        }
        int count = 0;
        for (String string : hashSet) {
            if (!hashSet2.contains(string)) {
                count++;
            }
        }
        if (count == 0) {

            for (String string : hashSet2) {
                if (!hashSet.contains(string)) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
