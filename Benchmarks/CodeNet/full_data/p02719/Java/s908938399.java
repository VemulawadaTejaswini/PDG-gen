import java.util.*;
     
class Main{
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)){
 
            int n = Integer.parseInt(sc.next());
            int k = Integer.parseInt(sc.next());

            if(n >= k){
                if((n % k) == 0){
                    System.out.println(0);
                    System.exit(0);
                }else{
                    if((n % k) < abs((n % k) - k)){
                        System.out.println(n % k);
                        System.exit(0);
                    }else{
                        System.out.println(abs((n % k) - k));
                        System.exit(0);
                    }
                }
            }else{
                System.out.println(n);
                System.exit(0);
            }
 
        }catch(Exception e){
            e.printStackTrace();
        }        
    }
}