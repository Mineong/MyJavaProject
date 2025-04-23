package workshop.book.entity;

public class ReferencBook extends Publication {
	private String field;

	public ReferencBook() {
	}

	public ReferencBook(String title, String publishingDate, int page, int price, String field) {
		super(title, publishingDate, page, price);
		this.field = field;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

}
