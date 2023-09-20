import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int cnt = 0;

        while (n > 0 || m > 0) {
            if (n > 0) {
                cnt++;
                n--;
            } else {
                break;
            }
            if (m > 0) {
                cnt++;
                m--;
            } else {
                break;
            }
            if (n > 0 && m > 0) {
                cnt++;
                n--;
                m--;
            } else {
                break;
            }
        }
        String[] ans = { "Ram", "Shyam", "Rahul" };
        System.out.println(ans[cnt % 3]);
    }
}
