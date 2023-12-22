public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int circle = sc.nextInt();
        int num = sc.nextInt();
        int[] house = new int[num];
        for (int i = 0; i < house.length; i++){
            int moto = sc.nextInt();
            int hiki  = circle - moto;
            if (moto >= hiki){
                house[i] = hiki;
            }else {
                house[i] = moto;
            }
        }
        int sabun = 0;
        for (int j = 0; j < house.length - 1; j++){
            int sabunCheck = Math.abs( house[j] - house[j + 1]);
            if (sabun > sabunCheck){
                sabun = sabunCheck;
            }
        }
        int sabuncheck2 = Math.abs(house[house.length - 1] - house[0]);
        if (sabuncheck2 > sabun){
            System.out.println(circle - sabuncheck2);
        }else {
            System.out.println(circle - sabun);
        }

    }
}
