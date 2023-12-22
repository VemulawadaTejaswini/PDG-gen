import java.util.*; 
public class Main{
    static public void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double num1=Math.sqrt(sc.nextDouble()),
               num2=Math.sqrt(sc.nextDouble()),
               num3=Math.sqrt(sc.nextDouble());
        if(num1+num2<num3)System.out.print("Yes");
        else System.out.print("No");
    }
}