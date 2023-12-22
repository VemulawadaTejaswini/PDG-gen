import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        
        String strnum = String.valueOf(a);
        //System.out.println("strnum : " + strnum); 
            if (strnum.contains("7"))
            {
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }      
        //System.out.println(a);
        
        //int b = sc.nextInt();

        //System.out.println(String.format("%d",(int)temp));
        
        /*
        if ((a * b) % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
        */
    }
}