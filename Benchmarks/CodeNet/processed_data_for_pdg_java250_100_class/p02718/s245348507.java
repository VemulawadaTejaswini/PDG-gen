public class Main {
    public static void main(String args[]){
        Scanner kb = new Scanner(System.in);
        int nums = kb.nextInt(), sel = kb.nextInt();
        int[] num = new int[nums];
        int total = 0, totalvotes = 0;
        for(int i = 0; i < nums; i++){
            num[i] = kb.nextInt();
            totalvotes += num[i];
        }
        Arrays.sort(num);
        float req = (float)(totalvotes)/(4*sel);
        for(int i = nums-1; i >= 0; i--){
            if(num[i] >= req){
                total++;
            }
        }
        if(total < sel){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }
    }
}
