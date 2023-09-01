public class BankAccount {
    double checkingBalance;
    double savingsBalance;

    private static int accountsCreated = 0;
    private static double totalAmount = 0.0;

    public BankAccount(double initialCheckingBal, double initialSavingsBal){
        this.checkingBalance = initialCheckingBal;
        this.savingsBalance = initialSavingsBal;
        accountsCreated++;
        totalAmount += (initialCheckingBal + initialSavingsBal);
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public void deposit(double amount, String account){
        if (account.equalsIgnoreCase("checking")) {
            checkingBalance += amount;
        } else if (account.equalsIgnoreCase("saving")){
            savingsBalance += amount;
        }
        totalAmount += amount;
    }

}
