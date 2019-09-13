package problem3;
interface Connection
{
	void Open();
	void Close();
}
interface Command
{
	void exe();
}
interface Transaction
{
	void Begin();
	void Commit();
}
interface Factory
{
	 Connection getCon();
	 Command getCmd();
	 Transaction getTran();
}
class SqlFactory implements Factory
{
	public Connection getCon(){
		return new SqlConnection();
	}
	public Command getCmd(){
		return new SqlCommand();
	}
	public Transaction getTran(){
		return new SqlTransaction();
	}
}
class OraFactory implemnts Factory
{
	public Connection getCon(){
		return new OraConnection();
	}
	public Command getCmd(){
		return new OraCommand();
	}
	public Transaction getTran(){
		return new OraTransaction();
	}
}
public class Entry {
	public static void do(Factory f)
	{
		Connection connection = f.getCon();
		connection.open("mydb;scott;tiger");
		Transaction transaction = f.getTran();
		transaction.begin(connection);
		
		Command cmd1 = f.getCmd();
		cmd1.execute(transaction, "insert into emp values(10,'jack',2500')");

		Command cmd2 = f.getCmd();
		cmd2.execute(transaction, "insert into emp values(20,'jill',4300')");
		
		transaction.commit();
		connection.close();
	}
	public static void main() {
		
		
	}
}
