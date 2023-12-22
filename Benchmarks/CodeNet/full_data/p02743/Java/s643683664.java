import java.util.*; 
public class Main{
    static public void main(String[] args){
        Scanner sc=new Scanner(System.in);
       long num1=sc.nextLong();
       long num2=sc.nextLong();
       long num3=sc.nextLong();
       double ab=(double)Math.sqrt(num1);
       ab+=(double)Math.sqrt(num2);
       double c=(double)Math.sqrt(num3);
        if(ab<c)System.out.print("Yes");
        else System.out.print("No");
        sc.close();
    }
}