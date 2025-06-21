package com.salah.springRest.model;

public class VendorCloud {
    private String name;
    private String id;
    private String address;
    private String phone;


    public VendorCloud(String name, String id, String address, String phone) {
        this.name = name;
        this.id = id;
        this.address = address;
        this.phone = phone;
    }

    public VendorCloud() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
