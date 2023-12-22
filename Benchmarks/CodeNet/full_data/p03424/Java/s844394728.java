import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String line = sc.nextLine();
        Set<String> sList = new HashSet<>(Arrays.asList(line.split(" ")));
        if(sList.size() == 4) {
            System.out.println("Four");
        } else {
            System.out.println("Three");
        }
    }
}