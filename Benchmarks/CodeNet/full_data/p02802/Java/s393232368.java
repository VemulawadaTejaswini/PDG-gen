import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main{
    Scanner scan = new Scanner(System.in);
    int N,M;
    int p[];
    String s[];
    List<Integer> acp = new ArrayList<>();
    List<Integer> wap = new ArrayList<>();
    int AC = 0;
    int WA = 0;

    Main(){
        N = scan.nextInt();
        M = scan.nextInt();
        p = new int[M];
        s = new String[M];
        for(int i=0; i<M; i++){
            p[i] = scan.nextInt();
            s[i] = scan.next();
            boolean a = false;
            for(int j=0; j<acp.size(); j++){
                if(acp.get(j) == p[i]) a = true;
            }

            if(s[i].equals("AC")){
                if(!a) acp.add(p[i]);
            }else{
                if(!a) wap.add(p[i]);
            }
        }
        System.out.print(acp.size()+" "+wap.size());



    }

    public static void main(String[] args){
        new Main();
    }
}