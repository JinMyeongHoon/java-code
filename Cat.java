package Chapter7;

public class Cat {
	String name;
	String breeds;
	double weight;
	void claw(){
		System.out.println("할퀴기");
	}
	public void main(String[]args) {
		Cat c = new Cat();
		
		c.name = "고양이";
		c.breeds = "페르시안";
		c.weight = 4.36;
	}
}
