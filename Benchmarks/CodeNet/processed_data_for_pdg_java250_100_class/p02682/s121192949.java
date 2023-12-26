public class Main{
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int k = sc.nextInt();
        int sum_number = 0;
        int[] numbers = {1,0,-1};
        int[] cards = {a,b,c}; 
        for(int i = 0; i<=2; i++){
            if(cards[i]<=k){
                sum_number = sum_number + (numbers[i] * cards[i]);
                k = k - cards[i];
            }else{
                sum_number = sum_number + (numbers[i] * k);
                break;
            }
        }
        System.out.println(sum_number);
        return;
    }    
}
