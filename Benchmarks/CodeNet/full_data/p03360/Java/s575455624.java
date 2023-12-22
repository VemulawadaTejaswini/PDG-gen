import java.util.*;
class Main{

     public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<>();
        a.add(scan.nextInt());
        a.add(scan.nextInt());
        a.add(scan.nextInt());
        int n =scan.nextInt();
        
        
        int x = (int)Math.pow(Collections.max(a),n) ;
        a.remove(Collections.max(a));
        a.add(x);
        int sum = 0;
        for(Integer u : a){
            sum+=u;
        }
        System.out.println(sum);
        
        
        
      
     }
}