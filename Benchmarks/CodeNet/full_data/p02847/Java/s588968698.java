
import java.util.Scanner;

/**
 *
 * @author Nour
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 //S is SUN, MON, TUE, WED, THU, FRI, or SAT.
 Scanner input=new Scanner(System.in);
 String S =input.next();
 if (S.equals("SUN")){
     System.out.println(7+"\n"+"It is Sunday today, and seven days later, it will be Sunday again.");}
 else if(S.equals("MON")){
     System.out.println(6+"\n"+"It is Monday today, and six days later, it will be Sunday again.");}
 else if(S.equals("TUE")){
     System.out.println(5+"\n"+"It is  Tuesday today, and five days later, it will be Sunday again.");}
else if(S.equals("WED")){
     System.out.println(4+"\n"+"It is  Wensday today, and four days later, it will be Sunday again.");}
 else if(S.equals("THU")){
     System.out.println(3+"\n"+"It is  Thursday today, and three days later, it will be Sunday again.");}
 else if(S.equals("FRI")){
     System.out.println(2+"\n"+"It is  fraiday today, and two days later, it will be Sunday again.");}
 else if(S.equals("SAT")){
     System.out.println(1+"\n"+"It is  Saturday today, and three days later, it will be Sunday again.");
    }}
    
}