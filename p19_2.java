class StateTax {
	public double getKst(double amount){
		return amount * 0.05;
	}
}
class CentralTax {
	public double getGst(double amount){
		return (amount- 5000) * 0.3;
	}
  public double getCst(double amount){
		return amount * 0.025 + 500;
	}
}
class Tax
{ 
     private FO taxType;
	
     public FO getTaxType() {
		   return taxType;
     }
     public void setTaxType(FO taxType) {
		    this.taxType = taxType;
     }
     public double compute( double amount)
	      return taxType(amount);
      }
}
class Program
{
	public static void Main()
	{
		Tax t = new Tax();
		t.setTaxType((amount)->{
      CentralTax obj = new CentralTax();
      return obj.getCst(amount);
    });
		
		double result = t.compute(3445.56);
		print(result);
	}
}
