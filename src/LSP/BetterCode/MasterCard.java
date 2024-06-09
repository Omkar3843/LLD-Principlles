package LSP.BetterCode;

public class MasterCard extends CreditCard implements IntlPayment{

    @Override
    public void tapAndPay() {
        System.out.println("Tap and pay impl of MasterCard");

    }

    @Override
    public void onlineTransfer() {
        System.out.println("online transfer impl MasterCard");
    }

    @Override
    public void swipeAndPay() {
        System.out.println("swipe impl of MasterCard");
    }

    @Override
    public void mandatePayments() {
        System.out.println("mandate impl of MasterCard");
    }


    @Override
    public void intlPayment() {

    }
}
