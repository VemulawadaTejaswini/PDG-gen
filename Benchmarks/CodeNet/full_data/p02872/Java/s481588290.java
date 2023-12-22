#include <algorithm>
#include <array>
#include <cassert>
#include <chrono>
#include <cmath>
#include <cstdlib>
#include <iostream>
#include <map>
#include <memory>
#include <numeric>
#include <queue>
#include <set>
#include <sstream>
#include <string>
#include <unordered_map>
#include <unordered_set>
#include <vector>

using namespace std;

const double CPU_FREQ_ATCODER = 1.0 / (28 * 100 * 1000);
const double CPU_FREQ = CPU_FREQ_ATCODER;

static unsigned long long rdtsc()
{
  unsigned int low, high;
  __asm__ volatile("rdtsc"
                   : "=a"(low), "=d"(high));
  return ((unsigned long long int)low) | ((unsigned long long int)high << 32);
}

class Timer
{
  long long accumerated;
  long long start;
  long long cycle;

public:
  Timer()
  {
    start = rdtsc();
    accumerated = 0;
  }
  void reset()
  {
    start = rdtsc();
    accumerated = 0;
  }

  inline double elapsed()
  {
    cycle = rdtsc();
    return (accumerated + cycle - start) * CPU_FREQ;
  }

  inline void stop()
  {
    cycle = rdtsc();
    accumerated += cycle - start;
  }

  inline void restart()
  {
    start = rdtsc();
  }
};

inline double calcTemp(double startTime, double endTime, double curTime, double startTemp, double endTemp)
{
  const double c = 1 - (curTime - startTime) / (endTime - startTime);
  return c * (startTemp - endTemp) + endTemp;
}

class XorShiftL
{
  static const int LOG_CACHE_SIZE = 0x10000;

  int logIndex = 0;
  double logCache[LOG_CACHE_SIZE];

  std::uint64_t x = 88172645463325252LL;

public:
  XorShiftL()
  {
    for (int i = 0; i < LOG_CACHE_SIZE; i++) {
      logCache[i] = log((i + 0.5) / 0x10000);
    }
    shuffle(logCache);
  }

  std::uint64_t xor64()
  {
    x = x ^ (x << 7);
    return x = x ^ (x >> 9);
  }

  // [0, n)
  int nextInt(int n) { return xor64() % n; }

  // [low, high)
  int nextInt(int low, int high) { return xor64() % (high - low) + low; }
  double nextDouble() { return xor64() / double(std::numeric_limits<std::uint64_t>::max()); }

  /**
   * 2つの相異なる数をランダムに取得する
   * get<0>(result) < get<1>(result) が保証されている
   */
  std::tuple<int, int> nextIntPair(int low, int high)
  {
    int i = nextInt(low, high);
    int j = nextInt(low, high - 1);
    if (j >= i)
      j++;
    else
      std::swap(i, j);
    return std::make_tuple(i, j);
  }

  /**
   * 2つの相異なる数をランダムに取得する
   * get<0>(result) < get<1>(result) は保証されない
   */
  std::tuple<int, int> nextIntUnorderedPair(int low, int high)
  {
    int i = nextInt(low, high);
    int j = nextInt(low, high - 1);
    if (j >= i)
      j++;
    return std::make_tuple(i, j);
  }

  /**
   * ログを取得する
   */
  double nextLog()
  {
    const double res = logCache[logIndex++];
    if (logIndex == LOG_CACHE_SIZE) {
      logIndex = 0;
    }
    return res;
  }

  template <typename T>
  void shuffle(T &s)
  {
    for (int i = 1; i < (int)s.size(); i++) {
      int j = nextInt(0, i + 1);
      if (i != j) {
        std::swap(s[i], s[j]);
      }
    }
  }

  template <typename T, int n>
  void shuffle(T (&ary)[n])
  {
    for (int i = 1; i < n; i++) {
      int j = nextInt(0, i + 1);
      if (i != j) {
        std::swap(ary[i], ary[j]);
      }
    }
  }
};

class Seq
{
  struct OpHistory {
    int i, j;

    OpHistory() {}
    OpHistory(int i, int j) : i(i), j(j) {}
  };

  vector<int> seq;
  vector<OpHistory> history;

public:
  void push(int v)
  {
    seq.push_back(v);
  }

