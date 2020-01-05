package me.miliano.hotel;

public class Session {
	public static ROLE role = ROLE.CLIENT;

	public Session(ROLE role) {
		Session.role = role;
	}

}
	enum ROLE{
		ADMIN,RECEPTIONER,CLIENT
	}