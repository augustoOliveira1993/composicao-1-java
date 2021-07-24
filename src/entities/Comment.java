package entities;

public class Comment {
	
	private String text;
	
	public Comment() {
		// TODO Auto-generated constructor stub
	}

	public Comment(String text) {
		super();
		this.text = text;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.text);
		return sb.toString();
	}
}
