public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //Первое задание
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (;i>0;i--){
            System.out.print(i + " ");
        }
        System.out.println();
        // Второе задание
        int firstFriday = 5;
        int dayInMonth = 31;
        for (int friday = firstFriday; friday <= dayInMonth; friday = friday + 7) {
            System.out.println("Сегодня пятница " + friday + "-ое число. Необходимо подготовить отчет.");
        }
    // третья задача
    int currentYear = 2022;
    int start = currentYear - 200;
    int end = currentYear + 100;
    int period = 79;
    int firstAppearedYear = 0;
    for (int year = start; year <= end; year++){
    if (year%period==firstAppearedYear){
        System.out.println(year);
    }
    }
}}






