import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ena000078
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        ArrayList<BoatRoute> brList1 = new ArrayList<>();
        ArrayList<BoatRoute> brList2 = new ArrayList<>();
        
        for(int i=0;i<M;i++){
            int f = sc.nextInt();
            int t = sc.nextInt();
            BoatRoute br = new BoatRoute(f, t);
            if(f == 1){
                brList1.add(br);
            }else if(t == N){
                brList2.add(br);
            }
        }
        
        String pos = "IMPOSSIBLE";
        for(BoatRoute tBr1 : brList1){
            int tTo1 = tBr1.getTo();
            for(BoatRoute tBr2 : brList2){
                int tFrom = tBr2.getFrom();
                if (tTo1 == tFrom){
                    int tTo2 = tBr2.getTo();
                    if (tTo2 == N){
                        pos = "POSSIBLE";
                        break;
                    }
                }
            }
            if(pos.equals("POSSIBLE")){
                break;
            }
        }
        System.out.println(pos);
    }
    
}

class BoatRoute {
    int from;
    int to;
    BoatRoute(){
    }
    BoatRoute(int f, int t){
        setFrom(f);
        setTo(t);
        //this.from = f;
        //this.to   = t;
    }
    
    public int getFrom(){
        return this.from;
    }
    public int getTo(){
        return this.to;
    }
    public void setFrom(int f){
        this.from = f;
    }
    public void setTo(int t){
        this.to = t;
    }

}