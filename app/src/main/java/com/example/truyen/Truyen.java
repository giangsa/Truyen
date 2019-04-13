package com.example.truyen;

public class Truyen {
    public static final int GROUPngontinh= 1;
    public static final int GROUPtruyentranh = 2;
    public static final int GROUPtruyenhai= 3;

    private long id;
    private String tentruyen;
    private  String tacgia;
    private int soChuong;
    private double groupId;

    public Truyen(long id, String tentruyen, String tacgia, int soChuong, double groupId) {
        this.id = id;
        this.tentruyen = tentruyen;
        this.tacgia = tacgia;
        this.soChuong = soChuong;
        this.groupId = groupId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTentruyen() {
        return tentruyen;
    }

    public void setTentruyen(String tentruyen) {
        this.tentruyen = tentruyen;
    }

    public String getTacgia() {
        return tacgia;
    }

    public void setTacgia(String tacgia) {
        this.tacgia = tacgia;
    }

    public int getSoChuong() {
        return soChuong;
    }

    public void setSoChuong(int soChuong) {
        this.soChuong = soChuong;
    }

    public double getGroupId() {
        return groupId;
    }

    public void setGroupId(double groupId) {
        this.groupId = groupId;
    }
}
