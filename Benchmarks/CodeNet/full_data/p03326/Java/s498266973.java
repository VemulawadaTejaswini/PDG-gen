import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Arrays;
import java.util.Collections;
 
 
class Main
{
    public static void main(String[] args)
    {
        int ans = 0;
        int count = 0;
        ArrayList<Integer> foo = new ArrayList<>();
        
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        for(int i = 0; i< n;i++){
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int z = scanner.nextInt();
            foo.add(Math.abs(x)+Math.abs(y)+Math.abs(z));
        }

        Collections.sort(foo, Collections.reverseOrder());
        
        for(int j = 0; j< m ;j++){
            ans += foo.get(j);    
        }
        System.out.println(ans);
        scanner.close();
    }
}