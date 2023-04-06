package practice;

public class Practice4 {
    public static void main(String[] args) {
        /* 4-2 */
        int sum = 0;
        for (int i = 0; i <= 20; i++) {
            if (!(i % 2 == 0 || i % 3 == 0)) { sum += i; }
        }
        System.out.println(sum);

        /* 4-3 */
        int add = 0;
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j <= i; j++) { add += j; }
        }
        System.out.println(add);

        /* 4-4 */
        int total = 0;
        int i = 0;
        for ( ; ; i++) {
            if (i % 2 != 0) {
                total += i;
            } else {
                total -= i;
            }
            if (total >= 100) { break; }
        }
        System.out.println(i);

        /* 4-6 */
        for (int p = 1; p <= 6; p++) {
            for (int q = 1; q <= 6; q++) {
                if (p + q == 6) { System.out.println(p + " + " + q + " = " + "6"); }
            }
        }
    }
}
