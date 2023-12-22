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
        int numA = (indexMin-1-(indexMin-1)%(k-1))/(k-1)+1;
        if ((indexMin-1)%(k-1)==0){
            numA--;
        }
        int numB = (a.size()-indexMin-1-(a.size()-indexMin-1)%(k-1))/(k-1)+1;
        if ((a.size()-indexMin-1)%(k-1)==0){
            numB--;
        }
        if (k>=a.size()){
            System.out.println(1);
        }else {
            System.out.println(numA+numB);
        }

    }

}