
public class Interest {
	
	double principle;//	initial principal balance
	double rate;//interest rate
	double time;//time period
	double n;//number of times interest applied per time period
	
	public double SI(double p,double r,double t) {
		principle=p;
		rate=r;
		time=t;
		return (principle*rate*time)/100;
		
	}
	public double CI(double p,double r,double n,double t) {
		principle=p;
		rate=r;
		time=t;
		return  principle*(Math.pow((1 + rate / n), time));
	}

	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Interest I=new Interest();
		
	
		
		System.out.println("Simple Interest:"+I.SI(10,3,1));
		
		System.out.println("Compund Interest:"+ I.CI(1000,3,2,2));
		
	
		

	}

}
