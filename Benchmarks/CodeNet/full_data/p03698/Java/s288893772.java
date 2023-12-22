import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        ArrayList<Character> w = new ArrayList<Character>();
        for(int i = 0; i < line.length(); i++) {
            w.add(line.charAt(i));
        }
        char c = '0';
        boolean b = true;
        for(int i = 0; i < w.size(); i++) {
            c = w.get(0);
            w.remove(0);
            if(w.indexOf(c) != -1){
                b = false;
            }
        }
        if(b) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}