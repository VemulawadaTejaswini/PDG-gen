import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean chk = true;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0; i < n; i++){
            int a = sc.nextInt();
            if(map.containsKey(a)){
                chk = false;
                break;
            }else{
                map.put(a,1);
            }
        }
        if(chk){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}