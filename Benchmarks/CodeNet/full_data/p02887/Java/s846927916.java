import java.util.Scanner;
import java.util.ArrayList;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    sc.nextLine();
    String allSlime = sc.nextLine();
    String tmpSlime[] = allSlime.split("");
    ArrayList<String> slimes = new ArrayList<>();

    for(int i=0; i<N; i++){
        slimes.add(tmpSlime[i]);
    }

    if(slimes.size() == 1){
        System.out.println(1);
        return;
    }

    int i=0;
    while(slimes.size() > i+1){
        String target = slimes.get(i);
        String target_next = slimes.get(i+1);
        if (target.equals(target_next))
            slimes.remove(i+1);
        else
            i++;
    }

    System.out.println(slimes.size());
  }
}