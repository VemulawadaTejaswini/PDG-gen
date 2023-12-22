import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args)
	{
		Scanner reader = new Scanner(System.in);
        int N = reader.nextInt();
        int A = reader.nextInt();
        int B = reader.nextInt();
        reader.nextLine();
        String input = reader.nextLine();

        int foreigners = 0;
		int disqualified = 0;

        int counter = 0;
        for(int i = 0; i < input.length(); i++){
          boolean printed = false;

          if(input.charAt(i) == 'b'){
            foreigners++;
          }

          if(input.charAt(i) == 'c'){
            disqualified++;
            System.out.println("No");
            printed = true;
          }
          else if(i <= (A+B+disqualified)){
            if(input.charAt(i) == 'a'){
              System.out.println("Yes");
              printed = true;
            }
            else if(input.charAt(i) == 'b'){
              if(foreigners <= B){
                System.out.println("Yes");
                printed = true;
              }
            }
          }
          
          if(printed == false){
            System.out.println("No");
          }
        }
	}
}