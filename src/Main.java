import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        //task1 ();
        //task2 ();
        task3 ();

    }

    // 1
    public static void task1() {

        int year = 1996;
        checkLeapYear(year);
    }

    public static void checkLeapYear(int year) {
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println(year + " год - високосный год");
        } else {
            System.out.println(year + " год - невисокосный год");
        }
    }

    // 2
    public static void task2() {

        int clientDeviceYear = 2015;
        int currentYear = LocalDate.now().getYear();
        int osType = 0;

        checkAppVersion(osType, clientDeviceYear, currentYear);
    }

    public static void checkAppVersion(int osType, int clientDeviceYear, int currentYear) {
        String appVersion = "";

        if (clientDeviceYear < currentYear) {
            appVersion = "облегченную версию";
        } else {
            appVersion = "обычную версию";
        }

        if (osType == 0) {
            System.out.println("Установите " + appVersion + " приложения для iOS по ссылке");
        } else if (osType == 1) {
            System.out.println("Установите " + appVersion + " приложения для Android по ссылке");
        }
    }

    // 3
    public static void task3() {
        int deliveryDistance = 77;
        int deliveryTime = deliveryDaysCalculator(deliveryDistance);
        System.out.println("Потребуется дней: " + deliveryTime);
    }

    public static int deliveryDaysCalculator(int deliveryDistance) {
        int deliveryDays = 0;
        if (deliveryDistance < 20) {
            deliveryDays = 1;
        } else if (deliveryDistance < 60) {
            deliveryDays = 2;
        } else if (deliveryDistance < 100) {
            deliveryDays = 3;
        }
        return deliveryDays;
    }
}