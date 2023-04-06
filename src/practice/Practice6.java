package practice;

class Student {
    String name; //학생 이름
    int no, kor, eng, math; //번호, 국어 영어 수학점수
    static int ban = 1; //반

    int getTotal() {
        return kor + eng + math;
    }
    float getAverage() {
        return Math.round((getTotal() / 3f) * 10) / 10f;
    }
}

public class Practice6 {
    static double getDistance(int x, int y, int x1, int y1) {
        double a = (x - x1) * (x - x1) + (y - y1) * (y - y1);
        return Math.sqrt(a);
    }

    static boolean isNumber(String str) {
        for (int i = 0; i < str.length(); i++) {
            //문자열이 비어있거나 null 값일 때 + 지정된 문자가 숫자 0-9가 아닐 때(Character 클래스의 isDigit 메서드 사용)
            if (str.equals("") || str == null || !Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        /* 6-3 */
        Student s = new Student();
        s.name = "홍길동";
        s.no = 1;
        s.kor = 76;
        s.eng = 60;
        s.math = 100;

        System.out.println("이름 : " + s.name);
        System.out.println("총점 : " + s.getTotal());
        System.out.println("평균 : " + s.getAverage());

        /* 6-4 */
        System.out.println(getDistance(1, 1, 2, 2));

        /* 6-18 */
        String str = "123";
        System.out.println(str + "는 숫자입니까? " + isNumber(str));

        str = "1234o";
        System.out.println(str + "는 숫자입니까? " + isNumber(str));
    }
}
