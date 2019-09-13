interface Operation
{
  void undo(Account account);
}

class WithdrawOperation implements Operation
{
  double amount; 
  
  public WithdrawOperation(double amount){
    this.amount = amount;
  }  
  public void undo(Account account){
    account.deposit(amount)
  }
}
class DepositOperation implements Operation
{
   double amount; 
  
  public DepositOperation(double amount){
    this.amount = amount;
  }  
  public void undo(Account account){
    account.withdraw(amount)
  }
}
