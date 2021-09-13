package com.example.autoimageslider;

public class The_Slide_Items_Model_Class {

    private int featured_image;
    private String the_caption_Title;
    private String the_caption_descri;

    public The_Slide_Items_Model_Class(int hero, String title,String descri) {
        this.featured_image = hero;
        this.the_caption_Title = title;
        this.the_caption_descri = descri;
    }

    public int getFeatured_image() {
        return featured_image;
    }

    public String getThe_caption_Title() {
        return the_caption_Title;
    }

    public void setFeatured_image(int featured_image) {
        this.featured_image = featured_image;
    }

    public void setThe_caption_Title(String the_caption_Title) {
        this.the_caption_Title = the_caption_Title;
    }

    public String getThe_caption_descri() {
        return the_caption_descri;
    }

    public void setThe_caption_descri(String the_caption_descri) {
        this.the_caption_descri = the_caption_descri;
    }
}

