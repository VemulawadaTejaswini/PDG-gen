import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] input = sc.next().toCharArray();
        boolean north = false;
        boolean south = false;
        boolean west = false;
        boolean east = false;
        for(char c: input){
            if(c == 'N')
                north = true;
            else if(c == 'S')
                south = true;
            else if(c == 'W')
                west = true;
            else
                east = true;
        }
        boolean cond1 = (north && south) || (!north && !south);
        boolean cond2 = (west && east) || (!west && !east);
        if(cond1 && cond2)
            System.out.println("Yes");
        else{
            System.out.println("No");
        }
    }
}
