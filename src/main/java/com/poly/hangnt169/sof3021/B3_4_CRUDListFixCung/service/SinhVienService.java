package com.poly.hangnt169.sof3021.B3_4_CRUDListFixCung.service;

import com.poly.hangnt169.sof3021.B3_4_CRUDListFixCung.entity.SinhVien;

import java.util.List;

public interface SinhVienService {

    List<SinhVien>getAll();

    void addSinhVien(SinhVien sv);

}
