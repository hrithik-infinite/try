package third;
//class mine extends Float{
//}	//cant extend final class, cant override a final method
// when a static method is over-ridden it is futile
public class Exe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = new Tiger();
		a.move();
		Tiger.makeNoise();
		a= new Dog();
		a.move();
		Dog.makeNoise();
		a= new Wolf();
		a.move();
		Wolf.makeNoise();
		
		
//		Number num = new Integer(2);
//		System.out.println(num.);
	}

}
