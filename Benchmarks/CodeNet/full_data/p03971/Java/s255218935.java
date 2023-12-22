import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
            int N=sc.nextInt();
            int A=sc.nextInt();
            int B=sc.nextInt();
            String str = sc.next();
            String[] spt = str.split("");
            int win=0;
            int b=0;
            
            for(int i=0;i<N;i++){
                
                if(spt[i].equals("a")){
                    if(win<A+B){
                        win++;
                        System.out.println("Yes");
                    }else{
                        System.out.println("No");
                    }
                }
                if(spt[i].equals("b")){
                    b++;
                    if(win<A+B && b<=B){
                        win++;
                        System.out.println("Yes");
                    }else{
                        System.out.println("No");
                    }
                }
                if(spt[i].equals("c")){
                    System.out.println("No");
                }
            }
            
            
    }
}
