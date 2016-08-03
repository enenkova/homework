package notepad;

interface INotepad {

	void addTextOnPage(Page page, String text);

	void replaceText(int pageNumber, String text);

	void deleteText(int pageNumber);

	void previewAllPages();

	void searchWord(String word);

	void printAllPagesWithDigits();
}
