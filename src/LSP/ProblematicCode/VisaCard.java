package LSP.ProblematicCode;

import LSP.ProblematicCode.CreditCard;

public class VisaCard extends CreditCard {
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
    public void upiPayment() {

    }

    @Override
    public void intlPayment() {

    }
}
