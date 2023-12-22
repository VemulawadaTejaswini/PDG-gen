import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] values = line.split(" ");
        int n = Integer.parseInt(values[0]);
        int m = Integer.parseInt(values[1]);
        String ret = "0";
        if (n == 1) {
            boolean k = false;
            for (int i = 0; i < m; i++) {
                line = scanner.nextLine();
                values = line.split(" ");
                if (!k) {
                    ret = values[1];
                    k = true;
                } else {
                    if (!values[1].equals(ret)) {
                        ret = "-1";
                        break;
                    }
                }
            }
            if (!k) {
                ret = "0";
            }
        } else if (n == 2) {
            int f = 0,s = 0;
            boolean fb = false,sb = false;
            boolean br = false;
            for (int i = 0; i < m; i++) {
                line = scanner.nextLine();
                values = line.split(" ");
                int si = Integer.parseInt(values[0]);
                int ci = Integer.parseInt(values[1]);
                if (si == 1) {
                    if (ci == 0) {
                        ret = "-1";
                        br = true;
                        break;
                    }
                    if (!fb) {
                        f = ci;
                        fb = true;
                    } else {
                        if (ci != f) {
                            ret = "-1";
                            br = true;
                            break;
                        }
                    }
                } else if (si == 2) {
                    if (!sb) {
                        s = ci;
                        sb = true;
                    } else {
                        if (s != ci) {
                            ret = "-1";
                            br = true;
                            break;
                        }
                    }
                }
            }
            if (!br) {
                ret = "" + f + "" + s;
            }
        } else if (n == 3) {
            int f = 0,s = 0,t = 0;
            boolean fb =false,sb = false,tb = false;
            boolean br = false;
            for (int i = 0; i < m; i++) {
                line = scanner.nextLine();
                values = line.split(" ");
                int si = Integer.parseInt(values[0]);
                int ci = Integer.parseInt(values[1]);
                if (si == 1) {
                    if (ci == 0) {
                        ret = "-1";
                        br = true;
                        break;
                    }
                    if (!fb) {
                        f = ci;
                        fb = true;
                    } else {
                        if (ci != f) {
                            ret = "-1";
                            br = true;
                            break;
                        }
                    }
                } else if (si == 2) {
                    if (ci == 0) {
                        ret = "-1";
                        br = true;
                        break;
                    }
                    if (!sb) {
                        s = ci;
                        sb = true;
                    } else {
                        if (s != ci) {
                            ret = "-1";
                            br = true;
                            break;
                        }
                    }
                } else if (si == 3) {
                    if (!tb) {
                        t = ci;
                        tb = true;
                    } else {
                        if (t != ci) {
                            ret = "-1";
                            br = true;
                            break;
                        }
                    }
                }
            }
            if (!br) {
                ret = "" + f + "" + s + "" + t;
            }
        }
        System.out.println(ret);
    }
}