  vector<int>::iterator begin()
  {
    return seq.begin();
  }

  vector<int>::iterator end()
  {
    return seq.end();
  }

  int size() const
  {
    return seq.size();
  }

  void commit()
  {
    history.clear();
  }

  void rollback()
  {
    while (!history.empty()) {
      auto h = history.back();
      history.pop_back();
      std::swap(seq[h.i], seq[h.j]);
    }
  }

  void swap(int i, int j)
  {
    std::swap(seq[i], seq[j]);
    history.emplace_back(i, j);
  }

  int operator[](int i) const { return seq[i]; }
};

#ifdef PROFILE
#include <gperftools/profiler.h>
#endif

using namespace std;

struct Edge {
  int to, d;
  Edge() {}
  Edge(int to_, int d_) : to(to_), d(d_){};
};

struct Order {
  int64_t t;
  int id, dst;
  Order() {}
  Order(int t_, int id_, int dst_) : t(t_), id(id_), dst(dst_){};
  bool operator<(const Order &o) const { return t < o.t; }
};

int V, E;
vector<vector<Edge>> g;
vector<vector<int>> nxt;
vector<vector<int>> tim;
int64_t Tmax;
vector<Order> orders;
Timer timer;
XorShiftL rng;

template <typename T>
using pq = priority_queue<T, vector<T>, greater<T>>;

int64_t curCost = 1LL << 60;

vector<int> freq;

const int TIME_LIMIT = 29500;

// struct State {
//   struct Context {
//     vector<int> numDeliveredOrders;
//     int lastPickTime;
//     int64_t score;
//     int numTotalDeliveredOrders;
//     int curTime;

//     vector<int> unpickedOrders(vector<vector<Order>> &orders_) const
//     {
//       vector<int> res;
//       for (int pos = 0; pos < (int)orders_.size(); pos++) {
//         for (int j = (int)orders_[pos].size() - 1; j >= 0; j--) {
//           if (orders_[pos][j].t <= lastPickTime) {
//             break;
//           }
//           res.push_back(orders_[pos][j].id);
//         }
//       }
//       return res;
//     }

//     int numUnpickedOrders(vector<vector<Order>> &orders_) const
//     {
//       int res = 0;
//       for (int pos = 0; pos < (int)orders_.size(); pos++) {
//         for (int j = (int)orders_[pos].size() - 1; j >= 0; j--) {
//           if (orders_[pos][j].t <= lastPickTime) {
//             break;
//           }
//           res++;
//         }
//       }
//       return res;
//     }

//     vector<int> achievedOrder(int pos, vector<vector<Order>> &orders_)
//     {
//       vector<int> res;
//       // cerr << "achievedOrder " << lastPickTime << " " << numDeliveredOrders[pos] << " " << (int)orders_[pos].size() << endl;
//       for (int j = numDeliveredOrders[pos]; j < (int)orders_[pos].size(); j++) {
//         if (orders_[pos][j].t > lastPickTime) {
//           break;
//         }
//         res.push_back(orders_[pos][j].id);
//       }
//       return res;
//     }

//     bool existsUndeliveredOrder(vector<vector<Order>> &orders_) const
//     {
//       for (int pos = 0; pos < (int)orders_.size(); pos++) {
//         if ((int)orders_[pos].size() != numDeliveredOrders[pos]) {
//           return true;
//         }
//       }
//       return false;
//     }
//   };

//   int s, t, distFromS;
//   vector<vector<Order>> orders;
//   vector<Order> orders2;
//   vector<int> deliverRoute;
//   Context context, simulateContext;

//   void init()
//   {
//     orders.resize(V);
//     context.numDeliveredOrders.resize(V);
//     context.lastPickTime = -1;
//     context.score = 0;
//     context.numTotalDeliveredOrders = 0;
//     context.curTime = 0;
//     s = distFromS = 0;
//     t = 0;
//   }

//   void deliver(int pos, Context &ctx)
//   {
//     while (ctx.numDeliveredOrders[pos] < (int)orders[pos].size()) {
//       auto &order = orders[pos][ctx.numDeliveredOrders[pos]];
//       if (order.t > ctx.lastPickTime) {
//         break;
//       }
//       ctx.numDeliveredOrders[pos]++;
//       int64_t waitingTime = ctx.curTime - order.t;
//       ctx.score += Tmax * Tmax - waitingTime * waitingTime;
//       ctx.numTotalDeliveredOrders++;
//     }
//   }

