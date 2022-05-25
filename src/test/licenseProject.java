package test;

public class licenseProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nameOfPerson = "Jane";
		String currentLicense = "None";

		int age = 18;

		if (age >= 16) {
			if (currentLicense == "G1") {
				System.out.println("Jane Is eligible for G2");
			}

			else if (currentLicense == "G2") {
				System.out.println("Jane is eligible for G");
			} else if (currentLicense == "G") {
				System.out.println("You are at maximum level");
			} else {
				System.out.println("Please take the test for G1 license");
			}

		} else {
			System.out.println("you need to be atleast 16 years old to be eligible");
		}

	}

}
