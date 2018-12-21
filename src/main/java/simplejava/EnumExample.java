package simplejava;

public class EnumExample {

	enum Fruits {
		APPLE, MANGO, ORANGE, PINEAPPLE
	}

	enum Browsers {
		FireFox, Chrome, InternetExplorer, Edge
	}

	public static void main(String[] args) {
		String browser = "FireFox";
		if (browser.equalsIgnoreCase(Browsers.Chrome.toString())) {
			System.out.println("Starting chrome");
		} else if (browser.equalsIgnoreCase(Browsers.FireFox.toString())) {
			System.out.println("Starting Firefox ");
		}
	}

}
