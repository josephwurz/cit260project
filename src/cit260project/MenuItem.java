package cit260project;

/**
 * MenuItem class for use by Menu objects.
 * 
 * @author David Barney
 *
 */
public class MenuItem {
	private char key;
	private String text;

	/**
	 * Constructor
	 * 
	 * @param key
	 * @param text
	 */
	public MenuItem(char key, String text) {
		this.key = key;
		this.text = text;
	}

	/**
	 * Accessor
	 * 
	 * @return
	 */
	public char getKey() {
		return key;
	}

	/**
	 * Accessor
	 * 
	 * @return
	 */
	public String getText() {
		return text;
	}

}
