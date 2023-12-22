import java.util.*;
public class Main{

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String s;
        char a=' ';
        s=input.next();
        char arr[]=new char[s.length()];
        for(int i=0;i<s.length();i++)
        {
            arr[i]=s.charAt(i);
        }
        for(int i=0;i<s.length();i++)
        {
            if(arr[i]==',')
                arr[i]=a;
        }
        for(int i=0;i<s.length();i++)
        {
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    
}
