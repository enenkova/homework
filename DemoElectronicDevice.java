package notepad;

public class DemoElectronicDevice {

	public static void main(String[] args) {
		ElectronicSecureNotepad myElecDev = new ElectronicSecureNotepad("aBc");
		Page a = new Page("A");
		Page b = new Page("B");
		Page c = new Page("C");
		Page d = new Page("D");
		Page e = new Page("E");
		Page f = new Page("F");
		Page j = new Page("J");
		// Page h = new Page("K");
		// Page i = new Page("I");
		// Page l = new Page("J");
		// Page k = new Page("K");
		myElecDev.start();
		myElecDev.addTextOnPage(a, "Azbuka");
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
