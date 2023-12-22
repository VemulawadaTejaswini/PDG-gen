import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int Xsyuto = sc.nextInt();
        int Ysyuto = sc.nextInt();
        boolean t = true;
        boolean nowar = false;
        List<Integer> Xsenryou = new ArrayList<>();
        List<Integer> Ysenryou = new ArrayList<>();
        for(int i = 0; i < n; i++){
            Xsenryou.add(sc.nextInt());
        }
        for(int i = 0; i < m; i++){
            Ysenryou.add(sc.nextInt());
        }
        Collections.sort(Xsenryou, Collections.reverseOrder());
        Collections.sort(Ysenryou, Collections.reverseOrder());
        for(int i = Xsyuto + 1; i <= Ysyuto; i++){
            if(!(t)){
                nowar = true;
                break;
            }
            t = false;
            System.out.println(i);
            for(int z = 0; z < Xsenryou.size(); z++){
                System.out.println(i);
                if(t){
                    break;
                }
                if(!(Xsenryou.get(z) < i)){
                    for(int s = 0; s < Ysenryou.size(); s++){
                        System.out.println(i);
                        if(!(Ysenryou.get(s) <= i)){
                            t = true;
                        }
                    }

                }
            }

        }
        if(nowar){
            System.out.println("No War");
        }
        else{
            System.out.println("War");
        }
    }
}
