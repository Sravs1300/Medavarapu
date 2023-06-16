package Inheritance;

public class Cat extends Animal {
 public void Meow()
 {
	 System.out.println("cats says Meow");
 }
	public static void main(String[] args) {
		Cat c =new Cat();
		c.name("sravs");
		c.age(20);
		c.Meow();
	}
}
 
