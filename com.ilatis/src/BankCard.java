public class BankCard extends BankAccount{

    protected static String statusCard = "nonBlocked";

    public BankCard(int age, String firstName, String lastName,
                    int account, String numberOfCard) {
        super(age, firstName, lastName, account, numberOfCard);
    }
}
