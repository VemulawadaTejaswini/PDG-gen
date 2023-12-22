import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int M = scanner.nextInt();
    int[][] pqcs = new int[M][3];
    for(int i=0;i<M;i++) {
      pqcs[i][0] = scanner.nextInt();
      pqcs[i][1] = scanner.nextInt();
      pqcs[i][2] = scanner.nextInt();
    }

    HashMap<Integer, List<Pair>> routes = new HashMap<>();
    for(int[] pqc : pqcs) {
      if(routes.get(pqc[0]) == null) routes.put(pqc[0], new ArrayList<>());
      routes.get(pqc[0]).add(new Pair(pqc[1], pqc[2]));
      if(routes.get(pqc[1]) == null) routes.put(pqc[1], new ArrayList<>());
      routes.get(pqc[1]).add(new Pair(pqc[0], pqc[2]));
    }

    PriorityQueue<State> pq = new PriorityQueue<State>();
    HashMap<Integer, List<CFPair>> stationToFare = new HashMap<>();
    List<Pair> nextPairs = routes.get(1);
    if(nextPairs != null) {
      for(Pair p : nextPairs) {
        pq.add(new State(p.station, 1, p.company));
        List<CFPair> aList = new ArrayList<>();
        aList.add(new CFPair(p.company, 1));
        stationToFare.put(p.station, aList);
        List<CFPair> bList = new ArrayList<>();
        bList.add(new CFPair(p.company, 0));
        stationToFare.put(1, bList);
      }
    }
    while(!pq.isEmpty()) {
      State s = pq.remove();
      nextPairs = routes.get(s.station);
      if(nextPairs != null) {
        for(Pair p : nextPairs) {
          int fare = (p.company==s.company)? s.fare : s.fare + 1;
          List<CFPair> fares = stationToFare.get(p.station);
          if(fares != null) {
            boolean outerContinue = false;
            for(CFPair cfp : fares) {
              if(cfp.company == p.company) {
                if(cfp.fare <= fare) {
                  outerContinue = true;
                  break;
                }
              }
            }
            if(outerContinue) continue;
            if(fares.get(0).fare == fare) {
              fares.add(new CFPair(p.company, fare));
            } else if(fares.get(0).fare > fare) {
              List<CFPair> aList = new ArrayList<>();
              aList.add(new CFPair(p.company, fare));
              stationToFare.put(p.station, aList);
            } else {
              continue;
            }
          } else {
            List<CFPair> aList = new ArrayList<>();
            aList.add(new CFPair(p.company, fare));
            stationToFare.put(p.station, aList);
          }
          pq.add(new State(p.station, fare, p.company));
        }
      }
    }
    List<CFPair> finalCFPairs = stationToFare.get(N);
    if(finalCFPairs == null) System.out.println(-1);
    else System.out.println(finalCFPairs.get(0).fare);

    scanner.close();
  }
  
  private static class State implements Comparable<State> {
    int station;
    int fare;
    int company;
    public State(int s, int f, int c) {
      station = s;
      fare = f;
      company = c;
    }

    public int compareTo(State another) {
      return this.fare - another.fare;
    }

    public String toString() {
      return String.format("st.%d, fare.%d, com.%d", station, fare, company);
    }
  }
  private static class Pair {
    int station;
    int company;
    public Pair(int s, int c) {
      station = s;
      company = c;
    }
    public String toString() {
      return String.format("st.%d, com.%d", station, company);
    }
  }
  private static class CFPair {
    int company;
    int fare;
    public CFPair(int c, int f) {
      company = c;
      fare = f;
    }
    public String toString() {
      return String.format("com.%d, fare.%d", company, fare);
    }
  }

}
