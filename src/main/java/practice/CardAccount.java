package practice;

public class CardAccount extends BankAccount {
    @Override
    public double getAmount() {
        return super.getAmount();
    }

    @Override
    public void put(double amountToPut) {
        super.put(amountToPut);
    }

    @Override
    public void take(double amountToTake) {
        super.take(amountToTake + (amountToTake * 0.01));
    }
}
