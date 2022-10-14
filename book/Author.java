package valtechspring.book;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Author {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	private String name;
	private long phone;

	@ManyToMany(targetEntity = Book.class, cascade = { CascadeType.MERGE, CascadeType.PERSIST })
	private Set<Book> books;
	@OneToOne(targetEntity = Address.class, cascade = { CascadeType.MERGE, CascadeType.PERSIST }, mappedBy = "author")
	private Address address;

	// @ManyToMany(targetEntity=Book.class,cascade={CascadeType.MERGE,CascadeType.PERSIST})
	// @JoinTable(joinColumns=@JoinColumn(name="author_id",referencedColumnName="id"),
	// inverseJoinColumns=@JoinColumn(name="book_id",referencedColumnName="id"))
	// private Set<Book> books;

	public Author() {
	}

	public Author(String name, int phone) {
		this.name = name;
		this.phone = phone;
	}

	public Set<Book> getBooks() {
		return books;
	}

	public void setBooks(Set<Book> books) {
		this.books = books;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
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

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

}