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
    }
}