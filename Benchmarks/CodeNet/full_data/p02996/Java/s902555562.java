import java.util.ArrayList;
import java.util.Scanner;
import java.util.Comparator;
import java.util.Collections;

public final class Main {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        int n = stdIn.nextInt();
        Set[] sets = new Set[n];
        for(int i=0; i<sets.length; i++){
            int a = stdIn.nextInt();
            int b = stdIn.nextInt();
            sets[i] = new Set(a, b);
        }
        ArrayList<Set> sets2 = new ArrayList<>();
        for(int i=0; i<sets.length; i++){
            sets2.add(sets[i]);
        }

        Collections.sort(sets2, new Comp());

        long kizaTime = 0;
        for(int i=0; i<sets2.size(); i++){
            kizaTime += sets2.get(i).a;
            if(kizaTime > sets2.get(i).b){
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
    }
}

class Set{
    public int a;
    public int b;
    Set(int a, int b){
        this.a = a;
        this.b = b;
    }
}

class Comp implements Comparator<Set> {
    public int compare(Set c1, Set c2) {
        if(c1.b < c2.b) {
            return -1;
        }else{
            return 1;
        }
    }
}