//   void calcRouteScore(Context &ctx)
//   {
//     if (deliverRoute.empty()) {
//       return;
//     }

//     int u, v;
//     v = deliverRoute[0];
//     ctx.curTime += std::min(tim[s][v] + distFromS, tim[t][v] + tim[s][t] - distFromS);
//     deliver(v, ctx);
//     if (v == 0) {
//       ctx.lastPickTime = ctx.curTime;
//     }

//     for (int i = 1; i < (int)deliverRoute.size(); i++) {
//       v = deliverRoute[i];
//       if (v != 0 && ctx.numDeliveredOrders[v] == (int)orders[v].size()) {
//         continue;
//       }

//       if (v == 0 && context.curTime <= ctx.lastPickTime) {
//         continue;
//       }

//       u = deliverRoute[i - 1];
//       ctx.curTime += tim[u][v];
//       deliver(v, ctx);
//       if (v == 0) {
//         ctx.lastPickTime = ctx.curTime;
//       }
//     }
//   }

//   vector<int> optimize(vector<Order> &newOrders, vector<int> &putOrders)
//   {
//     auto t0 = timer.elapsed();
//     double turnTimeLimit = (TIME_LIMIT - t0) / (Tmax - context.curTime);

//     // TODO deliverRouteの重複を取り除く
//     for (auto &newOrder : newOrders) {
//       // if (newOrder.dst == 282) {
//       //   cerr << "new order to 282 : " << context.curTime << " " << newOrder.t << endl;
//       // }
//       orders[newOrder.dst].push_back(newOrder);
//     }

//     if (!newOrders.empty() && find(deliverRoute.begin(), deliverRoute.end(), 0) == deliverRoute.end()) {
//       deliverRoute.push_back(0);
//     }

//     for (auto &newOrder : newOrders) {
//       deliverRoute.push_back(newOrder.dst);
//     }

//     if (s == 0 && distFromS == 0) {
//       // for debug
//       // auto unpickedOrders = context.unpickedOrders(orders);
//       // sort(unpickedOrders.begin(), unpickedOrders.end());
//       // sort(putOrders.begin(), putOrders.end());
//       // if (unpickedOrders != putOrders) {
//       //   cerr << __LINE__ << " " << putOrders.size() << " " << unpickedOrders.size() << endl;
//       //   throw;
//       // }
//       // cerr << "pick orders : " << context.curTime << endl;
//       putOrders.clear(); // for hide warning

//       context.lastPickTime = context.curTime;
//     }

//     eraseFront();

//     // 今見えている荷物を全て配るルートしか探索していない
//     // しかし将来オーダーされる品物を先に届ける方が特な場合もある
//     if (!deliverRoute.empty() && deliverRoute.size() >= 2) {
//       simulateContext = context;
//       calcRouteScore(simulateContext);
//       auto curScore = simulateContext.score;
//       auto firstScore = curScore;

//       if (simulateContext.existsUndeliveredOrder(orders)) {
//         cerr << "LINE " << __LINE__ << endl;
//         throw;
//       }

//       int iter = 0;
//       while (true) {
//         double elapsed = timer.elapsed() - t0;
//         if (elapsed > turnTimeLimit) break;

//         int i, j;
//         tie(i, j) = rng.nextIntUnorderedPair(0, deliverRoute.size());
//         swap(deliverRoute[i], deliverRoute[j]);

//         simulateContext = context;
//         calcRouteScore(simulateContext);
//         if (simulateContext.existsUndeliveredOrder(orders)) {
//           swap(deliverRoute[i], deliverRoute[j]);
//           continue;
//         }
//         if (curScore > simulateContext.score) {
//           swap(deliverRoute[i], deliverRoute[j]);
//           continue;
//         }
//         curScore = simulateContext.score;
//         iter++;
//       }
//       cerr << "iter=" << iter << ",firstScore=" << firstScore << ",curScore=" << curScore << ",turnTimeLimit=" << turnTimeLimit << ",improved=" << (firstScore != curScore) << endl;
//     }

//     context.curTime++;
//     step();

