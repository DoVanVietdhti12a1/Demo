/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1lap2;

import java.util.Scanner;

public class Product {

    private String tenHanghoa;
    private String nhaSanxuat;
    private float giaBan;

    public Product() {
    }

    public Product(String tenHanghoa, String nhaSanxuat, float giaBan) {
        this.tenHanghoa = tenHanghoa;
        this.nhaSanxuat = nhaSanxuat;
        this.giaBan = giaBan;
    }

    public void setTenHanghoa(String tenHanghoa) {
        this.tenHanghoa = tenHanghoa;
    }

    public void setNhaSanxuat(String nhaSanxuat) {
        this.nhaSanxuat = nhaSanxuat;
    }

    public void setGiaBan(float giaBan) {
        this.giaBan = giaBan;
    }

    public String getTenHanghoa() {
        return tenHanghoa;
    }

    public String getNhaSanxuat() {
        return nhaSanxuat;
    }

    public float getGiaBan() {
        return giaBan;
    }

    @Override
    public String toString() {
        return "Product{" + "tenHanghoa=" + tenHanghoa + ", nhaSanxuat=" + nhaSanxuat + ", giaBan=" + giaBan + '}';
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten hang hoa:");
        this.tenHanghoa = scanner.nextLine();
        System.out.println("Nhap nha san xuat");
        this.nhaSanxuat = scanner.nextLine();
        System.out.println("Nhap gai ban");
        this.giaBan = scanner.nextFloat();

    }

    public void output() {
        System.out.println("Ten hang hoa :" + this.tenHanghoa);
        System.out.println("Nha san xuat :" + this.nhaSanxuat);
        System.out.println("Gia ban:" + this.giaBan);
    }

    public void sort(Product[] b) {
        for (int i = 0; i < b.length - 1; i++) {
            for (int j = i + 1; j < b.length; j++) {
                if (b[i].giaBan > b[j].giaBan) {
                    Product tem = b[i];
                    b[i] = b[j];
                    b[j] = tem;
                }
            }
        }
    }

}
