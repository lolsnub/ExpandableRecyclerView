package database.c347.soi.rp.edu.sg.expandablerecyclerview.Model;

public class Book {
    private String Title;
    private String Category;
    private String Description;
    private String ImageURL;
    private int Image;

    public Book() {
    }

    public Book(String title, String category, String description, String imageURL) {
        Title = title;
        Category = category;
        Description = description;
        ImageURL = imageURL;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }

    public String getImageURL() {
        return ImageURL;
    }

    public void setImageURL(String imageURL) {
        ImageURL = imageURL;
    }
}
