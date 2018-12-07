package Methods;

public abstract class ScheduleHours_abstract {

	public static String [] Juan = {"0","0","0","0","0","0","0"};
	public static String [] Maria = {"0","0","0","0","0","0","0"};
	public static String [] Pedro = {"0","0","0","0","0","0","0"};
	
	public static int JuanSum = 0;
	public static int MariaSum = 0;
	public static int PedroSum = 0;
	
	public abstract int SumJuan();
	public abstract int SumMaria();
	public abstract int SumPedro();
}
