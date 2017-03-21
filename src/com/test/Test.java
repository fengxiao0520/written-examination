package com.test;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        Category root = new Category(null, "Root Category", null);
        Category electronics = new Category("Electronics", null);
        Category phone = new Category("Phone", null);
        Category game = new Category("Game", null);
        Category computer = new Category("Computer", null);
        Category audio = new Category("Audio", null);
        Category sports = new Category("Sports", null);
        List<Category> categories = new ArrayList<>();
        categories.add(root);
        categories.add(new Category(root, "Electronics", null));
        categories.add(new Category(electronics, "Phone", null));
        categories.add(new Category(phone, "Mobie", null));
        categories.add(new Category(phone, "Land Phone", null));
        categories.add(new Category(electronics, "Game", null));
        categories.add(new Category(game, "Playstation", null));
        categories.add(new Category(game, "Xbox", null));
        categories.add(new Category(electronics, "Computer", null));
        categories.add(new Category(computer, "Laptop", null));
        categories.add(new Category(computer, "Desktop", null));
        categories.add(new Category(electronics, "Audio", null));
        categories.add(new Category(audio, "Speaker", null));
        categories.add(new Category(audio, "MP3", null));
        categories.add(new Category(root, "Sports", null));
        categories.add(new Category(sports, "Fitness", null));
        categories.add(new Category(sports, "Outdoor", null));
        CategoryTree categoryTree = createCategoryTree(categories);
        System.out.println(iteratorTree(categoryTree));
    }

    //创建一个新的树形分类
    private static CategoryTree createCategoryTree(List<Category> categories) {
        if (categories == null || categories.size() < 0) {
            return null;
        }
        CategoryTree categoryTree = new CategoryTree();
        for (Category category : categories) {
            if (category.getParentCategory() == null) {
                categoryTree.setCatogory(null);
                List<CategoryTree> categoryTrees = new ArrayList<>();
                categoryTrees.add(new CategoryTree(category));
                categoryTree.setChildrenCategories(categoryTrees);
            } else {
                addChild(categoryTree, category);
            }
        }
        return categoryTree;
    }

    //向某一类别下添加新的分类
    public static void addChild(CategoryTree categoryTree, Category category) {
        for (CategoryTree item : categoryTree.getChildrenCategories()) {
            if (item.getCatogory().getName().equals(category.getParentCategory().getName())) {
                item.getChildrenCategories().add(new CategoryTree(category));
                break;
            } else {
                if (item.getChildrenCategories() != null && item.getChildrenCategories().size() > 0) {
                    addChild(item, category);
                }
            }
        }
    }

    //遍历树型结构的分类
    public static String iteratorTree(CategoryTree categoryTree) {
        StringBuilder buffer = new StringBuilder();
        buffer.append("\n");

        if (categoryTree != null) {
            for (CategoryTree index : categoryTree.getChildrenCategories()) {
                buffer.append(index.getCatogory().getName() + ",");
                if (index.getChildrenCategories() != null && index.getChildrenCategories().size() > 0) {
                    buffer.append(iteratorTree(index));
                }
            }
        }
        buffer.append("\n");
        return buffer.toString();
    }

    // 获取某一分类的价格
    public static Float getCategoryPrice(Category category) {
        Float price = null;
        if (category.getPrice() != null) {
            price = category.getPrice();
        } else {
            price = category.getParentCategory().getPrice();
        }
        return price;
    }
}
