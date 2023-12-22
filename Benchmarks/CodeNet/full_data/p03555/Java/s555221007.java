import java.util.*;
public class Main{

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String z,x,v;
        z=input.next();
        x=input.next();
        boolean m=false;
        for(int i=0,o=z.length()-1;i<z.length();i++,o--)
        {
            if(z.charAt(o)==x.charAt(i))
                m=false;
            else 
            {
                m=true;
                break;
            }
        }
        if(!m)
            System.out.println("YES");
        else System.out.println("NO");
    }
    
}
