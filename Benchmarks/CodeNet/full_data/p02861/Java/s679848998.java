import java.util.*;
 
 
class Main {
    static int path[][];
    static int N;
    static ArrayList<Integer[]> permitations;
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        double x[] = new double[N];
        double y[] = new double[N];

        for(int i=0; i<N; i++){
            x[i] = sc.nextDouble();
            y[i] = sc.nextDouble();
        }
        
        permitations = new ArrayList<Integer[]>();
        ArrayList<Integer> candidate = new ArrayList<Integer>();
        for(int i=0;i<N;i++){
            candidate.add(new Integer(i));
        }
        pem(candidate);
        
        Integer arra[] = permitations.get(1);
        for(int i= 0;i<N;i++){
           System.out.println(arra[i]);
            
        }

        double sum = 0;
        int pc = 1;
        for(int i=1; i<=N; i++){
            pc *= i;
        }
        for(int i=0; i<pc; i++){
            double summ = 0;
            Integer array[] = permitations.get(i);
            for(int j=0; j<N-1; j++){
                double xi = x[array[j].intValue()];
                double xip = x[array[j+1].intValue()];
                double yi = y[array[j].intValue()];
                double yip = y[array[j+1].intValue()];
                double dis = Math.sqrt(Math.pow(xi-xip,2) + Math.pow(yi-yip,2));
                summ += dis;
            }
            sum += summ/pc;
        }
        System.out.println(sum);


    }

    public static void pem(ArrayList<Integer> data){
        ArrayList<Integer> candidate = new ArrayList<Integer>(data);
        ArrayList<Integer> perm = new ArrayList<Integer>();
        _pem(candidate,perm);
    }
    private static void _pem(ArrayList<Integer> candidate, ArrayList<Integer> pem){
        if(candidate.size() == 0) {
            Integer ary[] = new Integer[N];
            for(int i=0; i<N;i++){
                ary[i] = pem.get(i);
            }
            permitations.add(ary);
        }

        for(int i=0; i < candidate.size(); i++){
            ArrayList<Integer> p = new ArrayList<Integer>(pem);
            ArrayList<Integer> c = new ArrayList<Integer>(candidate);
            p.add(c.get(i));
            c.remove(i);
            _pem(c,p);
        }
    }

}