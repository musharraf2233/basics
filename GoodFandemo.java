package day10;

import java.util.Scanner;

public class GoodFandemo {

	public static void main(String[] args) {
		GoodFan khaitan=new GoodFan();
		Scanner scan=new Scanner(System.in);
		while(true) {
			System.out.println("enter button");
			scan.nextLine();
			khaitan.Pull();
		}
		
	}

}
class GoodFan{
	State state=new SwitchOffState();
	public void Pull() {
		state.pull(this);
	}
}
abstract class State{
	public abstract void pull(GoodFan fan);
}
class SwitchOffState extends State{
	public void pull(GoodFan fan) {
		System.out.println("fan ON state...");
		fan.state=new SwitchOnState();
	}
}
class SwitchOnState extends State{
	public void pull(GoodFan fan) {
		System.out.println("fan run at MEDIUM speed state");
		fan.state=new MediumSpeedState();
	}
}
class MediumSpeedState extends State{
public void pull(GoodFan fan) {
		System.out.println("fan run at HIGH speed state");
		fan.state=new HighSpeedState();
	}
}
class HighSpeedState extends State{
public void pull(GoodFan fan) {
		System.out.println("fan run at very high speed");
		fan.state=new VeryHighSpeedState();
	}
}
class VeryHighSpeedState extends State{
	public void pull(GoodFan fan) {
		System.out.println("fan OFF state");
		fan.state=new SwitchOffState();
		
	}
}