import java.util.*;

public class Main {
    public static void main(String[] アーグス) {
        Scanner スキャナー=new Scanner(System.in);
        int えー=スキャナー.nextInt();
        int びー=スキャナー.nextInt();
        System.out.println(まっくす(まっくす(えー+びー,えー-びー),えー*びー));
    }
    public static int まっくす(int えー, int びー){
        return Math.max(えー,びー);
    }
}
