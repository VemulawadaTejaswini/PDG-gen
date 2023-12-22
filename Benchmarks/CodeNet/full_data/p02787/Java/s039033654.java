import java.util.*;

public class Main {

    public static class Enemy {
        public long pos;
        public long hp;
        public Enemy( long pos , long hp ){
            this.pos = pos;
            this.hp = hp;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] params = sc.nextLine().split(" ");
        int n = Integer.parseInt(params[0]);
        long d = Long.parseLong(params[1]);
        long a = Long.parseLong(params[2]);
        Enemy[] enemies = new Enemy[n];
        for( int i = 0 ; i < n ; i++ ){
            params = sc.nextLine().split(" ");
            enemies[i] = new Enemy( Long.parseLong(params[0]) , Long.parseLong(params[1]) );
        }

        Arrays.sort(enemies, new Comparator<Enemy>() {
            @Override
            public int compare(Enemy o1, Enemy o2) {
                if( o1.pos < o2.pos ){
                    return -1;
                }
                if( o1.pos == o2.pos ){
                    return 0;
                }
                return 1;
            }
        });

        long ans = 0;
        for( int i = 0 ; i < n ; i++ ){
            if( enemies[i].hp <= 0 ){
                continue;
            }
            long attackCount = enemies[i].hp / a + ( enemies[i].hp % a == 0 ? 0 : 1 );
            ans += attackCount;
            for( int j = i + 1 ; j < n ; j++ ){
                if( enemies[j].pos <= enemies[i].pos + 2 * d ){
                    enemies[j].hp -= attackCount * a;
                    continue;
                }
                break;
            }
        }

        System.out.println( ans );
    }

}
