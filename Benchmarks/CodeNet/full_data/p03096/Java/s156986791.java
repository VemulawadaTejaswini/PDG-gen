import java.util.*;  //B問題

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        int N = Integer.parseInt(line);
        //int[] C = new int[N];
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < N; i++) {
            line = scan.nextLine();
            //C[i] = Integer.parseInt(line);
            list.add(Integer.parseInt(line));
        }
        //ArrayList<Integer> list_kind = new ArrayList<>(new HashSet<>(list));
        //int[] count = new int[list_kind.size()];
        int[] count = new int[list.size()];
        //System.out.println("list = " + list);   //////////////
        //System.out.println("list_kind = " + list_kind);  /////////////
        
        long num = 1;  //何も入れ替えない1通り
        
        int[] i_left = new int[list.size()];
        int[] i_right = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            i_left[i] = N;
        }
        
        for (int i = 0; i < N-2; i++) {
            for (int j = 2; j < N-i; j++) {
                // for (int k = 0; k < list_kind.size(); k++) {
                //     if (list.get(i) == list_kind.get(k) && list.get(i) == list.get(i+j)) {
                //         count[k]++;
                //         j++;
                //     }
                // }
                if (list.get(i) == list.get(i+j)) {
                    count[list.get(i)]++;
                    if (i < i_left[list.get(i)]) {
                        i_left[list.get(i)] = i;
                    }
                    if (i+j > i_right[list.get(i)]) {
                        i_right[list.get(i)] = i+j;
                    }
                    j++;
                }
                
            }
        }
        //System.out.println("i_left[2]=" + i_left[2]);  /////////////
        //System.out.println("i_right[1]=" + i_right[1]);  /////////////
        
        for (int i = 1; i < list.size(); i++) {
            for (int j = 1; j < list.size(); j++) {
                if (i_right[list.get(i)] < i_left[list.get(j)]) {
                    num++;
                    //System.out.println("i_right[list.get("+i+")]="+i_right[list.get(i)] + " i_left[list.get("+j+")]="+i_left[list.get(j)]);
                    break;
                }
            }
        }
        
        //for (int k = 0; k < list_kind.size(); k++) {
        for (int k = 0; k < list.size(); k++) {
            num += count[k];
            //System.out.print(count[k] + " ");  ////////////
        }
        //System.out.println();   /////////////
        num %= 1000000007;
        System.out.println(num);
    }
}
