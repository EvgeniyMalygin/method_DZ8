import java.time.LocalDate;

public class Main {

    public static boolean checkLeapYear(int year){
        if (year % 100 == 0 && year % 400 == 0)
        {
            return true;
        } else
        {
            if (year % 4 == 0 && year % 100 !=0)
            {
                return true;
            }else
            {
                return false;
            }
        }
    }
    public static String versionProgramm (int clientOS, int clientDeviceYear){
        int currentYear = LocalDate.now().getYear();
        if (clientDeviceYear < currentYear && clientOS == 0)
        {
            return "Установите облегчённую версию приложения для iOS по ссылке";
        }
        if (clientDeviceYear < currentYear && clientOS == 1)
        {
            return  "Установите облегчённую версию приложения для Android по ссылке";
        }
        if (clientOS == 0 && clientDeviceYear >= currentYear)
        {
            return "Установите версию приложения для iOS по ссылке";
        }
        if (clientOS == 1 && clientDeviceYear >= currentYear)
        {
            return "Установите версию приложения для Android по ссылке";
        }
        return "Ошибочные данные";
    }
    public static void main(String[] args) {
        // Задание 1
        System.out.println("========== Задание 1 ==========");
        int year = 2022;
        if (checkLeapYear(year)){
            System.out.println(year + " год високосный");
        }else
        {
            System.out.println(year + " год невисокосный");
        }
        // Задание 2
        System.out.println("========== Задание 2 ==========");
        int clientOS = 1;
        int clientDeviceYear = 2022;
        System.out.println(versionProgramm(clientOS, clientDeviceYear));
    }
}