//     vector<int> achieved;
//     if (distFromS == 0) {
//       // for debug
//       // achieved = context.achievedOrder(s, orders);
//       // if (s == 282) {
//       //   cerr << "move to 282 : " << s << " " << distFromS << " " << context.curTime << " " << context.lastPickTime << " " << context.numDeliveredOrders[s] << endl;
//       // }
//       deliver(s, context);
//     }

//     return achieved;
//   }

//   void eraseFront()
//   {
//     while (!deliverRoute.empty() && deliverRoute[0] == s && distFromS == 0) {
//       deliverRoute.erase(deliverRoute.begin());
//     }
//   }

//   void step()
//   {
//     eraseFront();

//     if (deliverRoute.empty()) {
//       deliverRoute.push_back(0);
//     }

//     if (s == t && s != deliverRoute[0]) {
//       t = nxt[s][deliverRoute[0]];
//     }

//     if (s == t) {
//       cout << -1 << endl;
//       return;
//     }

//     // cerr << s << " " << t << " " << distFromS << " " << deliverRoute[0] << " " << endl;
//     if (tim[s][deliverRoute[0]] + distFromS < tim[t][deliverRoute[0]] + tim[s][t] - distFromS) {
//       if (distFromS > 0) {
//         distFromS--;
//         swap(s, t);
//         distFromS = tim[s][t] - distFromS;
//       } else {
//         t = nxt[s][deliverRoute[0]];
//         distFromS++;
//       }
//     } else {
//       distFromS++;
//     }

//     // cerr << s << " " << t << " " << distFromS << " " << deliverRoute[0] << " " << endl;
//     cout << (t + 1) << endl;

//     if (distFromS == tim[s][t]) {
//       s = t;
//       distFromS = 0;
//     }
//   }
// };

struct Graph {
  int s, t, distFromS, curTime, lastPickTime;

  Graph()
  {
    s = t = distFromS = curTime = 0;
    lastPickTime = -1;
  }

  void moveTo(int v)
  {
    curTime += calcDist(v);
    s = t = v;
    distFromS = 0;
    if (v == 0) {
      lastPickTime = curTime;
    }
  }

  int calcDist(int v) const
  {
    if (distFromS != 0) {
      return std::min(tim[s][v] + distFromS, tim[t][v] + tim[s][t] - distFromS);
    }
    return tim[s][v];
  }

  int getDist(int u, int v) const
  {
    return tim[u][v];
  }

  bool isPicked(int orderTime) const
  {
    return orderTime <= lastPickTime;
  }

  bool isPickedNow(int orderTime) const
  {
    return orderTime == lastPickTime;
  }

  bool isVertex() const
  {
    return distFromS == 0;
  }

  void step(int v)
  {
    curTime++;

    if (s == v && distFromS == 0) {
      // stay
      if (s == 0 && distFromS == 0) {
        lastPickTime = curTime;
      }

      cout << -1 << endl;
      return;
    }

    if (distFromS == 0) {
      t = nxt[s][v];
    }

    if (tim[s][v] + distFromS >= tim[t][v] + tim[s][t] - distFromS) {
      distFromS++;
      if (distFromS > tim[s][t]) {
        cerr << "LINE " << __LINE__ << endl;
        throw;
      }
      cout << (t + 1) << endl;
      if (distFromS == tim[s][t]) {
        s = t;
        distFromS = 0;
      }
    } else {
      distFromS--;
      if (distFromS < 0) {
        cerr << "LINE " << __LINE__ << endl;
        throw;
      }
      cout << (s + 1) << endl;
    }

    if (s == 0 && distFromS == 0) {
      lastPickTime = curTime;
    }
  }

  int64_t calcScore(int64_t orderedTime)
  {
    int64_t waitingTime = curTime - orderedTime;
    return Tmax * Tmax - waitingTime * waitingTime;
  }

  bool on(int v) const
  {
    return distFromS == 0 && s == v;
  }
};

struct State2 {
  Graph graph;
  vector<Order> orders2;
  vector<int> deliverOrder;
  int64_t score = 0;
  // int prevPickedTime = -1;

  bool pickFlag = false;
  vector<int> reservedOrder;

  int getNumUnpickedOrders()
  {
    int cnt = 0;
    for (int o : deliverOrder) {
      if (!graph.isPicked(orders2[o].t)) {
        cnt++;
      }
    }
    return cnt;
  }

