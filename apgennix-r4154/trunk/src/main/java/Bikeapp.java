package ap;



class  Bike
{
	String brand;
	String color;
	int cost;
	void start()
	{
		System.out.println("Bike is starting");
	}
	void stop()
	{
		System.out.println("Bike is stoping");
	}
	void move()
	{
		System.out.println("Bike is moving");
	}
}

public class Bikeapp {

	public static void main(String[] args) {
		Bike B1= new Bike();
		B1.start();
	    B1.move();
	    Bike B2 = new Bike();
		B2.start();
		B2.stop();

	}

}
