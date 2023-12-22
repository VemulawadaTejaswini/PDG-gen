import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> x = new ArrayList<>();
        ArrayList<Integer> y = new ArrayList<>();
        for (int i=0;i<n;i++){
            x.add(scanner.nextInt());
            y.add(scanner.nextInt());
        }
        double instance = 0;
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                instance += Math.sqrt((x.get(i)-x.get(j))*(x.get(i)-x.get(j))+(y.get(i)-y.get(j))*(y.get(i)-y.get(j)));
            }
        }
        System.out.println(instance/n);

    }

}