package com.poly.hangnt169.sof3021.B3_4_CRUDListFixCung.entity;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor // Contructor full tham so
@NoArgsConstructor // Contructor khong tham so
@ToString
@Builder
public class SinhVien {

    @NotEmpty(message = "Khong duoc trong")
//    @Size
//    @Pattern(regexp = "",message = "..")
    private String mssv;

    @NotEmpty
    private String ten;

    private int tuoi;

    private String diaChi;

    private boolean gioiTinh;

}

