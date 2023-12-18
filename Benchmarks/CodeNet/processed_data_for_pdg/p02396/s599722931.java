public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
       while(true){
            int x = sc.nextInt();
            if(x == 0) break;
            list.add(x);
       }
       int count = 0;
       for(int a :list){
            count ++;
            System.out.println("Case "+count+": "+a);
        }
    }}
