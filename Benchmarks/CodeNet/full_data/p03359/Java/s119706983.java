class kyoupro {
    public static void main(String[] args){
        for (int i = 5; i < 365; i++){
            for (int j = 5; j < 31; j++){
                if (j == 5){
                    System.out.println("高橋");
                    continue;
                } else if (i == 5){
                  System.out.println("高橋");
                  break;
                }
                System.out.println("高橋");
            }
        }
    }
}