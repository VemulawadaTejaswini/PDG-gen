import java.util.*;
 
 class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<Integer>(); 
        List<Integer> alist = new ArrayList<Integer>(); 
        for(int i=0; i<=n; i++){
            list.add(sc.nextInt());      
        }
        for(int i=0; i<=n; i++){
            alist.add(sc.nextInt());      
        }
        int cnt = 0;
        int count =0;
        for(int a: alist) {
        	if(a < list.get(cnt) + list.get(cnt + 1) ) {
        		count =+ a;
        	}else {
        	count =list.get(cnt) + list.get(cnt + 1);
        	}
        	cnt++;
        }
        System.out.println(count);
    }
}