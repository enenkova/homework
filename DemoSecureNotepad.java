package notepad;

public class DemoSecureNotepad {

	public static void main(String[] args)  {
		INotepad mySecNote;

		try {
			mySecNote = new SecureNotepad("aBcdef5@R");
			mySecNote.addTextOnPage("A", "Answer");
			mySecNote.addTextOnPage("B", "Border");
			mySecNote.addTextOnPage("C", "Car");
			mySecNote.addTextOnPage("D", "Demo");
			mySecNote.addTextOnPage("E", "Elephant");
			mySecNote.addTextOnPage("F", "File");
			mySecNote.addTextOnPage("G", "Joomla");
			mySecNote.addTextOnPage("H", "Hard");
			mySecNote.addTextOnPage("I", "Ice");
			mySecNote.addTextOnPage("K", "Label");
			mySecNote.addTextOnPage("L", "Koala");
			mySecNote.replaceText(4, "Doctor");
			mySecNote.previewAllPages();
			mySecNote.searchWord("er");
		} catch (WrongPasswordException e1) {
			
			e1.printStackTrace();
		}
	

		
	}

}
