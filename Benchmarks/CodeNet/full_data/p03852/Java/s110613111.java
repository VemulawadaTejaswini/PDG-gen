import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
    
       String input=reader.next().toLowerCase();
       
       if(input.equals("a")|| input.equals("e")|| input.equals("i")|| input.equals("o")|| input.equals("u") )
        {
        System.out.println("vowel");
       
       }
        else
        {
            System.out.println("consonant");
        }
    }}