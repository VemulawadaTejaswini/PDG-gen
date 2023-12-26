class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();                   
        int m = sc.nextInt();                   
        int x = sc.nextInt();                   
        List<Integer> cost = new ArrayList<>(); 
        int left = 0;                           
        int right = 0;                          
        for(int i = 0;i < m;i++){
            int num = sc.nextInt();
            cost.add(num);
        }
        for(int i = 1;i <= n;i++){
            int index = 0;
            if(i < x && cost.contains(i)){
                left++;
                index++;
            }else if(i > x && cost.contains(i)){
                right++;
                index++;
            }
        }
        System.out.println(Math.min(left,right));
    }
}
