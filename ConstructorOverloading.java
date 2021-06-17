package day2;

class Cs{
	int p,q;
	public Cs() {}
	public Cs(int x,int y) {
		p=x;
		q=y;
	}
public int Add(int i,int j) {
	return i+j;
	}	
public int Add(int i,int j,int k) {
	return i+j+k;
	}
public float Add(float f1,float f2) {
	return f1+f2;
}
public void printData() {
	System.out.println("p="+p);
	System.out.println("q="+q);
}
}
public class ConstructorOverloading {

	public static void main(String[] args) {
		int x=2,y=3,z=4;
		Cs c1=new Cs();
		Cs c2=new Cs(x,z);
		c2.printData();
		float m=7.2F,n=5.2F;
		int k=c1.Add(x, y);
		int t=c1.Add(y, z, k);
		float kt=c1.Add(m, n);
		System.out.println("k="+k);
		System.out.println("t="+t);
		System.out.println("kt="+kt);
		

	}

}
