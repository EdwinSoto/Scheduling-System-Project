package Methods;

public class PayChart_Data {

	Tracker a = new Tracker();
	double Balance = 0;
	int T = 0;
	
	public double Balance(double hours )
	{
		int totalMinutes = 40 * 60;
		
		Balance = (hours  * 7.25);
		
		if (hours < 40) {
			
			double minutesOfWork = (hours  * 60);
			
			for(double i = minutesOfWork; i < 2400; i+=10) {
				
				Balance = Balance - 0.50;
			}
			if( Balance <= 0) {
				Balance = 0;
			}
		}
		return Balance;
	}
	
	public double Balance(double Balance, double contribution)
	{
		contribution = (Balance * contribution);
		double total = Balance - contribution;
		if(total <= 0) {
			total = 0;
		}
		return total;
	}
}
