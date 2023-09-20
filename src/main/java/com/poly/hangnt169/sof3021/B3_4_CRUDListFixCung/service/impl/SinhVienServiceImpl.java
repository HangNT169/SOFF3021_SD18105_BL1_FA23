package com.poly.hangnt169.sof3021.B3_4_CRUDListFixCung.service.impl;

import com.poly.hangnt169.sof3021.B3_4_CRUDListFixCung.entity.SinhVien;
import com.poly.hangnt169.sof3021.B3_4_CRUDListFixCung.service.SinhVienService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SinhVienServiceImpl implements SinhVienService {

    private List<SinhVien> lists = new ArrayList<>();

    public SinhVienServiceImpl() {
        // add 5 phan tu vao contructor
        lists.add(new SinhVien("sv1", "minh anh", 1, "ha noi", true));
        lists.add(new SinhVien("sv2", "minh anh1", 1, "ha noi", false));
        lists.add(new SinhVien("sv3", "minh anh2", 1, "ha noi", true));
        lists.add(new SinhVien("sv4", "minh an3h", 1, "ha noi", true));
        lists.add(new SinhVien("sv5", "minh anh4", 1, "ha noi", true));
    }

    @Override
    public List<SinhVien> getAll() {
        return lists;
    }

    @Override
    public void addSinhVien(SinhVien sv) {
        lists.add(sv);
    }

    @Override
    public void removeSinhVien(String mssv) {
        for (SinhVien sv: lists){
            if(sv.getMssv().equalsIgnoreCase(mssv)){
                // remove
                lists.remove(sv);
                break;
            }
        }
    }

    @Override
    public void updateSinhVien(String mssv, SinhVien sv) {
        // code
    }

    @Override
    public SinhVien detailSinhVien(String mssv) {
        for (SinhVien sv: lists){
            if(sv.getMssv().equalsIgnoreCase(mssv)){
                return sv;
            }
        }
        return null;
    }
}
