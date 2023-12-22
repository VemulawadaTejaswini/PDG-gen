import java.util.Scanner; 
class Main 
{ 
    public static void main(String[] args) 
    { 
        Scanner s = new Scanner(System.in); 
        int a,b,c;
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();
        if (a+b+c>=22) System.out.println("bust");
        else System.out.println("win");
    } 
} 