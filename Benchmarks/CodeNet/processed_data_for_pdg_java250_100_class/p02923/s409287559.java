public class Main {
	public static void main(final String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        int count = 0;
        int max = 0;
        for(int i = 0 ; i < n ; i++){
            list.add(sc.nextInt());
        }
        for(int i = 0 ; i < n -1 ; i++){
            if(list.get(i) >= list.get(i + 1)){
                count++;
            }else{
                if(max <= count){
                    max = count;
                }
                count = 0;
            }
        }
        if(max <= count){
            max = count;
        }
        System.out.println(max);
    }
}
