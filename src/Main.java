public class Main {
    public static void main(String[] args) {
        // Домашнее задание-1,2
        System.out.println("Домашнее задание 1,2");

        // Задание 1
        System.out.println("Задание 1");
        int age = 15;
        if (age >= 18) {
            System.out.println("Поздравляем тебя с совершеннолетием!");
        } else {
            System.out.println("Возраст совершеннолетия еще не наступил, нужно подождать");
        }

        // Задание 2
        System.out.println("Задание 2");
        int year = 30;
        if (year >=7 && year < 18) {
            System.out.println("Ребенок ходит в школу");
        } else if (year >= 18 && year < 24) {
            System.out.println("Человек закончил школу, может отправляться в университет");
        } else {
            System.out.println("Человек окончил университет и пора искать первую работу");
        }

        // Задание 3
        System.out.println("Задание 3");
        short carCapacityPeople = 118;


        if (carCapacityPeople < 60) {
            System.out.println("Есть свободные сидячие места");
        } else if (carCapacityPeople >= 60 && carCapacityPeople <=119){
            System.out.println("Свободных сидячих мест нет, но есть свободные стоячие места");
        } else {
            System.out.println("Вагон забит полностью. Свободных мест нет");
        }





    }
}