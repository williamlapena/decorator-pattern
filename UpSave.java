class UpSave extends SavingsAccount {
    private SavingsAccount savingsAccount;

    public UpSave(SavingsAccount savingsAccount) {
        this.setAccountNumber(savingsAccount.getAccountNumber()); 
        this.setAccountName(savingsAccount.getAccountName());
        this.setBalance(savingsAccount.getBalance()); 
    }

    @Override
    public String showAccountType() {
        return "UpSave";
    }

    @Override
    public double getInterestRate() {
        return 0.04; // 4% interest rate
    }

    @Override
    public String showBenefits() {
        return super.showBenefits() + ", With Insurance";
    }
}