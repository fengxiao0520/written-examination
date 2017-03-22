package com.test.tree;

public class Category {

    private Category parentCategory;

    private String name;

    private Float price;

    public Category() {
        super();
    }

    public Category(Category parentCategory, String name, Float price) {
        super();
        this.parentCategory = parentCategory;
        this.name = name;
        this.price = price;
    }

    public Category(String name, Float price) {
        super();
        this.name = name;
        this.price = price;
    }

    public Category getParentCategory() {
        return parentCategory;
    }

    public void setParentCategory(Category parentCategory) {
        this.parentCategory = parentCategory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

}
