import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<String> name_list = new ArrayList<String>(N);
        for (int i = 0; i < N; i ++) {
            name_list.add(sc.next());
        }
        sc.close();
        Collections.sort(name_list);

        Vote[] vote = new Vote[N];
        int vote_num = 0;
        int vote_num_max = 1;
        for (int i = 0; i < N; i ++) {
            if (i == 0 || vote[vote_num-1].getName().equals(name_list.get(i)) == false) {
                vote_num++;
                vote[vote_num-1] = new Vote(name_list.get(i));
            } else {
                vote[vote_num-1].countup();
                if (vote_num_max < vote[vote_num-1].getCount()) {
                    vote_num_max = vote[vote_num-1].getCount();
                }
            }
        }

        for (int i = 0; i < vote_num; i ++) {
            if (vote_num_max == vote[i].getCount()) {
                System.out.printf("%s\n", vote[i].getName());
            }
        }
    }
}

class Vote implements Comparable<Vote> {
    private String name;
    private int count;
    public Vote(String name_p) {
        name = name_p;
        count = 1;
    }
    public void countup() {
        count++;
    }
    public String getName() {
        return name;
    }
    public int getCount() {
        return count;
    }

    @Override
    public int compareTo(Vote vote) {
        if (this.name.compareTo(vote.name) < 0) {
            return -1;
        } else if (this.name.compareTo(vote.name) > 0) {
            return -1;
        } else {
            if (this.count < vote.count) {
                return -1;
            } else if (this.count > vote.count) {
                return -1;
            }
            return 0;
        }
    }
}
