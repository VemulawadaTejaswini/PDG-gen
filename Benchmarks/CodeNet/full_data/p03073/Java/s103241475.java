import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String tile = sc.nextLine();
        sc.close();

        int tile_length = tile.length();
        int tile_type = tile_length % 2;
        int double_times = tile_length / 2;
        int plan1_pieces = 0;
        int plan2_pieces = 0;
        String tile_plan1 = "";
        String tile_plan2 = "";

        for(int i = 0; i < double_times; i++){
            tile_plan1 += "01";
            tile_plan2 += "10";
        }
        if(tile_type == 1){
            tile_plan1 += "0";
            tile_plan2 += "1";
        }

        for(int i = 0; i < tile_length; i++){
            if(tile.charAt(i) != tile_plan1.charAt(i)) plan1_pieces++;
            if(tile.charAt(i) != tile_plan2.charAt(i)) plan2_pieces++;
        }

        System.out.println(Math.min(plan1_pieces, plan2_pieces));
    }
}
