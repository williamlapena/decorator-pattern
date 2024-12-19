class GSave extends SavingsAccount {
    private SavingsAccount savingsAccount;

    public GSave(SavingsAccount savingsAccount) {
        this.setAccountNumber(savingsAccount.getAccountNumber()); 
        this.setAccountName(savingsAccount.getAccountName());
        this.setBalance(savingsAccount.getBalance()); 
    }

    @Override
    public String showAccountType() {
        return "GSave";
    }

    @Override
    public double getInterestRate() {
        return 0.025; // 2.5% interest rate
    }

    @Override
    public String showBenefits() {
        return super.showBenefits() + ", GCash Transfer";
    }
}