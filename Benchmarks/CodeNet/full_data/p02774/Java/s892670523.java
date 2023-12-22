import java.util.*;

class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int K = sc.nextInt();

        ArrayList<Integer> A = new ArrayList<Integer>();
        for(int i=0; i<N; i++){
            int n = sc.nextInt();
                A.add(n);
        }

        ArrayList<Long> product = new ArrayList<Long>();

        for(int i=0; i<A.size(); i++){
            for(int j=i+1; j<A.size(); j++){
                product.add((long)A.get(i)*(long)A.get(j));
            }
        }

        Collections.sort(product);

        System.out.println(product.get(K-1));
        
    }
}