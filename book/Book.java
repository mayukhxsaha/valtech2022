package valtechspring.book;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	private String name;
	private Date whenPublished;
	@ManyToMany(targetEntity = Author.class, cascade = { CascadeType.MERGE, CascadeType.PERSIST }, mappedBy = "book")
	@ManyToOne(targetEntity = Publisher.class, cascade = { CascadeType.MERGE,
			CascadeType.PERSIST }, fetch = FetchType.LAZY)
	@JoinColumn(name = "publisher_id", referencedColumnName = "id")
	private Publisher publisher;

	// private Set<Author> authors;

	// @ManyToMany(targetEntity=Author.class,cascade={CascadeType.MERGE,CascadeType.PERSIST})
	// @JoinTable(joinColumns=@JoinColumn(name="book_id",referencedColumnName="id"),
	// inverseJoinColumns=@JoinColumn(name="author_id",referencedColumnName="id"))
	// private Set<Author> authors;

	public Book() {
	}

	public Book(int id, String name, Date whenPublished) {
		super();
		this.id = id;
		this.name = name;
		this.whenPublished = whenPublished;
	}

	public Book(String name, Date whenPublished) {
		super();

		this.name = name;
		this.whenPublished = whenPublished;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getWhenPublished() {
		return whenPublished;
	}

	public void setWhenPublished(Date whenPublished) {
		this.whenPublished = whenPublished;
	}

	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

}