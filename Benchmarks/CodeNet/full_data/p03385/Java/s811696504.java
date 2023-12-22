import java.util.*;
public class Main{
        public static void main(String[] args){
                Scanner cin=new Scanner(System.in);
                String s=cin.next();
                if((s=="abc")||(s=="acb")||(s=="bac")||(s=="cab")||(s=="bca")||(s=="cba")){
                                System.out.println("Yes");
                }
                else{
                        System.out.println("No");
                }
        }
}
