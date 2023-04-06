public class Ex4_19 {
    public static void main(String[] args) {
        Loop1 : for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if (j == 5) {
                    /* case 1. 4까지만 곱해진 2단 */
                    //break Loop1;

                    /* case 2. 4까지만 곱해진 구구단 */
                    //break;

                    /* case 3. case 2와 값은 같지만 구구단 사이에 엔터 생략 */
                    //continue Loop1;

                    /* case 4. 온전한 구구단 */
                    continue;
                }
                System.out.println(i + "*" + j + "=" + i*j);
            }
            System.out.println(); //엔터
        }
    }
}
