package models;


public class File {
    private int id;
    private String name;
    private String extension;
    private int size;
    private Folder folder;

    public File() {
    }

    public File(String name, String extension, int size, Folder folder) {
        this.id = id;
        this.name = name;
        this.extension = extension;
        this.size = size;
        this.folder = folder;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getExtension() {
        return extension;
    }

    public int getSize() {
        return size;
    }

    public Folder getFolder() {
        return folder;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setFolder(Folder folder) {
        this.folder = folder;
    }
}
