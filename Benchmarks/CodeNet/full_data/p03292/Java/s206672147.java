import java.util.*;
public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> List = new ArrayList<>();
        ArrayList<Integer> OPT = new ArrayList<>();
        for(int i=0;i<3;i++)List.add(sc.nextInt());
        for(int i=0;i<2;i++){
            for(int j=i+1;j<3;j++){
                int opt=Math.abs(List.get(i)-List.get(j));
                OPT.add(opt);
            }
        }
        Collections.sort(OPT);
        System.out.println(OPT.get(0)+OPT.get(1));
    }
}
