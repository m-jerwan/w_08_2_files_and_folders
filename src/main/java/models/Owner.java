package models;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "owners")
public class Owner {
    private int id;
    private String firstName;
    private String lastName;
    private List<Folder> folders;

    public Owner() {
    }

    public Owner( String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    @Column(name = "first_name")
    public String getFirstName() {
        return firstName;
    }

    @Column(name = "last_name")
    public String getLastName() {
        return lastName;
    }

    @OneToMany(mappedBy = "owner", fetch = FetchType.LAZY)
    public List<Folder> getFolders() {
        return folders;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFolders(List<Folder> folders) {
        this.folders = folders;
    }
}
