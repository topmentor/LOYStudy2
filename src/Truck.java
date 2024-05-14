interface BaeMin {
    public void deliver();
}

abstract class Vehicle {
	
	protected int velocity;	
	protected int wheelNum;	
	public String carName;	
	public Vehicle() {
		wheelNum = 6;
		velocity = 0;		
	}
	public void setCarName(String name) {
		carName = name;
	}
	public abstract void speedUp() ;
}

class Car 
{
	protected int velocity;	
	protected int wheelNum;	
	protected String carName;	
	public Car()
	{
		wheelNum = 4;
		velocity = 100;		
	}
	public void speedUp()
	{
		velocity++;		
	}
}

class Cycle implements BaeMin
{
	int velocity;	
	public void deliver()
	{
		System.out.println("자전거로 배달합니다.");
	}

    public void speedUp()
	{
		velocity++;		
	}
}

public class Truck extends Car implements BaeMin{
	public void speedUp()
	{
		velocity += 30;	
	}
	public void warn()      
	{
		System.out.println("경적을 울림");
	}
	
	public void deliver()
	{
		System.out.println("트럭으로 배달합니다.");
	}

	public static void main(String args[])
	{
		// 일반 클래스에 의한 다형성 
		Truck myTruck = new Truck();
		myTruck.speedUp();
		System.out.println("트럭의 속도 " + myTruck.velocity);
		
		Car myCar = myTruck;	
		myCar.speedUp();
		System.out.println("트럭의 속도 " + myCar.velocity);
		
        // myCar.warn(); // 컴파일 에러
		
		// 인터페이스 다형성 
		BaeMin myBaeMin = new Cycle();
		myBaeMin.deliver();
		myBaeMin = myTruck;
		myBaeMin.deliver();
		
	}
}