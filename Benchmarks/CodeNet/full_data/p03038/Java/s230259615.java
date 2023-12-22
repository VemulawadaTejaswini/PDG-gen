import java.util.Scanner;
import java.util.ArrayList;

class Change{
    int count; Integer number;
    public Change(int b, Integer c){
        this.count = b;
        this.number = c;
    }
}

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        ArrayList<Integer> bal = new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            Integer a = Integer.parseInt(sc.next());
            bal.add(a);
        }
        bal.sort(null);
        ArrayList<Change> cal = new ArrayList<Change>();
        for(int i=0;i<m;i++){
            int b = Integer.parseInt(sc.next());
            Integer c = Integer.parseInt(sc.next());
            cal.add(new Change(b,c));
        }
        cal.sort((a,b) -> b.number.compareTo(a.number) );
        int j=0; boolean f=true; Change change;
        for(int i=0;i<m;i++){
            change = cal.get(i);
            while(change.count>0){
                if(change.number <= bal.get(j)){
                    f = false;
                    break;
                }
                bal.set(j, change.number);
                j++;
                change.count--;
            }
            if(!f || j==n-1){
                break;
            }
        }
        Integer sum = new Integer(0);
        for(int i=0;i<n;i++){
            sum += bal.get(i);
        }
        System.out.println(sum);
        sc.close();
    }
}