  vector<int> constructNearestNeighbor(vector<Order> &newOrders, vector<int> &putId)
  {
    copy(newOrders.begin(), newOrders.end(), back_inserter(orders2));
    for (auto &order : newOrders) {
      deliverOrder.push_back(order.id);
    }

    // for (int i = 0; i < orders2.size(); i++) {
    //   if (orders2[i].id != i) {
    //     cerr << __LINE__ << " " << i << " " << orders2[i].id << endl;
    //     throw;
    //   }
    // }

    // if (graph.isVertex()) {
    //   vector<int> putOrders;
    //   for (auto& o : orders2) {
    //     if (graph.s == 0 && graph.isPicked(o.t) && o.t > prevPickedTime) {
    //       putOrders.push_back(o.id);
    //     }
    //   }
    //   sort(putOrders.begin(), putOrders.end());
    //   sort(putId.begin(), putId.end());

    //   if (putId != putOrders) {
    //     cerr << "LINE " << __LINE__ << " " << putId.size() << " " << putOrders.size() << " " << graph.s << " " << graph.distFromS << endl;
    //     for (auto i : putId) {
    //       cerr << "LINE " << __LINE__ << " " << orders2[i].id << " " << orders2[i].t << " " << graph.curTime << " " << graph.lastPickTime << endl;
    //     }
    //     for (auto i : putOrders) {
    //       cerr << "LINE " << __LINE__ << " " << orders2[i].id << " " << orders2[i].t << " " << graph.curTime << " " << graph.lastPickTime << endl;
    //     }
    //     throw;
    //   }
    // }
    // prevPickedTime = graph.lastPickTime;

    int numUnpickedOrders = getNumUnpickedOrders();
    int numPickedOrders = deliverOrder.size() - numUnpickedOrders;
    int64_t bestTotalDist = 1LL << 62; // score?
    vector<int> bestOrders;

    cerr << graph.curTime << " " << deliverOrder.size() << " " << numPickedOrders << " " << numUnpickedOrders << endl;

    // while (!reservedOrder.empty() && graph.on(orders2[reservedOrder.front()].dst)) {
    //   reservedOrder.erase(reservedOrder.begin());
    // }

    if (numUnpickedOrders == 0) {
      pickFlag = false;
    }

    if (!reservedOrder.empty() && numPickedOrders != (int)reservedOrder.size()) {
      // cerr << "new pick " << reservedOrder.size() << " " << numPickedOrders << endl;
      reservedOrder.clear();
    }

    if (!pickFlag && numUnpickedOrders >= 300) { // 470477682007
                                                 // if (!pickFlag && numUnpickedOrders >= 50) { //
      pickFlag = true;
      reservedOrder.clear();
    }

    // if (graph.on(0) && numPickedOrders < 30 && graph.curTime >= 1000 && graph.curTime <= 8000) {
    //   reservedOrder.clear();
    // }

    if (!reservedOrder.empty()) {
      return postProcess(reservedOrder[0]);
    }

    if (numPickedOrders > 2) {
      vector<int> pickedOrders;
      for (int i = 0; i < (int)deliverOrder.size(); i++) {
        if (graph.isPicked(orders2[deliverOrder[i]].t)) {
          pickedOrders.push_back(deliverOrder[i]);
        }
      }

      int64_t curValue = -(1LL << 60);
      for (int i = 0; i < 1000000; i++) {
        int a, b;
        tie(a, b) = rng.nextIntPair(0, pickedOrders.size());
        reverse(pickedOrders.begin() + a, pickedOrders.begin() + b);
        int64_t newScore = 0;
        auto simulateGraph = graph;
        for (int j : pickedOrders) {
          // a -> bに通る時に0を通るかどうか持っておくと良さそう
          if (!simulateGraph.isPicked(orders2[j].t)) {
            newScore += -simulateGraph.calcDist(0);
            simulateGraph.moveTo(0);
          }

          newScore += -simulateGraph.calcDist(orders2[j].dst);
          simulateGraph.moveTo(orders2[j].dst);
          // newScore += simulateGraph.calcScore(orders2[j].t);
        }
        newScore += -simulateGraph.calcDist(0);
        if (curValue <= newScore) {
          curValue = newScore;
          reservedOrder = pickedOrders;
        } else {
          reverse(pickedOrders.begin() + a, pickedOrders.begin() + b);
        }
      }

      return postProcess(reservedOrder[0]);
    }

    for (int startPickup = numPickedOrders / 2, firstUnpicked; startPickup <= numPickedOrders; startPickup = firstUnpicked + 1) {
      Graph tmpGraph = graph;

      int64_t totalDist = 0;

      for (int i = 0; i < (int)deliverOrder.size(); i++) {
        int nearestIndex = -1;
        auto nearestDist = make_pair(1e300, 1 << 29);
        for (int j = i; j < (int)deliverOrder.size(); j++) {
          if (i < startPickup && !tmpGraph.isPicked(orders2[deliverOrder[j]].t)) {
            continue;
          }
          int v = orders2[deliverOrder[j]].dst;
          auto d = make_pair(-orders2[deliverOrder[j]].t / (double)(tmpGraph.calcDist(v) + 0.0), tmpGraph.calcDist(v));
          if (nearestDist > d) {
            nearestDist = d;
            nearestIndex = j;
          }
          // cerr << orders2[deliverOrder[j]].t << " " << tmpGraph.calcDist(v) << " " << v << " " << tmpGraph.s << " " << tmpGraph.distFromS << endl;
        }
        swap(deliverOrder[i], deliverOrder[nearestIndex]);
        tmpGraph.moveTo(orders2[deliverOrder[i]].dst);
        totalDist += nearestDist.second;
      }

      firstUnpicked = deliverOrder.size();
      for (int i = 0; i < (int)deliverOrder.size(); i++) {
        if (!tmpGraph.isPicked(orders2[deliverOrder[i]].t)) {
          firstUnpicked = i;
          break;
        }
      }

      int insert0Index = firstUnpicked;
      // if (numPickedOrders <= 400) {
      tmpGraph = graph;
      auto nearestDist = 1 << 29;
      for (int i = 0; i <= firstUnpicked; i++) {
        if (i == (int)deliverOrder.size()) {
          nearestDist = 0;
          insert0Index = i;
          break;
        }
        int v = orders2[deliverOrder[i]].dst;
        int d0 = tmpGraph.calcDist(v);
        int d1 = tmpGraph.calcDist(0) + tmpGraph.getDist(0, v);
        tmpGraph.moveTo(v);
        int diff = d1 - d0;
        // なるべく後回しにした方がいいので等号入れる
        // if (nearestDist >= diff) {
        if (diff == 0) {
          nearestDist = diff;
          insert0Index = i;
        }
      }
      totalDist += nearestDist;
      // }

      // // スコア最大
      // tmpGraph = graph;
      // int64_t simulateScore = 0;
      // for (int orderId : deliverOrder) {
      //   tmpGraph.moveTo(orderId < 0 ? 0 : orders2[orderId].dst);
      //   int64_t waitingTime = graph.curTime - orders2[orderId].t;
      //   simulateScore += Tmax * Tmax - waitingTime * waitingTime;
      // }
      // totalDist = -simulateScore;

      if (bestTotalDist >= totalDist) {
        bestTotalDist = totalDist;
        bestOrders = deliverOrder;
        if (insert0Index >= 0) {
          bestOrders.insert(bestOrders.begin() + insert0Index, -1);
        }
        break;
      }
    }

    // if (graph.isVertex() && graph.s == 0) {
    //   if (deliverOrder.size() <= 50 && numUnpickedOrders >= 15) {
    //     bestOrders[0] = -1;
    //   }
    // }

    return postProcess(bestOrders[0]);
  }

