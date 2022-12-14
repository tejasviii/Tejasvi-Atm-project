public class ATM {
    private double balance;
    private double depositeAmount;
    private double withDrawAmount;

    public ATM(){

    }

    //gettters
    public double getBalance(){
        return this.balance;
    }
    public double getDepositeAmount(){
        return this.depositeAmount;
    }
    public double getWithdrawAmount(){
        return this.withDrawAmount;
    }

    //setters
    public void setBalance(double newBalance){
        this.balance = newBalance;
    }
    public void setDepositeAmount(double newDeposite){
        this.balance = newDeposite;
    }
    public void setwithdrawAmount(double newWithdraw){
        this.balance = newWithdraw;
    }
}
