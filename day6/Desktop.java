package assignment6.day6;

public class Desktop implements Hardware, Software {

	public void desktopModel() {
		System.out.println("Desktop Model");

	}

	public void softwareResource() {
		System.out.println("Software resource");

	}

	public void hardwareResource() {
		System.out.println("Hardware resource");

	}

	public static void main(String[] args) {

		Desktop desk = new Desktop();
		desk.desktopModel();
		desk.hardwareResource();
		desk.softwareResource();

	}

}
