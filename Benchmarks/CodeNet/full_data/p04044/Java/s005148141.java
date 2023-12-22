import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String line = br.readLine();
            String[] items = line.split("\\s+");
            int N = Integer.parseInt(items[0]);
            int L = Integer.parseInt(items[1]);

            line = br.readLine();
            List<String> list = new ArrayList<>();
            while(line != null){
                list.add(line);
                line = br.readLine();
            }
            Collections.sort(list);
            for(String s : list){
                System.out.print(s);
            }
            System.out.println();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}