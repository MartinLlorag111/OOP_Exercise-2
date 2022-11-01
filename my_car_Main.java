class Main {
	public static void main(String [] args){
		Cars cars;
		Toyota Toyota = new Toyota("Toyota2.0", 1, "V15-powered");
		Ford Ford = new Ford("FordXYZ_1998.", 1, "P10 engine");

		cars = Toyota;
		System.out.println(cars.makesound() + " " + "My name is " + cars.getName());

		cars = Ford;
		System.out.println(cars.makesound() + " " + "My name is " + cars.getName());
	}
}
