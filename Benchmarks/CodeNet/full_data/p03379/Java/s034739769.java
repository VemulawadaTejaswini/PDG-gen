import java.util.*;

public class Main {

    public static  void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> array = new ArrayList<>();
        for(int i = 0; i < n; i++){
            array.add(scanner.nextInt());
        }

        ArrayList<Integer> temp = (ArrayList<Integer>) array.clone();
        Collections.sort(temp);
        System.out.println(array);
        System.out.println(temp);
        for(int i = 0; i < n; i++){
            if(array.get(i) <= temp.get(n/2-1)){
                System.out.println(temp.get(n/2));
            }else {
                System.out.println(temp.get(n/2-1));
            }
        }
    }
}