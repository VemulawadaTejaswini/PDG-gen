import java.util.*;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String s = sc.next();
        if(n%2==0){
            //System.out.println(s.substring(0,n/2)+" "+s.substring(n/2,n));
            if(s.substring(0,n/2).equals(s.substring(n/2,n))){

                System.out.println("Yes");
                return;
            }
            System.out.println("No");
        }else{
            System.out.println("No");
        }



    }

}
