package com.example.nhom09_recycleview;

import java.util.ArrayList;
import java.util.List;

public class MonHoc {
    public String tenHinh;
    public String maMh;
    public String tenMh;
    public String tenGv;

    public MonHoc(String tenHinh, String maMh, String tenMh, String tenGv) {
        this.tenHinh = tenHinh;
        this.maMh = maMh;
        this.tenMh = tenMh;
        this.tenGv = tenGv;
    }

    public String getTenHinh() {
        return tenHinh;
    }

    public void setTenHinh(String tenHinh) {
        this.tenHinh = tenHinh;
    }

    public String getMaMh() {
        return maMh;
    }

    public void setMaMh(String maMh) {
        this.maMh = maMh;
    }

    public String getTenMh() {
        return tenMh;
    }

    public void setTenMh(String tenMh) {
        this.tenMh = tenMh;
    }

    public String getTenGv() {
        return tenGv;
    }

    public void setTenGv(String tenGv) {
        this.tenGv = tenGv;
    }
    public  static List<MonHoc> LayDsMonHoc(){
        List<MonHoc> monHocList = new ArrayList<>();
        monHocList.add(new MonHoc("didong","CMP354","Lập trình di động","Nguyễn Huy Cường"));
        monHocList.add(new MonHoc("java","CPM324","Lập trình java","Võ Minh Thuận"));
        monHocList.add(new MonHoc("winform","CMP332","Lập trình winform","Nguyễn Văn B"));
        return monHocList;
    }
}
