package me.miliano.hotel;

public class Session {
	public static boolean admin = true;

	public Session(boolean a) {
		admin = a;

		System.out.println("Admin : " + admin);
	}

}