package training.day1;

import java.util.logging.Logger;

public class BankPractice {
    public static void main(String[] args) {
        Account account = new Account();

//        account.accountName = "ABC";
//        account.accountNumber = "12233";
//        account.accountType = "SAVING";
//        account.amount = 5000.0;
//        account.address = "test address";
//        account.phoneNumber = "9833389909";
//        account.socialSecurityNumber = "111111111";

        account.setAccountName("ABC");
        account.setAccountNumber("12233");
        account.setAccountType("SAVING");
        account.setAmount(5000.0);
        account.setAddress("test address");
        account.setPhoneNumber("9833389909");
        account.setSocialSecurityNumber("111111111");

//        int a = 5;
//        int b = 2;
//
//        int c = addTwoNumbers(b, a);
//            System.out.println(c);
//
//        int d = 8;
//        int e = 9;
//
//        int f = addTwoNumbers(e,d);
//        System.out.println(f);
//
//        int g = 10;
//        int h = 11;
//
//        int i = addTwoNumbers(h,g);
//        System.out.println(i);
//    }
//
//    public static int addTwoNumbers(int a, int b) {
//        int temp = a + b;
//        return temp;
//        Logger.getGlobal().info(String.valueOf(account.getAccountNumber()));
        System.out.println(account.getAccountName());
        System.out.println(account.getAccountNumber());
        System.out.println(account.getAccountType());
        System.out.println(account.getAmount());
        System.out.println(account.getAddress());
        System.out.println(account.getPhoneNumber());


    }
}