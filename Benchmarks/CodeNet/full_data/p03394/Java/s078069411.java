import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        long sum = 0;
        int tmp = 2;
        StringBuilder sb = new StringBuilder();
        ArrayList al = new ArrayList<Integer>();

        for(int i=0; i<n; i++){
            while(true){
                if(tmp%2==0 || tmp%3==0){
                    al.add(tmp);
                    
                    sum += tmp;
                    tmp++;
                    break;
                }
                tmp++;  
            }
        }
        
        if(sum % 6 == 0){

        }else if(sum % 6 == 2){
            al.removeAll(Arrays.asList(new Integer[]{8}));
            al.add(29994);
        }else if(sum % 6 == 3){
            al.removeAll(Arrays.asList(new Integer[]{9}));
            al.add(29994);
        }else if(sum % 6 == 5){
            al.removeAll(Arrays.asList(new Integer[]{8}));
            al.add(29998);
        }

        for(int i=0; i<n; i++){
            sb.append(al.get(i));
            sb.append(" ");       
        }
        System.out.println(new String(sb));
    }
}
