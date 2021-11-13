package Codes;

public class MainDrive {

	public static void main(String[] args) {

		Dog dog1 = new Dog();
		dog1.birthYear = 2020;
		dog1.isMale = true;

		dog1.eat();

		dog1.name = "바둑이";
		dog1.keepHome();

		Cat cat1 = new Cat();
		cat1.birthYear = 2014;
		cat1.isMale = true;

		cat1.name = "마루";

		cat1.eat();
		cat1.playWithHuman();

	}

}