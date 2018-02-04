public class Admin {
    protected static int blockPay = 20000;
    protected static boolean flag = true;
    public static boolean blocker(){
        if(Order.status.equals("notNormalPay")){
            BankCard.statusCard = "Blocked";
            System.out.println("Your card is blocked");
            flag = false;
        }
        return flag;
    }
}
