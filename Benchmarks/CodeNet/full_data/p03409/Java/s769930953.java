import java.util.*;
public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] list_ab = new int[200];
        int [] list_cd = new int[200];
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        for(int a=0;a<200;a++){
            list_ab[a]=-1;
            list_cd[a]=-1;
        }
        for(int a=0;a<n;a++){
            int num_a = sc.nextInt();
            int num_b = sc.nextInt();
            list_ab[num_a] = num_b;
            list.add(num_a);
        }
        int num=0;
        for(int a=0;a<n;a++) {
            int num_a = sc.nextInt();
            int num_b = sc.nextInt();
            list_cd[num_a] = num_b;
            list2.add(num_a);
        }
        Collections.sort(list);
        Collections.sort(list2);
        for(int a=0;a<n;a++){
            for(int b=list2.size();b>0;b--){
                if(list.get(a)<list2.get(b-1)) {
                    if (list_ab[list.get(a)] < list_cd[list2.get(b-1)]) {
                        num++;
                        list2.remove(b-1);
                        break;
                    }
                }
                else break;
            }
        }
        System.out.println(num);
         }
}