  vector<int>
  postProcess(int id)
  {
    graph.step(id < 0 ? 0 : orders2[id].dst);
    vector<int> achieved;

    // cerr << graph.curTime << endl;
    if (graph.isVertex()) {
      auto achieve = [&](int x) { return graph.isPicked(orders2[x].t) && orders2[x].dst == graph.s; };
      for (auto e : deliverOrder) {
        if (!achieve(e)) continue;
        int64_t waitingTime = graph.curTime - orders2[e].t;
        score += Tmax * Tmax - waitingTime * waitingTime;
        achieved.push_back(e);
        // cerr << __LINE__ << " " << *e << " " << orders2[*e].id << " " << orders2[*e].t << " " << orders2[*e].dst << " " << achieve(*e) << endl;
      }
      auto removed = std::remove_if(deliverOrder.begin(), deliverOrder.end(), achieve);
      deliverOrder.erase(removed, deliverOrder.end());
      reservedOrder.erase(std::remove_if(reservedOrder.begin(), reservedOrder.end(), achieve), reservedOrder.end());
      // cerr << __LINE__ << " " << graph.s << " " << graph.distFromS << endl;
    }
    return achieved;
  }
};

// // GREEDY
// void greedy()
// {
//   int uo = 0;
//   int v = 0;
//   vector<Order> curOrders;
//   int64_t gCurTurn;

