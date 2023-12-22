import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(input.readLine());
        String[] as = input.readLine().split(" ");
        int a = as.length;
        List<String> list = new ArrayList<String>(Arrays.asList(as));
        List<String> listdel = new ArrayList<String>(new HashSet<>(list));
        int b = listdel.size();
        if(a == b ){
            System.out.println("YES");
        }else{
            System.out.println("NO");

        }
    }
}