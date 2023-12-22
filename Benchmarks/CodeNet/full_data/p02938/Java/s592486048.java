const MOD: usize = 1_000_000_007;

fn calc(l: usize, r: usize, shift: usize, x: usize, y: usize, s: usize, dp: &mut [[[[usize; 2]; 2]; 2]; 61]) -> usize {
    if shift == 0 {
        return if s == 1 {1} else {0};
    }
    if dp[shift][x][y][s] < MOD {
        return dp[shift][x][y][s];
    }
    let p = (l >> (shift - 1)) & 1;
    let q = (r >> (shift - 1)) & 1;
    let mut ans = 0;
    //00
    if x == 1 || p == 0 {
        ans += calc(l, r, shift - 1, x, y | q, s, dp);
    }
    //01
    if (x == 1 || p == 0) && (y == 1 || q == 1) && s == 1 {
        ans += calc(l, r, shift - 1, x, y, 1, dp);
    }
    //11
    if y == 1 || q == 1 {
        ans += calc(l, r, shift - 1, x | (p == 0) as usize, y, 1, dp);
    }
    ans %= MOD;
    dp[shift][x][y][s] = ans;
    ans
}

fn run() {
    let mut s = String::new();
    std::io::stdin().read_line(&mut s).unwrap();
    let mut it = s.trim().split_whitespace();
    let l: usize = it.next().unwrap().parse().unwrap();
    let r: usize = it.next().unwrap().parse().unwrap();
    let mut dp = [[[[MOD; 2]; 2]; 2]; 61];
    let ans = calc(l, r, 60, 0, 0, 0, &mut dp);
    println!("{}", ans);
}

fn main() {
    run();
}
