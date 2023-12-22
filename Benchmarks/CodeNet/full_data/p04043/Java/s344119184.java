import java.util.Scanner;
 class Main {

    public static void main(String[] args) {
   
        Scanner in=new Scanner(System.in);
        int a,b,c;
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();  
       if(a==5)
       {
           if(b==7)
           {
               if(c==5)
               {
                   System.out.println("Yes");     
               }else{System.out.println("NO");}
               
           }else{System.out.println("NO");}
           
       }else{System.out.println("NO");}
           
    }
    
}