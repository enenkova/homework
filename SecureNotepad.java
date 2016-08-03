package notepad;

import java.util.Scanner;

public class SecureNotepad extends SimpleNotepad implements INotepad {

	private String password;

	public SecureNotepad(String password) {
		super();
		this.password = password;
	}

	boolean checkPassword() {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("Enter password: ");
			String myPass = scanner.nextLine();
			if (myPass.equals(this.password)) {
				return true;
			} else {
				System.out.println("Enter your password again");
			}
		}

	}

	@Override
	public void addTextOnPage(Page page, String text) {
		if (checkPassword()) {
			super.addTextOnPage(page, text);
		}
	}

	@Override
	public void replaceText(int pageNumber, String text) {
		if (checkPassword()) {
			super.replaceText(pageNumber, text);
		}

	}

	@Override
	public void deleteText(int pageNumber) {
		if (checkPassword()) {
			super.deleteText(pageNumber);
		}

	}

	@Override
	public void previewAllPages() {
		if (checkPassword()) {
			super.previewAllPages();
		}
	}

	@Override
	public void searchWord(String word) {
		if (checkPassword()) {
			super.searchWord(word);
		}

	}

	@Override
	public void printAllPagesWithDigits() {
		if (checkPassword()) {
			super.printAllPagesWithDigits();
		}
	}
}
