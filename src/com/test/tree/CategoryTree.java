package com.test.tree;

import java.util.ArrayList;
import java.util.List;

public class CategoryTree {

    private Category catogory;

    private List<CategoryTree> childrenCategories;

    public CategoryTree() {
        super();
    }

    public CategoryTree(Category catogory) {
        super();
        this.catogory = catogory;
        this.childrenCategories = new ArrayList<>();
    }

    public Category getCatogory() {
        return catogory;
    }

    public void setCatogory(Category catogory) {
        this.catogory = catogory;
    }

    public List<CategoryTree> getChildrenCategories() {
        return childrenCategories;
    }

    public void setChildrenCategories(List<CategoryTree> childrenCategories) {
        this.childrenCategories = childrenCategories;
    }

}
