import java.util.*;
public class Main {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
       
        String w = input.next();
        int count = 0;
        for(int i = 0; i < w.length()/2; i++){
            //System.out.println(w.length()-(i+1));
            if(w.indexOf(i)== w.indexOf(w.length()-(i+1)))
                count+=1;
        }
        System.out.println(count);
        System.out.println(w.length()/2.0);
        if(count == w.length()/2.0)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
