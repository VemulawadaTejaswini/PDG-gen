import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n=Integer.parseInt(s.nextLine());
        List<Integer> is = new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            is.add(Integer.parseInt(s.nextLine()));
        }
        for(int i=0;i<is.size();i++){
            List<Integer> copy = new ArrayList<Integer>(is);
            copy.remove(i);
            int max = 0;
            for(int j=0;j<copy.size();j++) {
                if(max < copy.get(j)){
                    max = copy.get(j);
                }
            }
            System.out.println(max);
        }
    }
}