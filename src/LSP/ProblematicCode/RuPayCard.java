package LSP.ProblematicCode;

import LSP.ProblematicCode.CreditCard;

public class RuPayCard extends CreditCard {

    @Override
    public void tapAndPay() {
        System.out.println("Tap and pay impl of RuPayCard");

    }

    @Override
    public void onlineTransfer() {
        System.out.println("online transfer impl RuPayCard");
    }

    @Override
    public void swipeAndPay() {
        System.out.println("swipe impl of RuPayCard");
    }

    @Override
    public void mandatePayments() {
        System.out.println("mandate impl of RuPayCard");
    }

    @Override
    public void upiPayment() {

    }

    @Override
    public void intlPayment() {

    }

    public void Upi(){
        System.out.println("upi impl of rupay");
    }

}
