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
public class Book {
private String bookName;
private String bookAuthor;
private String producer;
private int yearPublishing;
private float price;

    public Book() {
    }

    public Book(String bookName, String bookAuthor, String producer, int yearPublishing, float price) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.producer = producer;
        this.yearPublishing = yearPublishing;
        this.price = price;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getYearPublishing() {
        return yearPublishing;
    }

    public void setYearPublishing(int yearPublishing) {
        this.yearPublishing = yearPublishing;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten sach:");
        this.bookName = scanner.nextLine();
        System.out.println("Nhap tac gia");
        this.bookAuthor = scanner.nextLine();
        System.out.println("Nhap nguoi san xuat");
        this.producer = scanner.nextLine();
        System.out.println("Nhap nam xuat ban");
        this.yearPublishing = scanner.nextInt();
        System.out.println("Nhap gia ban");
        this.price = scanner.nextFloat();

    }

    public void display() {
        System.out.println("Ten sach :" + this.bookName);
        System.out.println("Ten tac gia :" + this.bookAuthor );
        System.out.println("Nguoi san xuat:" + this.producer);
         System.out.println("Nam xuat ban :" + this.yearPublishing);
        System.out.println("Gia ban:" + this.price);
    }
}
