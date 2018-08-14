package models;


import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "folder")
public class Folder {
    private int id;
    private String title;
    private List<File> files;

    public Folder() {
    }

    public Folder(String title) {
        this.id = id;
        this.title = title;
        this.files = files;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    @OneToMany(mappedBy = "folder", fetch = FetchType.LAZY)
    public List<File> getFiles() {
        return files;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }
}
