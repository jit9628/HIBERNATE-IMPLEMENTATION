package servletpro.com.pro.dash;

public class Dash {

	private static boolean logged;

	public static boolean isLogged() {
		return logged;
	}

	public static void setLogged(boolean logged) {
		Dash.logged = logged;
	}

	public void AccessData() {
		if (logged) {
			DashMenu.menuOperation();

		} else {

		}
	}
}
