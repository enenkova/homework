package notepad;

class SimpleNotepad implements INotepad {

	static final int MAX_PAGES = 10;
	private Page[] pages;
	private int pageNumber;

	public SimpleNotepad() {
		this.pages = new Page[10];
		this.setPageNumber(1);
	}

	@Override
	public void addTextOnPage(Page page, String text) {
		if (pageNumber <= MAX_PAGES) {
			if (text != null && !text.trim().equals("")) {
				if (pages[pageNumber - 1] == null) {
					pages[pageNumber - 1] = new Page(page.getTitle());
					pages[pageNumber - 1].addText(text);
					pageNumber++;

				}
			}
		} else {
			System.out.println("Max pages riched");
		}
	}

	@Override
	public void replaceText(int pageNumber, String text) {
		if (pages[pageNumber - 1] != null) {
			if (text != null && !text.trim().equals("")) {
				pages[pageNumber - 1].deleteText();
				pages[pageNumber - 1].addText(text);
			}
		} else {
			System.out.println("No such a page in notebook");
		}

	}

	@Override
	public void deleteText(int pageNumber) {
		if (pages[pageNumber - 1] != null) {
			pages[pageNumber - 1].deleteText();
		} else {
			System.out.println("No such a page in notebook");
		}

	}

	@Override
	public void previewAllPages() {
		for (Page page : pages) {
			if (page != null) {
				System.out.println(page.printPage());
			}
		}

	}

	@Override
	public void searchWord(String word) {
		if (word != null && !word.trim().equals("")) {
			for (Page page : pages) {
				if (page != null && page.searchWord(word)) {
					System.out.println("The " + word + " is contains in page " + page.getTitle());
				}
			}
		}
	}

	@Override
	public void printAllPagesWithDigits() {
		for (Page page : pages) {
			if (page != null) {
				if (page.containsDigits()) {
					System.out.println("Page " + page.getTitle() + " contains digits");
				}
			}
		}
	}

	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		if (pageNumber > 0 && pageNumber <= MAX_PAGES) {
			this.pageNumber = pageNumber;
		} else {
			System.out.println("Page number is not in range of array");
		}
	}
}
