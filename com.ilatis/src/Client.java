import java.util.Scanner;

public class Client {
    private int age;
    private String firstName;
    private String lastName;
    private String payn;

    public Client(int age, String firstName, String lastName) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void pay(){
        if(Order.getCash()<=Admin.blockPay) {
            payn = firstName + " " + lastName + " pay for " + Order.getCash();
            BankAccount.account -= Order.getCash();
            System.out.println(payn);
        }
        else
        {
            Scanner scanner =  new Scanner(System.in);
            String flag;
            do {
                System.out.println("Are you sure, you wont to pay this? yes/no");
                flag = scanner.next();
            }while(!flag.equals("yes") && !flag.equals("no"));

            if(flag.equals("yes")) {
                payn = firstName + " " + lastName + " pay for" + Order.getCash();
                BankAccount.account -= Order.getCash();
                System.out.println(payn);
                Order.status = "notNormalPay";
                Admin.blocker();
            }
            else
                System.out.println("ok");
        }
    }

    public void sendMoney(String numOfCard, int money){
        if(OtherAccount.numberOfCard.equals(numOfCard)) {
            BankAccount.account -= money;
            OtherAccount.account += money;
            System.out.println("Paymant is succesfull");
        }
        else {
            System.out.println("Paymant is not succesfull");
        }

    }

    public void blockCard(){
        BankCard.statusCard = "Blocked";
        System.out.println("Your card is blocked");
    }

    public void nullAccount(){
        BankAccount.account *= 0;
    }

    public void returnAccount(){
        if(BankCard.statusCard.equals("nonBlocked"))
            System.out.println(BankAccount.account);
        else
            System.out.println("Sorry, your card is blocked");
    }

}
