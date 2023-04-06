package practice;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Practice10 {
    public static void main(String[] args) {
        /* 10-2 */
        String pattern = "yyyy/MM/dd";
        DateFormat dateFormat = new SimpleDateFormat(pattern);
        Scanner scanner = new Scanner(System.in);
        System.out.println("날짜를 " + pattern + "의 형태로 입력해주세요.(ex. 2023/03/23)");
        while (scanner.hasNextLine()) {
            try {
                Date date = dateFormat.parse(scanner.nextLine());
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("입력하신 날짜는 E요일 입니다.");
                System.out.println(simpleDateFormat.format(date));
                break;
            } catch (Exception e) {
                System.out.println("입력된 날짜의 형식이 잘못되었습니다. " + pattern + "의 형태로 다시 입력해주세요.(ex. 2023/03/23)");
            }
        }

        /* 10-4 */
        Calendar birthday = Calendar.getInstance();
        birthday.set(2000, Calendar.NOVEMBER, 14);

        Calendar today = Calendar.getInstance();

        long days = (today.getTimeInMillis() - birthday.getTimeInMillis()) / (24 * 60 * 60 * 1000);
        System.out.println(days + " days");
    }
}
