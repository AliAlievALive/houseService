package ru.itpark.model;

import java.util.List;

public abstract class House {
    private int id;
    private long price;
    private double livingArea;
    private List<String> photos;
    private String specification;
    private String phone;
    private String city;
    private String area;
    private String street;

    public House(int id, long price, double livingArea, List<String> photos, String specification, String phone,
                 String city, String area, String street) {
        this.id = id;
        this.price = price;
        this.livingArea = livingArea;
        this.photos = photos;
        this.specification = specification;
        this.phone = phone;
        this.city = city;
        this.area = area;
        this.street = street;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public double getLivingArea() {
        return livingArea;
    }

    public void setLivingArea(double livingArea) {
        this.livingArea = livingArea;
    }

    public List<String> getPhotos() {
        return photos;
    }

    public void setPhotos(List<String> photos) {
        this.photos = photos;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "House{" +
                "id=" + id +
                ", price=" + price +
                ", livingArea=" + livingArea +
                ", photos=" + photos +
                ", specification='" + specification + '\'' +
                ", phone='" + phone + '\'' +
                ", city='" + city + '\'' +
                ", area='" + area + '\'' +
                ", street='" + street + '\'' +
                '}';
    }
}