package com.example.listviewproject;

public class Frappe {
    int Image;
    String Name;
    String Desc;

    public Frappe(int image, String name, String desc) {
        Image = image;
        Name = name;
        Desc = desc;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDesc() {
        return Desc;
    }

    public void setDesc(String desc) {
        Desc = desc;
    }
}
