
import java.util.Map;
public class AtmOperationImpl implements AtmOperationInterf {
    ATM atm = new ATM();
    //Map<Double,String> ministmt=new HashMap<>();
    @Override
    public void viewBalance() {
        // TODO Auto-generated method stub
        System.out.println("Available Balance is : "+atm.getBalance());
    }

    @Override
    public void withdrawAmount(double withdrawAmount) {
        // TODO Auto-generated method stub
        if(withdrawAmount<=atm.getBalance()){
            //ministmt.put(withdrawAmount," Amount Withdrawn");
            System.out.println("Collect the Chash : "+withdrawAmount);
            atm.setBalance(atm.getBalance()-withdrawAmount);
            viewBalance();
        }
        else{
            System.out.println("Insufficient Balance");
        }
        
    }

    @Override
    public void depositeAmount(double depositeAmount) {
        // TODO Auto-generated method stub
        //ministmt.put(depositeAmount," Amount dDeposited");
        System.out.println(depositeAmount+" Deposited Successfully !!");
        atm.setBalance(atm.getBalance()+ depositeAmount);
        viewBalance();
    }

    @Override
    public void viewMiniStatement() {
        // TODO Auto-generated method stub
        // for(Map.Entry<Double,String> m : ministmt.entrySet()){
        //     System.out.println(m.getKey()+""+m.getKey());
        // }
    }
    
}
