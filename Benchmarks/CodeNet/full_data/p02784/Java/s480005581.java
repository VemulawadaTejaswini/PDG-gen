import java.util.*;
class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int n = sc.nextInt();
        int a,y = 0;
        for(int i=0;i<n;i++){
            a = sc.nextInt();            
            y = a + y;
        }
            if(0<y){
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
    }
}