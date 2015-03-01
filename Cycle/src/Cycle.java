public class Cycle
{
	private int numberOfWheel, weight;
	public Cycle(int numberOfWheel, int weight)
	{
		this.numberOfWheel=numberOfWheel;
		this.weight=weight;	
		System.out.println("number of wheel(s)="+this.numberOfWheel+
				" weight="+this.weight);
	}
	public Cycle()
	{
		this(100, 1000);
	}
	public String ToString()
	{
		return "Inside the ToString method we have: the number of wheels are \n"
				+this.numberOfWheel+" and the weight is "+this.weight;
	}
}