class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int box = a;
        int b = sc.nextInt();
        double t = sc.nextInt();
        int count = 1;
        int c = a;
        t += 0.5;
        ArrayList<Integer> time = new ArrayList<>();
        while(count <= 20){
            time.add(c);
            ++count;
            c = a * count;
        }
        int countTime = 0;
        for(int x : time){
            if(x > t){
                break;
            }else{
                ++countTime;
            }
        }
        if(a < t){
            System.out.println(countTime * b);
        }else{
            System.out.println(0);
        }
    }
}
