package models;

import java.util.List;

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


    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

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
