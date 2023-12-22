import java.util.*;

class Main {
    boolean[][] MAP;
    int H, W;

    Main(){
        Scanner SC = new Scanner(System.in);
        H = Integer.parseInt(SC.next());
        W = Integer.parseInt(SC.next());

        MAP = new boolean[W][H];

        for(int y=0;y<H;y++){
            String S = SC.next();
            for(int x=0;x<W;x++){
                if(S.charAt(x) == '.'){
                    MAP[x][y] = true;
                } else {
                    MAP[x][y] = false;
                }
            }
        }

        int max=0;
        for(int x=0;x<W;x++){
            for(int y=0;y<H;y++){
                if(MAP[x][y]){
                    max = Math.max(max, BFS(x,y));
                }
            }
        }

        System.out.println(max);
    }

    class Node{
        int x,y,cost;

        Node(int x, int y, int cost){
            this.x = x;
            this.y = y;
            this.cost = cost;
        }
    }

    int BFS(int x, int y){
        ArrayList<Node> openList  = new ArrayList<Node>();
        boolean[][] isDone = new boolean[W][H];

        openList.add(new Node(x,y,0));
        isDone[x][y] = true;

        int max = 0;
        Node[] temp = new Node[4];
        while(!openList.isEmpty()){
            Node node = openList.get(0);

            max = Math.max(node.cost, max);

            temp[0] = new Node(node.x-1, node.y, node.cost+1);
            temp[1] = new Node(node.x+1, node.y, node.cost+1);
            temp[2] = new Node(node.x, node.y-1, node.cost+1);
            temp[3] = new Node(node.x, node.y+1, node.cost+1);

            for(int i=0;i<4;i++){
                if(temp[i].x < 0 || W <= temp[i].x)continue;
                if(temp[i].y < 0 || H <= temp[i].y)continue;
                if(MAP[temp[i].x][temp[i].y] && !isDone[temp[i].x][temp[i].y]){
                    openList.add(temp[i]);
                    isDone[temp[i].x][temp[i].y] = true;
                }
            }

            openList.remove(0);
        }

        return max;
    }

    public static void main(String args[]){
        Main main = new Main();
    }

}
