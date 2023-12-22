
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        final String s=scanner.next();
        final int K=scanner.nextInt();
        final String alphabet="abcdefghijklmnopqrstuvwxyz";
        Set<String> sets=new HashSet<>();
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                sets.add(s.substring(i,j));
            }
        }
        System.out.println(sets.stream().sorted().collect(Collectors.toList()).get(K-1));


    }

}