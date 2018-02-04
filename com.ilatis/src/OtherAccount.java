public class OtherAccount extends Client {

    protected static int account;
    protected static String numberOfCard;
    public OtherAccount(int age, String firstName, String lastName,
                        int account, String numberOfCard) {
        super(age, firstName, lastName);
        this.account = account;
        this.numberOfCard = numberOfCard;
    }
}
