import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Admin admin = new Admin();
        int age;
        String lastName, firstName, numCard;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your data:");
        System.out.println("Enter your age:");
        age = scanner.nextInt();
        System.out.println("Enter your firstname:");
        firstName = scanner.next();
        System.out.println("Enter your lastname:");
        lastName = scanner.next();
        System.out.println("Enter your number of card:");
        numCard = scanner.next();

        BankCard card = new BankCard(age,firstName,lastName, 500000, numCard);

        System.out.println("Welcome to simulate of bank structure.");
        do{
            System.out.println("1. Press 1 to pay anything");
            System.out.println("2. Press 2 to send money");
            System.out.println("3. Press 3 to block card");
            System.out.println("4. Press 4 to null account");
            System.out.println("5. Press 5 to return info about account");
            System.out.println("*info: if you want stop this simulate - block card, or pay of 20000");
            int flags = scanner.nextInt();
            switch (flags) {
                case 1:{
                    System.out.println();
                    System.out.println("Enter price of product: ");
                    int price = scanner.nextInt();
                    System.out.println("Enter name of product");
                    String name = scanner.next();
                    Order order = new Order(price, name);

                    card.pay();
                    break;
                }
                case 2:{
                    System.out.println();
                    System.out.println("Enter your data of other account:");
                    System.out.println("Enter his age:");
                    age = scanner.nextInt();
                    System.out.println("Enter his firstname:");
                    firstName = scanner.next();
                    System.out.println("Enter his lastname:");
                    lastName = scanner.next();
                    System.out.println("Enter his number of card:");
                    numCard = scanner.next();

                    OtherAccount otherAccount = new OtherAccount(age,firstName,lastName,398000,numCard);
                    System.out.println("How match money you want to send? enter please:");
                    age = scanner.nextInt();
                    card.sendMoney(numCard,age);
                    break;
                }
                case 3:{
                    card.blockCard();
                    break;
                }
                case 4:{
                    card.nullAccount();
                    break;
                }
                case 5:{
                    card.returnAccount();
                    break;
                }
            }
        }while (admin.blocker() && BankCard.statusCard.equals("nonBlocked"));
    }
}
