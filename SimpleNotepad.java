package notepad;

import java.util.ArrayList;
import java.util.List;

class SimpleNotepad implements INotepad {

	private List<Page> pages;

	public SimpleNotepad() {
		pages = new ArrayList<Page>();

	}

	@Override
	public void addTextOnPage(String title, String text) {
		Page page = new Page();
		if (text != null && !text.trim().equals("")) {
			page.addText(text);
		}
		if (title != null && title.trim().length() > 0) {
			page.setTitle(title);
		}
		page.setPageNumber(this.pages.size() + 1);
		pages.add(page);

	}

	@Override
	public void deleteText(int pageNumber) {
		if (pageNumber > 0) {
			for (Page page : pages) {
				if (page.getPageNumber() == pageNumber) {
					page.deleteText();
					break;
				}
			}
		}
	}

	@Override
	public void replaceText(int pageNumber, String text) {
		if (pageNumber > 0) {
			for (Page page : pages) {
				if (page.getPageNumber() == pageNumber) {
					page.deleteText();
					if (text != null && text.trim().length() > 0) {
						page.addText(text);
						break;
					}
				}
			}
		} else {
			System.out.println("The page is not negative number");
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

}
