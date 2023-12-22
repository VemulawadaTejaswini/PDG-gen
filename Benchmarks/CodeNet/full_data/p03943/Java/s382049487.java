import java . util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int []x ={ input.nextInt(), input.nextInt(), input.nextInt()};
        for (int i = 0; i < x.length; i++) {
            Arrays.sort(x);           
        }
       if (x[2]==x[1]+x[0]){
           System.out.println("yes");
        System.out.println(" Give the pack with" +x[2] +"candies to one student, and give the two packs with"+  x[0]+" and "
                +x[1]+" candies to the other. Then, each gets " +x[2]+" candies");}
       
            System.out.println("no");
        System.out.println("In this case, the student who gets the pack with"  +x[2]+ 
"candies always has more candies than the other Note that every pack must be given to one of them.");
}}