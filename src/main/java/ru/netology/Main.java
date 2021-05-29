package ru.netology;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Randoms randoms = new Randoms(90, 100);
        System.out.println("start");
        for (int someRandomInt : randoms) {
            System.out.println("случайное число: " + someRandomInt);
            Thread.sleep(500);
            if (someRandomInt == 100) {
                System.out.println("Выпало число 100, давайте на этом закончим");
                break;
            }
        }
    }
}
