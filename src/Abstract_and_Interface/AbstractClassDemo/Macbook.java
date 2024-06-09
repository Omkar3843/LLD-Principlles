package Abstract_and_Interface.AbstractClassDemo;

public class Macbook extends product{
    @Override
    public double calDiscount() {
        return 0;
    }

    @Override
    public void termsAndCondition(){
        System.out.println("Terms of Macbook");
    }
}
