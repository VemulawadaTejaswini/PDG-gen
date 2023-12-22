import java.util.*;


public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        
   Double W = sc.nextDouble();
   Double H = sc.nextDouble();
   
   Double x = sc.nextDouble();
   Double y = sc.nextDouble();
   
   Double A = x * H;
   Double B = (W - x) * H;
   Double repA = new Double(0);
   ArrayList<Double> max = new ArrayList<>();
   
   Double C = W * y;
   Double D = W * (H - y);
   Double repB = new Double(0);
   
   if(A < B){
       repA = A;
       max.add(B);
   }else if(A > B){
       repA = B;
       max.add(A);
   }else{
       repA = A;
       max.add(A);
       max.add(B);
   }
   
   if(C < D){
       repB= C;
       if(max.get(0) < D){
        max.clear();
        max.add(D);
       }else if(max.get(0) == D){
           max.add(D);
       }
   }else if(C > D){
       repB= D;
       if(max.get(0) < C){
        max.clear();
        max.add(C);
       }else if(max.get(0) == C){
           max.add(C);
       }
   }else{
       repB = C;
    if(max.get(0) < C){
        max.clear();
        max.add(C);
        max.add(D);
     }else if(max.get(0) == C){
           max.add(C);
           max.add(D);
     }
   }
   
   
   if(repA < repB){
        System.out.print(repA);
   }else{
       System.out.print(repA);
   }
   
   System.out.print(" ");
   
   if(max.size() > 1){
       System.out.print(1);
   }else{
       System.out.print(0);
   }
   
 }  
}