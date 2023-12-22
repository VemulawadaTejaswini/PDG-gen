import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String Sentence = input.nextLine();
        String splitSen[] = Sentence.split(" ");    
        for(String word : splitSen){
        System.out.print(word.charAt(0));
        	      
         }     
    }
}