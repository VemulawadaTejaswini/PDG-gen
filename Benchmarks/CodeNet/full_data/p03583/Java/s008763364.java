import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    BufferedReader rd;

    Main() throws IOException {
        rd = new BufferedReader(new InputStreamReader(System.in));
        compute();
    }

    private void compute() throws IOException {
        int n = pint();
        int[] res = new Solver().solve(n);
        out(res[0]+" "+res[1]+" "+res[2]);
    }

    private int pint() throws IOException {
        return pint(rd.readLine());
    }

    private int pint(String s) {
        return Integer.parseInt(s);
    }

    class Solver {
        Map<Integer, int[]> m = create();

        public int[] solve(int n) {
            int[] res = m.get(n);
            if(res != null) {
                return res;
            }

            for (long a = 1; a <= 3500; a++) {
                for (long b = 1; b <= 3500; b++) {
                    long c = b;
                    long l = 4 * a * b * c;
                    long r = a * c + b * c + a * b;
                    if (l % r == 0) {
                        long w = l / r;
                        if(w == n) {
                            return new int[] { (int)a, (int)b, (int)c };
                        }
                    }
                }
            }
            return res;
        }
    }

    public Map<Integer, int[]> create() {
        Map<Integer, int[]> res = new HashMap<>();
        res.put(5, new int[] {2, 4, 20});
        res.put(13, new int[] {4, 18, 468});
        res.put(17, new int[] {5, 30, 510});
        res.put(25, new int[] {7, 60, 2100});
        res.put(29, new int[] {8, 80, 2320});
        res.put(37, new int[] {10, 130, 2405});
        res.put(41, new int[] {11, 164, 1804});
        res.put(53, new int[] {14, 280, 2120});
        res.put(61, new int[] {16, 366, 2928});
        res.put(65, new int[] {17, 442, 2210});
        res.put(73, new int[] {20, 292, 730});
        res.put(85, new int[] {22, 765, 3366});
        res.put(89, new int[] {24, 356, 2136});
        res.put(101, new int[] {26, 1313, 2626});
        res.put(97, new int[] {28, 194, 2716});
        res.put(109, new int[] {28, 1526, 3052});
        res.put(113, new int[] {30, 565, 3390});
        res.put(125, new int[] {32, 2375, 3040});
        res.put(131, new int[] {36, 524, 1179});
        res.put(137, new int[] {36, 1233, 1644});
        res.put(139, new int[] {36, 1668, 2502});
        res.put(145, new int[] {38, 1045, 3190});
        res.put(151, new int[] {40, 1208, 1510});
        res.put(163, new int[] {42, 2282, 3423});
        res.put(169, new int[] {44, 1690, 2860});
        res.put(173, new int[] {45, 1730, 3114});
        res.put(181, new int[] {48, 1086, 2896});
        res.put(185, new int[] {48, 2220, 2960});
        res.put(191, new int[] {52, 764, 2483});
        res.put(205, new int[] {54, 1845, 2214});
        res.put(221, new int[] {58, 2210, 2465});
        res.put(223, new int[] {60, 1115, 2676});
        res.put(229, new int[] {60, 2290, 2748});
        res.put(263, new int[] {70, 1841, 2630});
        res.put(265, new int[] {70, 2120, 2968});
        res.put(271, new int[] {72, 2168, 2439});
        res.put(305, new int[] {84, 1220, 2562});
        res.put(289, new int[] {85, 578, 2890});
        res.put(325, new int[] {88, 1560, 3300});
        res.put(377, new int[] {104, 1456, 3248});
        res.put(365, new int[] {105, 1022, 2190});
        res.put(425, new int[] {115, 2346, 3450});
        res.put(445, new int[] {124, 1780, 2759});
        res.put(481, new int[] {136, 1768, 2516});
        res.put(493, new int[] {136, 2436, 2856});
        res.put(485, new int[] {140, 1358, 2716});
        res.put(533, new int[] {150, 1950, 3075});
        res.put(545, new int[] {150, 2725, 3270});
        res.put(625, new int[] {175, 2500, 3500});
        res.put(629, new int[] {185, 1530, 3330});
        res.put(689, new int[] {195, 2756, 3180});
        res.put(635, new int[] {200, 1016, 3175});
        res.put(505, new int[] {202, 404, 2020});
        res.put(697, new int[] {204, 1938, 3116});
        res.put(685, new int[] {210, 1370, 2877});
        res.put(713, new int[] {210, 1860, 3220});
        res.put(695, new int[] {210, 1946, 2085});
        res.put(725, new int[] {210, 2436, 2900});
        res.put(565, new int[] {226, 452, 2260});
        res.put(755, new int[] {230, 1510, 3473});
        res.put(793, new int[] {234, 2196, 3172});
        res.put(785, new int[] {240, 1884, 2512});
        res.put(817, new int[] {240, 2280, 3440});
        res.put(845, new int[] {260, 1690, 3380});
        res.put(655, new int[] {262, 524, 2620});
        res.put(901, new int[] {272, 2332, 2992});
        res.put(745, new int[] {280, 1043, 1192});
        res.put(893, new int[] {280, 1880, 2660});
        res.put(925, new int[] {296, 2035, 2200});
        res.put(1025, new int[] {312, 2600, 3198});
        res.put(989, new int[] {322, 1634, 3059});
        res.put(1037, new int[] {325, 2210, 3050});
        res.put(815, new int[] {326, 652, 3260});
        res.put(895, new int[] {330, 1074, 1969});
        res.put(835, new int[] {334, 668, 3340});
        res.put(1105, new int[] {336, 3094, 3120});
        res.put(865, new int[] {346, 692, 3460});
        res.put(1073, new int[] {348, 2088, 2664});
        res.put(1121, new int[] {354, 2242, 3363});
        res.put(905, new int[] {362, 905, 1810});
        res.put(949, new int[] {364, 876, 3066});
        res.put(955, new int[] {382, 955, 1910});
        res.put(1177, new int[] {385, 2140, 2996});
        res.put(965, new int[] {386, 965, 1930});
        res.put(985, new int[] {394, 985, 1970});
        res.put(995, new int[] {398, 995, 1990});
        res.put(1189, new int[] {410, 1845, 2610});
        res.put(1157, new int[] {416, 1424, 2848});
        res.put(1205, new int[] {420, 1687, 2892});
        res.put(1055, new int[] {422, 1055, 2110});
        res.put(1349, new int[] {437, 2698, 3266});
        res.put(1241, new int[] {438, 1825, 2550});
        res.put(1285, new int[] {440, 2056, 2827});
        res.put(1261, new int[] {442, 1649, 3298});
        res.put(1115, new int[] {446, 1115, 2230});
        res.put(1325, new int[] {450, 2385, 2650});
        res.put(1135, new int[] {454, 1135, 2270});
        res.put(1313, new int[] {455, 2020, 2828});
        res.put(1145, new int[] {458, 1145, 2290});
        res.put(1081, new int[] {460, 940, 2162});
        res.put(1357, new int[] {460, 2300, 2950});
        res.put(1243, new int[] {462, 1356, 3164});
        res.put(1165, new int[] {466, 1165, 2330});
        res.put(1195, new int[] {478, 1195, 2390});
        res.put(1333, new int[] {480, 1720, 2976});
        res.put(1525, new int[] {500, 3172, 3250});
        res.put(1255, new int[] {502, 1255, 2510});
        res.put(1529, new int[] {506, 3058, 3197});
        res.put(1457, new int[] {517, 2046, 3102});
        res.put(1315, new int[] {526, 1315, 2630});
        res.put(1507, new int[] {528, 2192, 3288});
        res.put(1501, new int[] {532, 2212, 3002});
        res.put(1273, new int[] {536, 1474, 1672});
        res.put(1345, new int[] {538, 1345, 2690});
        res.put(1355, new int[] {542, 1355, 2710});
        res.put(1385, new int[] {554, 1385, 2770});
        res.put(1405, new int[] {562, 1405, 2810});
        res.put(1415, new int[] {566, 1415, 2830});
        res.put(1625, new int[] {572, 2750, 2860});
        res.put(1445, new int[] {578, 1445, 2890});
        res.put(1577, new int[] {581, 1992, 3192});
        res.put(1465, new int[] {586, 1465, 2930});
        res.put(1517, new int[] {592, 1640, 2960});
        res.put(1513, new int[] {595, 1780, 2492});
        res.put(1717, new int[] {606, 2929, 2958});
        res.put(1535, new int[] {614, 1535, 3070});
        res.put(1555, new int[] {622, 1555, 3110});
        res.put(1651, new int[] {624, 2032, 3048});
        res.put(1565, new int[] {626, 1565, 3130});
        res.put(1817, new int[] {632, 3002, 3496});
        res.put(1585, new int[] {634, 1585, 3170});
        res.put(1417, new int[] {650, 1090, 2725});
        res.put(1829, new int[] {650, 3068, 3100});
        res.put(1793, new int[] {660, 2445, 3260});
        res.put(1655, new int[] {662, 1655, 3310});
        res.put(1685, new int[] {674, 1685, 3370});
        res.put(1853, new int[] {680, 2616, 3270});
        res.put(1541, new int[] {690, 1541, 2010});
        res.put(1735, new int[] {694, 1735, 3470});
        res.put(1745, new int[] {698, 1745, 3490});
        res.put(1885, new int[] {715, 2552, 3016});
        res.put(1883, new int[] {728, 2152, 3497});
        res.put(1825, new int[] {730, 2050, 2993});
        res.put(1769, new int[] {732, 1914, 2684});
        res.put(1957, new int[] {760, 2472, 3090});
        res.put(2051, new int[] {770, 2930, 3223});
        res.put(1649, new int[] {776, 1496, 2134});
        res.put(1937, new int[] {780, 2235, 2980});
        res.put(1703, new int[] {786, 1482, 2489});
        res.put(1633, new int[] {805, 1420, 1988});
        res.put(2125, new int[] {828, 2875, 3060});
        res.put(2173, new int[] {850, 2650, 3485});
        res.put(1909, new int[] {874, 1577, 3154});
        res.put(2257, new int[] {880, 2960, 3355});
        res.put(1397, new int[] {889, 924, 1524});
        res.put(2225, new int[] {900, 2670, 3204});
        res.put(2299, new int[] {912, 2904, 3344});
        res.put(2123, new int[] {924, 2316, 2702});
        res.put(2021, new int[] {940, 1892, 2585});
        res.put(2363, new int[] {952, 2919, 3336});
        res.put(2501, new int[] {984, 3416, 3444});
        res.put(2117, new int[] {986, 2117, 2482});
        res.put(1661, new int[] {990, 1359, 1510});
        res.put(2465, new int[] {1010, 2929, 3434});
        res.put(1537, new int[] {1015, 1060, 1484});
        res.put(2159, new int[] {1016, 1768, 3302});
        res.put(1469, new int[] {1017, 1130, 1170});
        res.put(1921, new int[] {1017, 1582, 2142});
        res.put(2147, new int[] {1017, 1710, 3390});
        res.put(1963, new int[] {1040, 1510, 2416});
        res.put(2201, new int[] {1054, 2201, 2414});
        res.put(2527, new int[] {1083, 2888, 3192});
        res.put(1991, new int[] {1086, 1254, 3439});
        res.put(2171, new int[] {1092, 2004, 2338});
        res.put(2405, new int[] {1092, 2220, 3367});
        res.put(2449, new int[] {1106, 2370, 3255});
        res.put(1961, new int[] {1110, 1590, 1961});
        res.put(2033, new int[] {1140, 1284, 3210});
        res.put(2041, new int[] {1144, 1256, 3454});
        res.put(2573, new int[] {1178, 2573, 3154});
        res.put(2533, new int[] {1192, 2584, 2831});
        res.put(2665, new int[] {1230, 2665, 3198});
        res.put(2077, new int[] {1240, 1340, 2680});
        res.put(2327, new int[] {1253, 1638, 3222});
        res.put(2425, new int[] {1261, 1950, 2910});
        res.put(2597, new int[] {1274, 2548, 2756});
        res.put(2675, new int[] {1284, 2700, 2889});
        res.put(2507, new int[] {1288, 2289, 2616});
        res.put(2725, new int[] {1308, 2400, 3488});
        res.put(2773, new int[] {1316, 2632, 3304});
        res.put(2497, new int[] {1320, 1816, 3405});
        res.put(2567, new int[] {1359, 2416, 2448});
        res.put(2839, new int[] {1360, 2672, 3340});
        res.put(2645, new int[] {1380, 2116, 3174});
        res.put(2929, new int[] {1414, 3030, 3045});
        res.put(2369, new int[] {1442, 1648, 2576});
        res.put(2353, new int[] {1448, 1560, 2715});
        res.put(2537, new int[] {1462, 2006, 2537});
        res.put(2603, new int[] {1463, 1918, 3014});
        res.put(2329, new int[] {1507, 1644, 2244});
        res.put(2831, new int[] {1520, 2384, 2980});
        res.put(2413, new int[] {1524, 1596, 2667});
        res.put(2941, new int[] {1530, 2595, 3114});
        res.put(3145, new int[] {1530, 3145, 3330});
        res.put(2873, new int[] {1547, 2366, 3094});
        res.put(2993, new int[] {1558, 2774, 2993});
        res.put(2989, new int[] {1586, 2548, 3172});
        res.put(2945, new int[] {1596, 2356, 3255});
        res.put(2461, new int[] {1605, 1926, 2070});
        res.put(3059, new int[] {1610, 2660, 3220});
        res.put(3053, new int[] {1634, 2698, 3053});
        res.put(3151, new int[] {1644, 3014, 3036});
        res.put(2921, new int[] {1656, 2286, 3048});
        res.put(3173, new int[] {1670, 2839, 3230});
        res.put(2701, new int[] {1679, 1702, 3358});
        res.put(2783, new int[] {1694, 1886, 3157});
        res.put(2869, new int[] {1710, 2265, 2718});
        res.put(3317, new int[] {1712, 2996, 3472});
        res.put(2977, new int[] {1716, 2519, 2748});
        res.put(3157, new int[] {1722, 2706, 3157});
        res.put(3149, new int[] {1742, 2444, 3484});
        res.put(2825, new int[] {1800, 2034, 2712});
        res.put(2599, new int[] {1808, 1840, 2260});
        res.put(3565, new int[] {1860, 3404, 3441});
        res.put(3281, new int[] {1904, 2702, 3088});
        res.put(3445, new int[] {1960, 2968, 3185});
        res.put(3597, new int[] {1962, 3168, 3488});
        res.put(3233, new int[] {2014, 2318, 3233});
        res.put(3275, new int[] {2100, 2620, 2751});
        res.put(3247, new int[] {2101, 2618, 2674});
        res.put(3629, new int[] {2101, 3056, 3344});
        res.put(3097, new int[] {2128, 2282, 2608});
        res.put(3485, new int[] {2132, 2600, 3400});
        res.put(3546, new int[] {2142, 2758, 3349});
        res.put(3634, new int[] {2370, 2760, 3160});
        res.put(3950, new int[] {2370, 3300, 3476});
        res.put(3625, new int[] {2378, 2665, 3250});
        res.put(3383, new int[] {2388, 2587, 2652});
        res.put(3706, new int[] {2398, 2805, 3270});
        res.put(3751, new int[] {2420, 3025, 3100});
        res.put(3650, new int[] {2475, 2628, 3212});
        res.put(3621, new int[] {2485, 2840, 2856});
        res.put(4018, new int[] {2548, 3198, 3444});
        res.put(3842, new int[] {2550, 2825, 3390});
        res.put(3835, new int[] {2596, 2860, 3245});
        res.put(4081, new int[] {2597, 3234, 3498});
        res.put(3901, new int[] {2632, 2905, 3320});
        res.put(3773, new int[] {2695, 2744, 3080});
        res.put(4085, new int[] {2736, 3096, 3440});
        res.put(4134, new int[] {2756, 3180, 3445});
        res.put(4031, new int[] {2780, 2900, 3475});
        res.put(4221, new int[] {2814, 3276, 3484});
        res.put(4199, new int[] {2856, 3192, 3458});
        res.put(3982, new int[] {2896, 2992, 3077});
        res.put(4326, new int[] {3090, 3296, 3360});
        res.put(4329, new int[] {3108, 3276, 3367});
        res.put(4355, new int[] {3120, 3216, 3484});
        res.put(4370, new int[] {3128, 3230, 3496});
        return res;
    }

    private class Frac {
        final long a;
        final long b;

        public Frac(long a, long b) {
            long g = gcd(a,b);
            this.a = a / g;
            this.b = b / g;
        }

        public Frac add(Frac x) {
            return new Frac(x.a*b + a*x.b, b*x.b);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Frac frac = (Frac) o;

            if (a != frac.a) return false;
            return b == frac.b;
        }

        @Override
        public int hashCode() {
            int result = (int) (a ^ (a >>> 32));
            result = 31 * result + (int) (b ^ (b >>> 32));
            return result;
        }

        @Override
        public String toString() {
            return "" + a +
                    "/" + b +
                    "";
        }
    }

    public static long gcd(long a, long b) {
        while (b > 0) {
            long c = a % b;
            a = b;
            b = c;
        }
        return a;
    }

    private static void out(Object x) {
        System.out.println(x);
    }

    public static void main(String[] args) throws IOException {
        new Main();
    }
}
