import java.util.*;

public class A {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] s = new int[m];
        int[] c = new int[m];

        for (int i=0; i<m; i++){
            s[i] = sc.nextInt();
            c[i] = sc.nextInt();
        }

//        Map<Integer, Integer> map = new HashMap();

        for (int i=0; i<m; i++){
            if (n<s[i]){
                System.out.println("-1");
                return;
            }
            if (s[i]==1 && c[i]==0){
                System.out.println("-1");
                return;
            }
        }

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        Set<Integer> set3 = new HashSet<>();

        for (int i=0; i<m; i++){
            int tmpS = s[i];
            int tmpC = c[i];
            if (tmpS==1){
                set1.add(tmpC);
            }else if (tmpS==2){
                set2.add(tmpC);
            }else if (tmpS==3){
                set3.add(tmpC);
            }
        }

        if (2<=set1.size() || 2<=set2.size() || 2<=set3.size()){
            System.out.println("-1");
            return;
        }


        if (n==1){
            Iterator it = set1.iterator();
            System.out.println(it.next());
        }else if (n==2){
//            StringBuilder sb = new StringBuilder();
            if (set1.size()==0){
                System.out.print(1);
            }else {
                Iterator it = set1.iterator();
                System.out.print(it.next());
            }
//            String tmpIt = (String)it.next();
//            sb.append(tmpIt);
            Iterator its = set2.iterator();
//            String tmpIts = (String) its.next();
//            sb.append(tmpIts);
            System.out.print(its.next());
        }else if (n==3){
            if (set1.size()==0){
                System.out.print(1);
                if (set2.size()==0){
                    System.out.print(0);
                    if (set3.size()==0){
                        System.out.print(0);
                    }else {
                        Iterator it = set3.iterator();
                        System.out.print(it.next());
                    }
                }else {
                    Iterator it = set2.iterator();
                    System.out.print(it.next());
                    if (set3.size()==0){
                        System.out.print(0);
                    }else {
                        Iterator its = set3.iterator();
                        System.out.print(its.next());
                    }
                }
            }else {
                Iterator it = set1.iterator();
                System.out.print(it.next());
                if (set2.size()==0){
                    System.out.print(0);
                    if (set3.size()==0){
                        System.out.print(0);
                    }else {
                        Iterator its = set3.iterator();
                        System.out.print(its.next());
                    }
                }else {
                    Iterator its = set2.iterator();
                    System.out.print(its.next());
                    if (set3.size()==0){
                        System.out.print(0);
                    }else {
                        Iterator itss = set3.iterator();
                        System.out.print(itss.next());
                    }
                }

            }

        }
//        for (int i=0; i<m; i++){
//            int key = s[i];
//            int value = c[i];
//            map.put(key,value);
//        }

//        for (int i=0; i<map.size(); i++){
//
//        }




    }
}
