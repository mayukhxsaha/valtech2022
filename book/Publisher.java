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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class Publisher {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String name;
    private String address;
    private long phone;
    @OneToMany(targetEntity=Book.class,cascade={CascadeType.MERGE,CascadeType.PERSIST},fetch=FetchType.LAZY,mappedBy="publisher")



   private Set<Book> books;
    public Publisher() {}
    
    
    public Publisher(String name, String address, long phone) {
    this.name = name;
    this.address = address;
    this.phone = phone;
}




    public Set<Book> getBooks() {
        return books;
    }




    public void setBooks(Set<Book> books) {
        this.books = books;
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
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public long getPhone() {
        return phone;
    }
    public void setPhone(long phone) {
        this.phone = phone;
    }
    
    
    
    
}
