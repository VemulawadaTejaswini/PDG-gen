import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n / 2];
        int b[] = new int[n / 2];
        for (int i = 0; i < n / 2; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);
        int counta = 1;
        int countb = 1;
        ArrayList<Integer> lista = new ArrayList<Integer>();
        ArrayList<Integer> listacount = new ArrayList<Integer>();
        ArrayList<Integer> listb = new ArrayList<Integer>();
        ArrayList<Integer> listbcount = new ArrayList<Integer>();

        for(int i = 0; i < n / 2 - 1; i++){
            if (a[i] != a[i + 1]) {
                lista.add(a[i]);
                listacount.add(counta);
                counta = 1;
            }else{
                counta++;
            }
            if (b[i] != b[i + 1]) {
                listb.add(b[i]);
                listbcount.add(countb);
                countb = 1;
            } else {
                countb++;
            }
        }
        
        lista.add(a[n / 2 - 1]);
        listacount.add(counta);
        
        listb.add(b[n / 2 - 1]);
        listbcount.add(countb);
        
        int maxa = 0;
        for(int i = 0; i < listacount.size(); i++){
            maxa = Math.max(listacount.get(i), maxa);
        }
        int maxb = 0;
        for(int i = 0; i < listbcount.size(); i++){
            maxb = Math.max(listbcount.get(i), maxb);
        }
        if (lista.get(listacount.indexOf(maxa)) != listb.get(listbcount.indexOf(maxb)) || lista.get(listacount.lastIndexOf(maxa)) != listb.get(listbcount.indexOf(maxb)) || lista.get(listacount.indexOf(maxa)) != listb.get(listbcount.indexOf(maxb))) {
            System.out.println(n - maxa - maxb);
        }else{
            List<Integer> seta = new ArrayList<>();
            Collections.addAll(seta, maxa);
            listacount.removeAll(seta);
            List<Integer> setb = new ArrayList<>();
            Collections.addAll(setb, maxa);
            listbcount.removeAll(setb);
            int maxas = 0;
            for (int i = 0; i < listacount.size(); i++) {
                maxas = Math.max(listacount.get(i), maxas);
            }
            int maxbs = 0;
            for (int i = 0; i < listbcount.size(); i++) {
                maxbs = Math.max(listbcount.get(i), maxbs);
            }
            if (maxas >= maxbs) {
                System.out.println(n - maxas - maxb);
            }else{
                System.out.println(n - maxa - maxbs);
            }
        }
    }
}