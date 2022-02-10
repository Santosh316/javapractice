package training.day1;

public class BankPractice {
    public static void main(String[] args) {

        int a = 5;
        int b = 2;

        int c = addTwoNumbers(b, a);
            System.out.println(c);

        int d = 8;
        int e = 9;

        int f = addTwoNumbers(e,d);
        System.out.println(f);

        int g = 10;
        int h = 11;

        int i = addTwoNumbers(h,g);
        System.out.println(i);
    }

    public static int addTwoNumbers(int a, int b) {
        int temp = a + b;
        return temp;
    }
}