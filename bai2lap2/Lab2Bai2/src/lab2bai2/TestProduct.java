/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2bai2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author MC
 */
public class TestProduct {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        System.out.print("Nhap so luong phan tu: ");
        int n = sc.nextInt();
        System.out.println("Nhap hang hoa:");
        for(int i=0;i<n;i++)
        {
            System.out.println("Hang hoa thu "+(i+1));
            Product p = new Product();
            p.input();
            list.add(p);
        }
        System.out.println();
        System.out.println("Danh sach hang hoa vua nhap");
        for (Product product : list) {
            product.output();
        }
        float max = 0;
        for (Product product : list) {
            if(max<product.getGia1SP())
                max = product.getGia1SP();
        }
        System.out.println();
        System.out.println("hang hoa co gia cao nhat la: ");
        for (Product product : list) {
            if(product.getGia1SP()==max)
                product.output();
        }
        Collections.sort(list, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if(o1.getGia1SP()<o2.getGia1SP())
                    return 1;
                else if(o1.getGia1SP()==o2.getGia1SP())
                    return 0;
                else return -1;
            }
        });
        System.out.println();
        System.out.println("Mang sau khi sap xep giam dan theo gia 1 san pham");
        for (Product product : list) {
            product.output();
        }
        System.out.println();
        System.out.println("Tim hang hoa 'sua': ");
        for (Product product : list) {
            if(product.getTenHH().equalsIgnoreCase("sua"))
                product.output();
        }
    }
}
