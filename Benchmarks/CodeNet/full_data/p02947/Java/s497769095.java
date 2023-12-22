import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner scan = new Scanner(System.in);
        Integer N = scan.nextInt();
        ArrayList<String> strings = new ArrayList<String>();
        for(int i = 0; i < N; i++) {
            String s = scan.next();
            String[] sArray = s.split("");
        	List<String> al = new ArrayList<String>();
        	al = Arrays.asList(sArray);
            Collections.sort(al);
            strings.add(Arrays.toString(al.toArray()));
        }
        Collections.sort(strings);
        long count = 0;
        for(int i = 0; i < N ; i++) {
            for(int j = i + 1; j < N; j++) {
                if(strings.get(i).equals(strings.get(j)))
                    count++;
            }
        }
        System.out.println(count);
    }
}
