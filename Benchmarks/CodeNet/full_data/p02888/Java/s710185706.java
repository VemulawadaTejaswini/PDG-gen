import java.util.*;
public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> List = new ArrayList<>();
        int N = sc.nextInt();
        int num = 0;
        for(int i=0;i<N;i++) List.add(sc.nextInt());
        for(int i=0;i<List.size()-2;i++){
            for(int j=i+1;j<List.size()-1;j++){
                for(int k=j+1;k<List.size();k++){
                    int a = List.get(i);
                    int b = List.get(j);
                    int c = List.get(k);
                    if(a<b+c&&b<a+c&&c<a+b) num++;
                }
            }
        }
        System.out.println(num);
    }
}
