import java.util.*;
import java.lang.*;
public class Main{
    public static void main(String args[]){
        str ans=new str();
        ans.sp();
    }
}
class str{
    String s;
    void sp(){
        Scanner sc=new Scanner(System.in);
        s=sc.nextLine();
        if(s.contains("A")&&s.contains("B")){
            System.out.println("Yes");
        }
        else System.out.println("No");
    }
}
