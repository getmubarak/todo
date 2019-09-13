class AccountService
{
  Stack<FO> stack = new Stack<FO>();
  Account acc = new Account();
  
  public void withdraw(double amount){
    acc.withdraw(amount);
    stack.push(()-> acc.deposit(amount));
  }
  public void deposit(double amount){
    acc.deposit(amount);
    Operation op = new DepositOperation(amount);
    stack.push(()-> acc.withdraw(amount));
  }
  public void undo(){
    FO f = stack.pop();
    f();
  }
}
