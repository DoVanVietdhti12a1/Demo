/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3lap2;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Bai3lap2 {

    static void menu() {
        System.out.println("1:Nhập thông tin cho n sản phẩm :");
        System.out.println("2:Hiển thị thông tin vừa nhập :");
        System.out.println("3:Sắp xếp thông tin giảm dần theo nam xuat ban và hiển thị :");
        System.out.println("4:Tìm kiếm theo tên sách :");
        System.out.println("5:Tìm kiếm theo tên tác giả :");
        System.out.println("6:Thoát :");
    }
    public static void main(String[] args) {
        int n = 0;
        UnetiBook ab = new UnetiBook();
        UnetiBook[] ab1 = null;
        do {
            menu();
            System.out.println("Nhap vao lua chon cua ban :");
            Scanner sc = new Scanner(System.in);
            n = Integer.parseInt(sc.nextLine());
            switch (n) {
                case 1: {
                    int m;
                    System.out.println("Nhap vao n :");
                    m = Integer.parseInt(sc.nextLine());
                    ab1 = new UnetiBook[m];
          
                    for (int i = 0; i < m; i++) {
                        ab1[i] = new UnetiBook();
                        ab1[i].input();
                    }
                    break;
                }
                case 2: {
                    if (ab1 == null) {
                        System.out.println("ban chua nhap du lieu");
                    } else {
                        System.out.println("du lieu ban vua nhap la :");
                        for (int i = 0; i < ab1.length; i++) {
                            System.out.println("thong tin sach thu " + (i + 1));
                            ab1[i].display();
                        }
                    }
                    break;
                }
                case 3: {
                    if (ab1 == null) {
                        System.out.println("ban chua nhap du lieu");
                    } else {
                        ab.sort(ab1);
                        System.out.println("du lieu sau khi sap xep la :");
                        for (int i = 0; i < ab1.length; i++) {
                            System.out.println("thong tin hang hoa thu " + (i + 1));
                            ab1[i].display();
                        }
                    }
                    break;
                }
                case 4: {
                    ab.searchNameBook(ab1);
                    break;
                }
                case 5: {
                    ab.searchNameBook(ab1);
                    break;
                    
                }
                case 6:
                    break;
                default: {
                    System.out.println("khong co lua chon cua ban ");
                    break;
                }
            }
        } while (n != 6);
    }
}
