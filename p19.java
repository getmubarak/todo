interface TaxType
{
	double compute(double amount);
}
class Kst implements TaxType{
	public double compute(double amount){
		return amount * 0.05;
	}
}
class Gst implements TaxType{
	public double compute(double amount){
		return amount * 0.025 + 500;
	}
}
class Cst implements TaxType{
	public double compute(double amount){
		return (amount- 5000) * 0.3;
	}
}
class Tax
{ 
     private TaxType taxType;
	
     public TaxType getTaxType() {
		return taxType;
     }
     public void setTaxType(TaxType taxType) {
		this.taxType = taxType;
     }
     public double compute( double amount)
	      return taxType.compute(amount);
      }
}
class Program
{
	public static void Main()
	{
		Tax t = new Tax();
		t.setTaxType(new Cst());
		
		double result = t.compute(3445.56);
		print(result);
	}
}
