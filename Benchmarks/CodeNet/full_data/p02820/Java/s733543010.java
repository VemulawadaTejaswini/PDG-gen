import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        //まずは入力
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int r = sc.nextInt();
        int s = sc.nextInt();
        int p = sc.nextInt();
        sc.useDelimiter("");
        sc.next();
        String[] cpu = new String[n];
        String[] player = new String[n];
        for(int i=0;i<n;i++){
            cpu[i]=sc.next();
        }

        //cpuに勝つ手を入れていく
        for(int i=0;i<n;i++){
            if(i-k>=0){
              if(player[i-k].equals(victry(cpu[i]))){
              player[i]="";
              continue;
              }
            }
            player[i]=victry(cpu[i]);
        }
        
        //合計点の計算
        int total = 0;
        for(int i=0;i<n;i++){
            if(player[i].equals("r"))total+=r;
            if(player[i].equals("s"))total+=s;
            if(player[i].equals("p"))total+=p;
        }
        System.out.println(total);
    }
    
    public static String victry(String s){
        if(s.equals("r")){ return "p";}
        else if(s.equals("s")){return "r";}
        else if(s.equals("p")){return "s";}
        return "";
    }
}
