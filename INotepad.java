package notepad;

interface INotepad {

	void addTextOnPage(String title, String text);

	void replaceText(int pageNumber, String text);

	void deleteText(int pageNumber);

	void previewAllPages();

	void searchWord(String word);

	void printAllPagesWithDigits();
}
