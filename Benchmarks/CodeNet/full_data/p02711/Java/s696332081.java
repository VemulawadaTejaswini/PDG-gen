import java.util.*;
class Main{
public static void main(String args[]){

        Scanner sc= new Scanner(System.in);
        char[] n = sc.nextLine().toCharArray();
        for(int i=0;i<3;i++){
            if(n[i]=='7'){
                System.out.println("Yes");
                return;
            }
            
        }
        System.out.println("No");
    


}
}