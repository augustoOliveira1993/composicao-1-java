package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
	
	private Date moment;
	private String title;
	private String content;
	private Integer likes;
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private List<Comment> comment = new ArrayList<>();
	
	public Post() {
		// TODO Auto-generated constructor stub
	}

	public Post(Date moment, String title, String content, Integer likes) {
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public List<Comment> getComment() {
		return this.comment;
	}

	public void addComment(Comment comment) {
		this.comment.add(comment);
	}
	
	public void removerComment(Comment comment) {
		this.comment.remove(comment);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.title);
		sb.append("\n");
		sb.append(this.likes);
		sb.append(" Likes - ");
		sb.append(sdf.format(this.moment));
		sb.append("\n");
		sb.append(this.content);
		sb.append("\nComments: \n");
		for(Comment c : this.comment) {
			sb.append(c);
			sb.append("\n");
		}
		return sb.toString();
	}
	
}	
