import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        
        ArrayList<PVector> student = new ArrayList<PVector>();
        
        for(int i=0; i<n; i++){
            student.add(new PVector(Integer.parseInt(sc.next()), Integer.parseInt(sc.next())));
        }
        
        ArrayList<PVector> point = new ArrayList<PVector>();
        for(int i=0; i<m; i++){
            point.add(new PVector(Integer.parseInt(sc.next()), Integer.parseInt(sc.next())));
        }
        
        for(int i=0; i<n; i++){
            int ans_num = 0;
            int ans_dis = Integer.MAX_VALUE;
            for(int j=0; j<m; j++){
                int dis = (int)Math.abs((student.get(i).x - point.get(j).x)) + (int)Math.abs((student.get(i).y - point.get(j).y));
                
                if(ans_dis > dis){
                    ans_dis = dis;
                    ans_num = j+1;
                }
            }
            System.out.println(ans_num);
        }
        
    }
    
    static class PVector{
        int x;
        int y;
        
        PVector(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
}