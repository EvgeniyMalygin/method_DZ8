import java.time.LocalDate;


public class Main {

    public static boolean checkLeapYear(int year){
        if ((year % 100 == 0 && year % 400 == 0) || (year % 4 == 0 && year % 100 !=0))
        {
            return true;
        } else
        {
                return false;
        }
    }

    public static String versionProgram (int clientOS, int clientDeviceYear){
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
    public static int dayForDelivery (int dist) {
        int quantityDayForDelivery = 1;
        if (dist <= 20)
        {
            return quantityDayForDelivery;
        } else
        {
            if (20 < dist && dist < 60) {
                return quantityDayForDelivery + 1;
            }
        }
        return quantityDayForDelivery + 2;
    }
    public static void reverseMass (int [] arr){
        int temp = 0;
        for (int i = 0; i < arr.length / 2; i++){
            temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }
    public static void printMass (int [] printMas){
        for (int i: printMas)
        {
            System.out.print(i + " ");
        }
        System.out.println();
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
        int clientOS = 0; // версия ОС на клиентском смартфоне (0 - iOS, 1- Android)
        int clientDeviceYear = 2015; // год выпуска смартфона клиента
        System.out.println(versionProgram(clientOS, clientDeviceYear));

        // Задание 3
        System.out.println("========== Задание 3 ==========");
        int deliveryDistance = 95;
            System.out.println("Потребуется дней: " + dayForDelivery(deliveryDistance));

        // Задание 4
        System.out.println("========== Задание 4 ==========");
        int[] arr = {3, 2, 1, 6, 5};
        System.out.print("Исходный массив: ");
        printMass(arr);
        reverseMass(arr);
        System.out.print("Полученный массив: ");
        printMass(arr);
    }
}