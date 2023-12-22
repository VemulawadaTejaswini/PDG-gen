import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<String> intList = new ArrayList<String>();

        for(int i=0;i<n;i++){
            intList.add(scn.next());
        }

        Set<String> intSet = new HashSet<String>(intList);

        if(n==intSet.size()){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

        scn.close();

    }


}
