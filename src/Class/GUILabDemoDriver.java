package Class;

public class GUILabDemoDriver {

	public static void main(String[] args) {
		new GUIDEMO();
		StringBuilder strBld = new StringBuilder("Hello CIS111BCC!");
		strBld.reverse();
		strBld.insert(11, "frog");
		System.out.println(strBld);

	}

}
