package notepad;

class ElectronicSecureNotepad extends SecureNotepad implements IElectronicDevice {
	private boolean isDeviceTurnOn;

	public ElectronicSecureNotepad(String password) {
		super(password);
		this.isDeviceTurnOn = false;
	}

	@Override
	public void start() {
		System.out.println("Device is started");
		this.isDeviceTurnOn = true;
	}

	@Override
	public void stop() {
		System.out.println("Device is turning off");
		this.isDeviceTurnOn = false;
	}

	@Override
	public boolean isStarted() {
		return this.isDeviceTurnOn;
	}

	@Override
	public void addTextOnPage(Page page, String text) {
		if (isStarted()) {
			super.addTextOnPage(page, text);
		}
	}

	@Override
	public void replaceText(int pageNumber, String text) {
		if (isStarted()) {
			super.replaceText(pageNumber, text);

		}
	}

	@Override
	public void deleteText(int pageNumber) {
		if (isStarted()) {
			super.deleteText(pageNumber);
		}
	}

	@Override
	public void previewAllPages() {
		if (isStarted()) {
			super.previewAllPages();
		}
	}

	@Override
	public void searchWord(String word) {
		if (isStarted()) {
			super.searchWord(word);
		}
	}

	@Override
	public void printAllPagesWithDigits() {
		if (isStarted()) {
			super.printAllPagesWithDigits();
		}
	}
}
