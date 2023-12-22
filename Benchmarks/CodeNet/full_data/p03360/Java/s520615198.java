import java.util.*;
 class Main{

     public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<>();
        a.add(scan.nextInt());
        a.add(scan.nextInt());
        a.add(scan.nextInt());
        int n =scan.nextInt();
        int x = Collections.max(a) ;
        for(int i = 0 ; i<n ;i++){
        	x = x*2 ;
        }
       
        
        a.remove(Collections.max(a));
        a.add(x);
        int sum = 0;
        for(Integer u : a){
            sum+=u;
        }
        System.out.println(sum);
        
        
        
      
     }
}