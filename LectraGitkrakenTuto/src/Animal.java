
public class Animal {
	private String name;
	private int age;
	private double poids;
	
	public Animal(){
		//use a constructor inside the class
		this("xxx", 1, 1.0);
	}
	public Animal(String name, int age, double poids) {
		this.name = name;
		this.age = age;
		this.poids = poids;
	}

	private String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	private int getAge() {
		return age;
	}

	private void setAge(int age) {
		this.age = age;
	}

	private double getPoids() {
		return poids;
	}

	private void setPoids(double poids) {
		this.poids = poids;
	}

	
}
