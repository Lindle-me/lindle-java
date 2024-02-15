package lindle.classes;

public class Folder {
    final String id;
    final String name;
    final boolean publicFolder;
    final Link[] links;
    final String journeyLink;

    public Folder(String id, String name, boolean publicFolder, Link[] links, String journeyLink) {
        this.id = id;
        this.name = name;
        this.publicFolder = publicFolder;
        this.links = links;
        this.journeyLink = journeyLink;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean isPublicFolder() {
        return publicFolder;
    }

    public Link[] getLinks() {
        return links;
    }

    public String getJourneyLink() {
        return journeyLink;
    }
}
