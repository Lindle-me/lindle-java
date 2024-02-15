package lindle.classes;

public class Bookmark {
    private final String id;
    private final String name;
    private final int date;
    private final String url;
    private final String folder;

    public Bookmark(String id, String name, int date, String url, String folder) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.url = url;
        this.folder = folder;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getDate() {
        return date;
    }

    public String getUrl() {
        return url;
    }

    public String getFolder() {
        return folder;
    }
}
