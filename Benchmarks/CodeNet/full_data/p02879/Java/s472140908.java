import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
    
        int input=reader.nextInt();
         int input2=reader.nextInt();
        if((input >=10) || (input2 >=10))
        {
        System.out.println("-1");
        }
        else
        {
             System.out.println(input*input2);
        }
            
      
    }}