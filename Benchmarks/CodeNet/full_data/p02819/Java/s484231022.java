import java.util.*;

class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x==2){
            System.out.println(x);
            return;
        }
        while(true){
            boolean isMod = true;
            for(int i=2;i<Math.sqrt(x);i++){
                if(x%i==0){
                    isMod = false;
                    break;
                }
                else{
                    isMod = true;
                }
            }
            if(isMod){
                System.out.println(x);
                return;
            }
            x++;
        }
        
    }
}
