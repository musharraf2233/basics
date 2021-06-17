package day2;

class Bird {
	int age;
	String name;
	Bird(){
		System.out.println("this is a parrot");
	}
Bird(String x){
	name=x;
	System.out.println("this parrot name is:"+name);
}
Bird(String x,int y){
	name=x;
	age=y;
	System.out.println("this is "+age+" years "+name);
}
	public static void main(String[] args) {
		Bird parrot=new Bird();
		Bird parrotName=new Bird("maina");
		Bird age=new Bird("maina",18);
		

	}

}
