package notepad;

public class DemoElectronicDevice {

	public static void main(String[] args) throws WrongPasswordException {
		ElectronicSecureNotepad myElecDev = new ElectronicSecureNotepad("aBcdef5@R");
	
		myElecDev.start();
		myElecDev.addTextOnPage(null, "Azbuka");
		// myElecDev.addTextOnPage(b, "Bazuka");
		// myElecDev.addTextOnPage(c, "Bazuka");
		// myElecDev.addTextOnPage(d, "Bazuka");
		// myElecDev.addTextOnPage(e, "Bazuka");
		// myElecDev.addTextOnPage(f, "Bazuka");
		// myElecDev.addTextOnPage(j, "Bazuka");
		// myElecDev.previewAllPages();
		// myElecDev.searchWord("A");
		myElecDev.stop();

	}

}
