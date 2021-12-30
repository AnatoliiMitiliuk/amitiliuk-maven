package h_w_Lesson_21;

public class WorkingATM {

    public static void main(String[] args) {
        ATM atm = new ATM();
        Thread user1 = new ATM.User1(atm);
        Thread user2 = new ATM.User2(atm);
        new Thread(user1).start();
        new Thread(user2).start();
    }
}
