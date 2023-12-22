import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for (int i=0;i<n;i++){
            a.add(scanner.nextInt());
        }
        int indexMin = a.indexOf(Collections.min(a));
        boolean b = true;
        int instance = indexMin-1;
        int count = 0;
        while (b){
            if(instance>0){
                instance -= k-1;
                count++;
            }else {
                b = false;
            }
        }
        b = true;
        instance = a.size()-1-indexMin;
        while (b){
            if(instance>0){
                instance -= k-1;
                count++;
            }else {
                b = false;
            }
        }
        System.out.println(count);
    }

}