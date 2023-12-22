import java.util.*;
public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> List = new ArrayList<>();
        for(int i=0;i<3;i++) List.add(sc.nextInt());
        Collections.sort(List);
        int opt = List.get(0)+List.get(1);
        System.out.println(opt);
    }
}