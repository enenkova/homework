package notepad;

public class Page {

	private String title;
	private String text;
	private int pageNumber;

	void addText(String text) {
		if (this.text != null && !text.trim().equals("")) {
			this.setText(this.text += text);
		} else {
			this.setText(text);
		}
	}

	void deleteText() {
		this.text = "";
	}

	String printPage() {
		return this.title + "\n" + this.text;
	}

	boolean searchWord(String word) {		
			return (this.getText().contains(word));
	}

	boolean containsDigits() {
		String text = this.getText();
		for (int index = 0; index < text.length(); index++) {
			if (text.charAt(index) >= '0' && text.charAt(index) <= '9') {
				return true;
			}
		}
		return false;
	}

	String getText() {
		return text;
	}

	void setText(String text) {
		if (text != null && !text.trim().equals("")) {
			this.text = text;
		} else {
			this.text = "Default text";
		}
	}

	String getTitle() {
		return title;
	}

	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	void setTitle(String title) {
		if (title != null && !title.trim().equals("")) {
			this.title = title;
		}
	}

}
