package practice;

public class BankAccount {
    protected double amountBankAccount;

    public double getAmount() {
        return amountBankAccount;
    }

    public void put(double amountToPut) {
        if (amountToPut >= 0) {
            amountBankAccount += amountToPut;
        }
    }

    public void take(double amountToTake) {
        if (amountToTake <= amountBankAccount) {
            amountBankAccount -= amountToTake;
        }
    }
}
