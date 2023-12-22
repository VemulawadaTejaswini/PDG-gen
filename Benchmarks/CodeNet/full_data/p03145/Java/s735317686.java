import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        List<Integer> sides = new ArrayList<>();
        int sides[] = new int[3];
        for(int i=0 ; i<3 ; i++) {
//            sides.add(sc.nextInt());
            sides[i] = sc.nextInt();
        }
        Arrays.sort(sides);
//        for(int i=0 ; i<3 ; i++){
//            System.out.println(sides[i]);
//        }
//        System.out.println(sides);
        double Scale = (sides[0] + sides[1] + sides[2])*0.5;
        Scale = Scale*(Scale-sides[0])*(Scale-sides[1])*(Scale-sides[2]);
        Scale = Math.sqrt(Scale);
        System.out.println((int)Scale);

    }
}
