package notepad;

public class Demo {

	public static void main(String[] args) {
		INotepad myNote = new SimpleNotepad();
		Page a = new Page("A");
		Page b = new Page("B");
		Page c = new Page("C");
		Page d = new Page("D");
		Page e = new Page("E");
		Page f = new Page("F");
		Page j = new Page("J");
		Page h = new Page("H");
		Page i = new Page("I");
		Page l = new Page("J");
		Page k = new Page("K");

		myNote.addTextOnPage(a, "Azbuka1");
		myNote.addTextOnPage(b, "Bazuka");
		myNote.addTextOnPage(c, "Cazuka");
		// myNote.deleteText(4);
		// myNote.replaceText(5, "B");
		myNote.addTextOnPage(d, "dazuka");
		myNote.addTextOnPage(e, "eazuka");
		myNote.addTextOnPage(f, "Fazuka");
		myNote.addTextOnPage(h, "Hazuka");
		myNote.addTextOnPage(i, "Iazuka");
		myNote.addTextOnPage(j, "Jazuka");
		myNote.addTextOnPage(k, "Kazuka");
		myNote.addTextOnPage(l, "Lale");
		myNote.deleteText(4);
		myNote.previewAllPages();
		// myNote.searchWord("aka");
		myNote.searchWord("uka");
		myNote.printAllPagesWithDigits();
	}
}
