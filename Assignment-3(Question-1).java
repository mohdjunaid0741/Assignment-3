class Account{
    int id, amount, interestrate;

    public Account(int id, int amount, int interestrate) {
        this.amount = amount;
        this.id = id;
        this.interestrate = interestrate;
    }
}

class Current_Account extends Account{

    public Current_Account(int id, int amount, int interestrate, int withdraw_Amount, int deposite_Amount, int Balance) {
        super(id, amount, interestrate);
        this.Balance = Balance;
        this.deposite_Amount = deposite_Amount;
        this.withdraw_Amount = withdraw_Amount;
    }
    int Balance, deposite_Amount, withdraw_Amount;

    public void setWithdraw_Amount(int withdraw_Amount) {
        this.withdraw_Amount = withdraw_Amount;
    }
    public int getWithdraw_Amount() {
        return withdraw_Amount;
    }

    public int getDeposite_Amount() {
        return deposite_Amount;
    }

    public void setDeposite_Amount(int deposite_Amount) {
        this.deposite_Amount = deposite_Amount;
    }

    public int getBalance() {
        return Balance;
    }

    public void setBalance(int balance) {
        Balance = balance;
    }
}


class Saving_Account extends Account{

    public Saving_Account(int id, int amount, int interestrate, int Balance, int deposite_Amount, int withdraw_Amount) {
        super(id, amount, interestrate);
        this.Balance = Balance;
        this.deposite_Amount = deposite_Amount;
        this.withdraw_Amount = withdraw_Amount;
    }
    int Balance, deposite_Amount, withdraw_Amount;
     
    public void setWithdraw_Amount(int withdraw_Amount) {
        this.withdraw_Amount = withdraw_Amount;
    }
    public int getWithdraw_Amount() {
        return withdraw_Amount;
    }

    public int getDeposite_Amount() {
        return deposite_Amount;
    }

    public void setDeposite_Amount(int deposite_Amount) {
        this.deposite_Amount = deposite_Amount;
    }

    public int getBalance() {
        return Balance;
    }

    public void setBalance(int balance) {
        Balance = balance;
    }
}

public class Question_1{
    public static void main(String...args) {
     Current_Account ca = new Current_Account(5,10000,2,500,600,5000);
        System.out.println("Id of Account is:" + ca.id);
        System.out.println("Amount in Account is:" + ca.amount);
        System.out.println("Interest of Account is:" + ca.interestrate);
        System.out.println();
        System.out.println("Balance in Current Account is:" + ca.Balance);
        System.out.println("Deposited amount of Current Acccount is:" + ca.deposite_Amount);
        System.out.println("Withdraw amount of Current Acccount is:" +ca.withdraw_Amount);
        
        
        Saving_Account sa = new Saving_Account(5,20000,2,30000,1000,2000);
        System.out.println();
        System.out.println("Id of Account is: " + sa.id);
        System.out.println("Balance of Account is: " + sa.Balance);
        System.out.println("Interest of Account is: " + sa.interestrate);
        System.out.println();
        System.out.println("Amount in Current Account is:" + sa.amount);
        System.out.println("Deposited amount of Current Account is:" +sa.deposite_Amount);
        System.out.println("Withdraw amount of Current Account is:" +sa.withdraw_Amount);
       
    }
}
