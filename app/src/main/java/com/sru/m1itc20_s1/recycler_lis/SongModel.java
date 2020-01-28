package com.sru.m1itc20_s1.recycler_lis;

public class SongModel {

    private String title;
    private String descrip;
    private String Singer;
    private int image;

    public SongModel(String t, String  d, int im){
        title = t; descrip = d; image = im;
    }

    public void setTitle(String title){this.title = title;}
    public void setDescrip(String des){descrip = des;}
    public void setSinger(String singer){this.Singer = singer;}
    public void setImage(int image){this.image = image;}

    public int getImage() {
        return image;
    }

    public String getDescrip() {
        return descrip;
    }

    public String getSinger() {
        return Singer;
    }

    public String getTitle() {
        return title;
    }
}
