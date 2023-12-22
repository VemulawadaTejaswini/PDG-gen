import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int switch_n = Integer.parseInt(sc.next());
        int light_n = Integer.parseInt(sc.next());
        
        boolean[][] sw_to_light = new boolean[switch_n][light_n];
        
        for(int i=0;i<switch_n;i++){
            for(int j=0;j<light_n;j++){
                sw_to_light[i][j]=false;
            }
        }
        
        int connected_switch=0;
        int to_switch=0;
        for(int i=0;i<light_n;i++){
            connected_switch = Integer.parseInt(sc.next());
            for(int j=0;j<connected_switch;j++){
                to_switch = Integer.parseInt(sc.next());
                sw_to_light[to_switch-1][i] = true;
            }
        }
        
        boolean[] light_state=new boolean[light_n];
        
        boolean all_lit=true;
        int count=0;
        
        for(int i=0;i <(1<<switch_n);i++){
            for(int j=0;j<light_n;j++){
                light_state[j]=false;
            }   //Initialization
            
            for(int j=0;j<switch_n;j++){
                if((i&(1<<j))>0){
                    for(int k=0;k<light_n;k++){
                        if(sw_to_light[j][k]) light_state[k]=!light_state[k];
                    }
                }
            }
            
            all_lit=true;
            for(int j=0;j <light_n;j++){
                if(!light_state[j]) all_lit=false;
            }
            if(all_lit) count++;
        }
        
        //String s = sc.next();
        
        System.out.println(count);
    }
}