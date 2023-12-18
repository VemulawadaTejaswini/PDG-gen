public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numList = new ArrayList<Integer>();
        while(sc.hasNext()){
            int n = sc.nextInt();
            if(n == 0){
                break;
            }else{
                numList.add(n);
            }
        }
        for(int i = 1; i <= numList.size(); i++){
            System.out.println("Case " + i + ": " + numList.get(i - 1));
        }
    }
}
