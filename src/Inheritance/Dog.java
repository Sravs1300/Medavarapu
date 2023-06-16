package Inheritance;

public class Dog  extends Animal
{
	public void Bark()
	{
		System.out.println("Dog says Bark");
	}

	public static void main(String[] args) {
		Dog d =new Dog();
		d.name("Rocky");
		d.age(15);
		d.Bark();
	}

}
