/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2bai2;

import java.util.Scanner;

/**
 *
 * @author MC
 */
public class Product {
    private String maHH;
    private String tenHH;
    private float soLuong;
    private float gia1SP;

    public Product() {
    }

    public Product(String maHH, String tenHH, float soLuong, float gia1SP) {
        this.maHH = maHH;
        this.tenHH = tenHH;
        this.soLuong = soLuong;
        this.gia1SP = gia1SP;
    }

    public String getMaHH() {
        return maHH;
    }

    public void setMaHH(String maHH) {
        this.maHH = maHH;
    }

    public String getTenHH() {
        return tenHH;
    }

    public void setTenHH(String tenHH) {
        this.tenHH = tenHH;
    }

    public float getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(float soLuong) {
        this.soLuong = soLuong;
    }

    public float getGia1SP() {
        return gia1SP;
    }

    public void setGia1SP(float gia1SP) {
        this.gia1SP = gia1SP;
    }
    
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma hang hoa: ");
        this.maHH = sc.nextLine();
        System.out.print("Nhap ten hang hoa: ");
        this.tenHH = sc.nextLine();
        System.out.print("Nhap so luong hang hoa: ");
        this.soLuong = sc.nextFloat();
        System.out.print("Nhap gia 1 san pham: ");
        this.gia1SP = sc.nextFloat();
    }
    public void output()
    {
        System.out.println("Ma hang hoa: "+this.maHH);
        System.out.println("Ten hang hoa: "+this.tenHH);
        System.out.println("So luong hang hoa: "+this.soLuong);
        System.out.println("Gia 1 san pham: "+this.gia1SP);
    }
    
}
