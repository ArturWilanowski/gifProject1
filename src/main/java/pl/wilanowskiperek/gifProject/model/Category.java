package pl.wilanowskiperek.gifProject.model;

public class Category {

    private Long id;
    private String name;

    public Category(){
    }

    public Category(Long id, String categoryName) {
        this.id = id;
        this.name = categoryName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
