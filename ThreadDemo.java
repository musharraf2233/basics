package mywork;

public class ThreadDemo {
public static void main(String[] args)throws Exception{
	Thread t=Thread.currentThread();
	t.setName("this is multithread");
	t.setPriority(8);
	met();
	System.out.println(t);
	
}
static void met()throws Exception {
	System.out.println("method call...");
	Thread.sleep(5000);
}
}
