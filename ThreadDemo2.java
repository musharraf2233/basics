package mywork;

import java.util.Date;

public class ThreadDemo2 {
	public static void main(String[] args) {
		VaccinationCentre vc=new VaccinationCentre();
		Thread t=Thread.currentThread();
		System.out.println(new Date());
		System.out.println("before class Start");
		Thread friend=new Thread(new JobToFriend(vc));
		friend.start();
		System.out.println("start class for 7 to 9 batch..");
	}
}
class JobToFriend implements Runnable{
	VaccinationCentre vc;
	public JobToFriend(VaccinationCentre vc) {
		this.vc=vc;
	}
	@Override
	public void run() {
		System.out.println("kala job executed from this method");
		try{
			vc.GetToken();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
class VaccinationCentre{
	public void GetToken() throws Exception{
		Thread t=Thread.currentThread();
		//String name;
		System.out.println("kala standing in queue");
		t.sleep(10000);
		System.out.println("token recived....");
		
		
	}
}