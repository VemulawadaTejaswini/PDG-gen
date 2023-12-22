import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String tapDance = sc.next();
        boolean returnBoo = true;
        String[] tapDanceAr = tapDance.split("");
        for(int i = 0;i < tapDanceAr.length;i++){
            if(i % 2 == 1){
                if(tapDanceAr[i].equals("L") ){
                    returnBoo = false;
                }
            } else{
                if(tapDanceAr[i].equals("R") ){
                    returnBoo = false;
                }
            }          
        }
        if(returnBoo){
            System.out.println("Yes");
        } else{
            System.out.println("No");
        }
    }
}