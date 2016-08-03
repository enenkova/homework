package notepad;

public class DemoSecureNotepad {

	public static void main(String[] args) {
		INotepad mySecNote = new SecureNotepad("aBc");
		Page a = new Page("A");
		Page b = new Page("B");
		Page c = new Page("C");
		Page d = new Page("D");
		Page e = new Page("E");
		Page f = new Page("F");
		Page j = new Page("J");
		Page h = new Page("K");
		Page i = new Page("I");
		Page l = new Page("J");
		Page k = new Page("K");

		mySecNote.addTextOnPage(a, "Azbuka");
		mySecNote.addTextOnPage(b, "Bazuka");
		mySecNote.addTextOnPage(c, "Bazuka");
		mySecNote.addTextOnPage(d, "Bazuka");
		mySecNote.addTextOnPage(e, "Bazuka");
		mySecNote.addTextOnPage(f, "Bazuka");
		mySecNote.addTextOnPage(j, "Bazuka");
		mySecNote.addTextOnPage(h, "Bazuka");
		mySecNote.addTextOnPage(i, "Bazuka");
		mySecNote.addTextOnPage(l, "Bazuka");
		mySecNote.addTextOnPage(k, "Bazuka");
		mySecNote.previewAllPages();
		mySecNote.searchWord("uka");
	}

}
