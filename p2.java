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

class AccountService
{
  Stack<Operation> stack = new Stack<Operation>();
  Account acc = new Account();
  
  public void withdraw(double amount){
    acc.withdraw(amount);
    Operation op = new WithdrawOperation(amount);
    stack.push(op);
  }
  public void deposit(double amount){
    acc.deposit(amount);
    Operation op = new DepositOperation(amount);
    stack.push(op)
  }
  public void undo(){
    Operation op = stack.pop();
    op.undo(acc);
  }
}
