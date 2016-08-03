package notepad;

public class Demo {

	public static void main(String[] args) {
		INotepad myNote = new SimpleNotepad();
	

		myNote.addTextOnPage(null, "Azbuka1");
		myNote.addTextOnPage("B", "Bazuka");
		myNote.addTextOnPage("C", "Cazuka");
//		 myNote.deleteText(4);
//		 myNote.replaceText(5, null);
		myNote.addTextOnPage("D", "dazuka");
		myNote.addTextOnPage("E", "eazuka");
		myNote.addTextOnPage("F", "Fazuka");
		myNote.addTextOnPage("J", "Hazuka");
		myNote.addTextOnPage("H", "Iazuka");
		myNote.addTextOnPage("I", "Jazuka");
		myNote.addTextOnPage("J", "Kazuka");
		myNote.addTextOnPage("K", "Lale");
		myNote.deleteText(4);
		myNote.previewAllPages();
		myNote.searchWord("Z");
		myNote.printAllPagesWithDigits();
	}
}
