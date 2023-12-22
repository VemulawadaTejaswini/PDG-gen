import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer>a=new ArrayList<>();
        a.add(-1);
        for(int i=0;i<n;i++){
            int po=sc.nextInt();
            boolean c=false;
            for(int j=0;j<a.size();j++){
                if(a.get(j)<po){
                    c=true;
                    a.set(j,po);
                    break;
                }
            }
            if(!c)a.add(po);
        }
        System.out.println(a.size());
        
    }
}