//   int curState = 0;

//   auto pick = [&]() {
//     if (v != 0) return;
//     for (; uo < (int)orders.size() && orders[uo].t <= gCurTurn; uo++) {
//       curOrders.push_back(orders[uo]);
//     }
//   };

//   auto step0 = [&]() {
//     if (curState != 0) return;
//     gCurTurn++;
//     curState = 1;
//     int n, id, dst;
//     cin >> n;
//     // cout << "read " << n << endl;
//     for (int j = 0; j < n; j++) {
//       cin >> id >> dst;
//       id--, dst--;
//       orders.emplace_back(gCurTurn, id, dst);
//     }

//     cin >> n;
//     for (int j = 0; j < n; j++) {
//       cin >> id;
//       id--;
//     }
//     pick();
//   };

//   auto step1 = [&]() {
//     if (curState != 1) return;
//     curState = 0;

//     string verdict;
//     cin >> verdict;

//     int n, id;
//     cin >> n;
//     for (int j = 0; j < n; j++) {
//       cin >> id;
//       id--;
//     }
//   };

//   auto moveTo = [&](int dst) {
//     while (v != dst) {
//       const int u = nxt[v][dst];
//       for (int i = 0; i < tim[v][u]; i++) {
//         step0();
//         if (gCurTurn > Tmax) return;
//         cout << u + 1 << endl;
//         step1();
//       }
//       v = u;
//     }
//   };

//   auto stay = [&]() {
//     step0();
//     if (gCurTurn > Tmax) return;
//     cout << -1 << endl;
//     step1();
//   };

//   for (gCurTurn = 0; gCurTurn < Tmax;) {
//     step0();

//     bool moveStore = curOrders.empty();
//     int unpickedOrder = (int)orders.size() - uo;
//     int restOrder = (int)curOrders.size();

//     moveStore |= restOrder <= 50 && unpickedOrder >= 15;

//     if (moveStore) {
//       moveTo(0);
//       while (curOrders.empty() || gCurTurn < curOrders[0].t) {
//         if (gCurTurn > Tmax) break;
//         stay();
//       }
//       continue;
//     }

//     int shortest = 0;
//     for (int i = 1; i < (int)curOrders.size(); i++) {
//       int d1 = curOrders[shortest].dst;
//       int d2 = curOrders[i].dst;
//       if (tim[v][d1] > tim[v][d2]) {
//         shortest = i;
//       }
//     }

//     moveTo(curOrders[shortest].dst);
//     auto result = remove_if(curOrders.begin(), curOrders.end(),
//                             [&](Order o) { return tim[v][o.dst] == 0; });
//     curOrders.erase(result, curOrders.end());
//   }

//   // cerr << "greedy=" << cost << endl;
// }

