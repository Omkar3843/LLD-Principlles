package LSP.BetterCode;

public class VisaCard extends CreditCard implements IntlPayment {
    @Override
    public void tapAndPay() {
        System.out.println("Tap and pay impl of visa");

    }

    @Override
    public void onlineTransfer() {
        System.out.println("online transfer impl visa");
    }

    @Override
    public void swipeAndPay() {
        System.out.println("swipe impl of visa");
    }

    @Override
    public void mandatePayments() {
        System.out.println("mandat impl of visa");
    }



    @Override
    public void intlPayment() {

    }
}
