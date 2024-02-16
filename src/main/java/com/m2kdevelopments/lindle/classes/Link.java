package lindle.classes;

public class Link {
    final String id;
    final String name;
    final String url;
    final boolean favourite;

    public Link(String id, String name, String url, boolean favourite) {
        this.id = id;
        this.name = name;
        this.url = url;
        this.favourite = favourite;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public boolean isFavourite() {
        return favourite;
    }
}
