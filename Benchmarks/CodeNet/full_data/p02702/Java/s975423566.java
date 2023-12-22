
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        String str=input.next();
//        str.split("[\\s,]+");
        
        String arr[]=new String[100];
        
        for(int i=1;i<100;i++)
        {
            arr[i]=String.valueOf(2019*i);
//            System.out.println(2019*i);
        }
        
        
        
        int count=0;
        for(int i=1;i<100;i++)
        {
            long a=Long.parseLong(arr[i]);
            long s=Long.parseLong(str);
//            System.out.println("sdfsadgasg");
           
            if(a<s)
            {
                
                int p=str.indexOf(arr[i]);
                if(p!=-1)
                {
//                    System.out.println(arr[i]);
                   
//                    System.out.println(i);
                    count++;
                    
//                        int p= str.indexOf(arr[i],str.lastIndexOf(str)+arr[i].length()-1);
                        int z=p+arr[i].length()-1;
//                        System.out.println(str.lastIndexOf(arr[i]));
                    while(p!=str.lastIndexOf(arr[i]))
                    {
//                        System.out.println(i+" "+p);
                        if(p==-1)
                            break;
//                        System.out.println("aweaer");
//                        str.indexOf(arr[i], z);
                        z=p+arr[i].length()-1;
                        p=str.indexOf(arr[i], z);
                        count++;
                    }
                    
                    
                }
            }
            else
                break;
        
        }
        System.out.println(count);
        
        
    }
}
