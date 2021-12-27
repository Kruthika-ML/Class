public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    public void deposit(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("Deposit of " +depositAmount+ " made. New balance is " +this.balance);
    }

    public void withdrawal(double withdrawalAmount) {
        if(this.balance - withdrawalAmount < 0) {
            System.out.println("Only" + this.balance + "available");
        } else {
            this.balance -= withdrawalAmount;
            System.out.println("withdrawal of "+withdrawalAmount + "processed. Remaining balance = " +this.balance);

        }
    }
}
