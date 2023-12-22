import java.util.*;
class Main {
    public static void main(String[]  args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();
        int suger = 0;
        int water = 0;
        double node = 0;
        double maxNode = 0;
        int maxWeight = a*100;
        int maxSuger = 0;
        double melt = 100*e/(100+e);
        for(int i = 0; i<=30; i++) {
            for(int j = 0; j<=30; j++) {
                for(int k = 0; k<=100; k++) {
                    for(int l = 0; l<=100; l++) {
                        water = (a*i+b*j)*100;
                        suger = c*k+d*l;
                        if(water+suger > f || water+suger==0) break;
                        node = 100*suger /(water+suger);
                        if(node>melt) break;
                        if(node>maxNode) {
                            maxNode = node;
                            maxWeight = water+suger;
                            maxSuger = suger;
                        }
                    }
                }
            }
        }
        System.out.println(maxWeight + " " + maxSuger);

    }
}