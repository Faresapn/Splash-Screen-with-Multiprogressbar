package com.example.praktikum6;

import android.os.Parcel;
import android.os.Parcelable;

public class Items implements Parcelable {
    private int Image;
    private String desc;
    protected Items(Parcel in) {
        Image = in.readInt();

        desc = in.readString();
    }

    public static final Creator<Items> CREATOR = new Creator<Items>() {
        @Override
        public Items createFromParcel(Parcel in) {
            return new Items(in);
        }

        @Override
        public Items[] newArray(int size) {
            return new Items[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Items(int mImage,   String mDesc) {
        this.Image = mImage;

        this.desc = mDesc;
    }
    public Items(){

    }

}
