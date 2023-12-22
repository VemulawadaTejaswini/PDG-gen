import java.util.*;

class Main{
    
    public static int[][] colors = {
        {1, 399, 0}, //gray
        {400, 799, 0}, //brown
        {800, 1199, 0}, //green
        {1200, 1599, 0}, //light_blue
        {1600, 1999, 0}, //blue
        {2000, 2399, 0}, //yellow
        {2400, 2799, 0}, //orange
        {2800, 3199, 0} //red
    };
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = Integer.parseInt(sc.next());
        
        int top_counter = 0;
        int normal_counter = 0;
        for(int n=0; n<N; n++){
            int value = Integer.parseInt(sc.next());
            if(value >= 3200){
                top_counter++;
            }else{
                normal_counter += countColors(value); 
            }
        }
        
        int max = top_counter + normal_counter;
        System.out.println(normal_counter + " " + max);
    }
    
    public static int countColors(int num){
        for(int i=0; i<colors.length; i++){
            if(colors[i][0] <= num && num <= colors[i][1] && colors[i][2] == 0){
                colors[i][2] = 1;
                return 1;
            }
            if(colors[i][0] <= num && num <= colors[i][1] && colors[i][2] == 1){
                return 0;
            }
        }
        return 0;
    }
}