void solve()
{
  timer.reset();

  cin >> V >> E;
  g.resize(V);
  for (int i = 0; i < E; i++) {
    int u, v, d;
    cin >> u >> v >> d;
    u--, v--;
    g[u].emplace_back(v, d);
    g[v].emplace_back(u, d);
  }

  freq.resize(V);
  for (int i = 0; i < V; i++) {
    cin >> freq[i];
  }
  cin >> Tmax;

  nxt.assign(V, vector<int>(V));
  tim.assign(V, vector<int>(V));
  for (int i = 0; i < V; i++) {
    pq<pair<int, int>> que;
    que.emplace(0, i);
    vector<pair<int, int>> dist(V, make_pair(1 << 29, -1));
    dist[i].first = 0;
    while (!que.empty()) {
      int v, d;
      tie(d, v) = que.top();
      que.pop();
      if (dist[v].first != d) continue;
      for (auto e : g[v]) {
        int c = d + e.d;
        if (dist[e.to].first <= c) continue;
        dist[e.to] = make_pair(c, v);
        que.emplace(c, e.to);
      }
    }
    for (int j = 0; j < V; j++) {
      if (i == j) {
        nxt[i][j] = -1;
        tim[i][j] = 0;
        continue;
      }
      int v;
      for (v = j; dist[v].second != i; v = dist[v].second) {
      }
      nxt[i][j] = v;
      tim[i][j] = dist[j].first;
    }
  }

  // greedy();

  // State state;
  // state.init();
  // for (int64_t t = 0; t < Tmax; t++) {
  //   int Nnew, Nput, Nachieve;
  //   vector<Order> newOrders;
  //   vector<int> putOrders;
  //   vector<int> achieveOrders;

  //   cin >> Nnew;
  //   for (int i = 0; i < Nnew; i++) {
  //     //   Order(int t_, int id_, int dst_) : t(t_), id(id_), dst(dst_){};
  //     int newId, dst;
  //     cin >> newId >> dst;
  //     newOrders.emplace_back(t, newId - 1, dst - 1);
  //   }

  //   cin >> Nput;
  //   for (int i = 0; i < Nput; i++) {
  //     int putId;
  //     cin >> putId;
  //     putOrders.push_back(putId - 1);
  //   }

  //   auto achieved = state.optimize(newOrders, putOrders);
  //   timer.stop();

  //   string verdict;
  //   cin >> verdict;

  //   if (verdict != "OK") {
  //     throw;
  //   }

  //   cin >> Nachieve;
  //   for (int i = 0; i < Nachieve; i++) {
  //     int achieveId;
  //     cin >> achieveId;
  //     achieveOrders.push_back(achieveId - 1);
  //   }

  //   timer.restart();

  //   // for debug
  //   // sort(achieved.begin(), achieved.end());
  //   // sort(achieveOrders.begin(), achieveOrders.end());
  //   // if (achieveOrders != achieved) {
  //   //   cerr << __LINE__ << " " << achieveOrders.size() << " " << achieved.size() << endl;
  //   //   throw;
  //   // }
  // }

  // cerr << "Score = " << state.context.score << endl;
  vector<int> cnt(V, 0);

  State2 state;
  for (int64_t t = 0; t < Tmax; t++) {
    int Nnew, Nput, Nachieve;
    vector<Order> newOrders;
    vector<int> putOrders;
    vector<int> achieveOrders;

    cin >> Nnew;
    for (int i = 0; i < Nnew; i++) {
      int newId, dst;
      cin >> newId >> dst;
      newOrders.emplace_back(t, newId - 1, dst - 1);
      orders.push_back(newOrders.back());
      cnt[dst - 1]++;
    }

    cin >> Nput;
    for (int i = 0; i < Nput; i++) {
      int putId;
      cin >> putId;
      putOrders.push_back(putId - 1);
    }

    auto achieved = state.constructNearestNeighbor(newOrders, putOrders);
    timer.stop();

    string verdict;
    cin >> verdict;

    if (verdict != "OK") {
      throw;
    }

    cin >> Nachieve;
    for (int i = 0; i < Nachieve; i++) {
      int achieveId;
      cin >> achieveId;
      achieveOrders.push_back(achieveId - 1);
    }

    timer.restart();

    // for debug
    sort(achieved.begin(), achieved.end());
    sort(achieveOrders.begin(), achieveOrders.end());
    if (achieveOrders != achieved) {
      cerr << __LINE__ << " " << achieveOrders.size() << " " << achieved.size() << endl;
      for (int a : achieved) {
        cerr << __LINE__ << " " << a << " " << orders[a].id << " " << orders[a].dst << " " << orders[a].t << endl;
      }
      for (int a : achieveOrders) {
        cerr << __LINE__ << " " << a << " " << orders[a].id << " " << orders[a].dst << " " << orders[a].t << endl;
      }
      throw;
    }
  }

  // for (int i = 0; i < V; i++) {
  //   cerr << i << " " << cnt[i] << endl;
  // }

  cerr << "Simulation score = " << state.score << endl;
}

int main()
{
#ifdef PROFILE
  ProfilerStart("");
#endif

  solve();

#ifdef PROFILE
  ProfilerStop();
#endif
}