package h_w_Lesson_21;

import java.util.Random;
import java.util.Scanner;

public class ATM {
    private final int DEPOSIT_LIMIT = 10000;
    private int balance = 10000;
    Random random = new Random();

    public synchronized void get() {
        Scanner scanner = new Scanner(System.in);
        int CREDIT_LIMIT = 10000;
        int get = random.nextInt(CREDIT_LIMIT + 1);
        if (balance >= get) {
            balance -= get;

            System.out.println(Thread.currentThread().getName() +" снятие "+ get + " баланс:"+ balance);
        } else {

            System.out.println(Thread.currentThread().getName() +" пытался получить "+ get);
            System.out.println("Введи сумму пополнения :");

            int add = scanner.nextInt();
            while (1 > add || add > DEPOSIT_LIMIT) {
                System.out.println("Error input, попробуйте еще раз");
                add = scanner.nextInt();
            }
            balance += add;
            System.out.println(Thread.currentThread().getName() +" пополнение "+ add +" баланс:"+ balance);
        }
    }

    public synchronized void add() {
        int add = random.nextInt(DEPOSIT_LIMIT + 1);
        balance += add;

        System.out.println(Thread.currentThread().getName() +" пополнение "+ add +" баланс:"+ balance);
    }

    public static class User1 extends Thread{
        ATM atm;
        public User1(ATM atm){
            this.atm = atm;
        }
        @Override
        public void run(){
            for (int i = 0; i < 10; i++){
                if (Math.random() > 0.4){
                    atm.get();
                } else {
                    atm.add();
                }
            }
        }
    }

    public static class User2 extends Thread{
        ATM atm;
        public User2(ATM atm){
            this.atm = atm;
        }
        @Override
        public void run(){
            for (int i = 0; i < 10; i++){
                if (Math.random() > 0.4){
                    atm.get();
                } else {
                    atm.add();
                }
            }
        }
    }


}
