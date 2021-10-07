/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2lap3;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class StudentUneti {
private String StuId;
private String StuName;
private String gender;
private String birthday;
private String nativePlace;

    public StudentUneti() {
    }

    public StudentUneti(String StuId, String StuName, String gender, String birthday, String nativePlace) {
        this.StuId = StuId;
        this.StuName = StuName;
        this.gender = gender;
        this.birthday = birthday;
        this.nativePlace = nativePlace;
    }

    public String getStuId() {
        return StuId;
    }

    public void setStuId(String StuId) {
        this.StuId = StuId;
    }

    public String getStuName() {
        return StuName;
    }

    public void setStuName(String StuName) {
        this.StuName = StuName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getNativePlace() {
        return nativePlace;
    }

    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace;
    }

    @Override
    public String toString() {
        return "StudentUneti{" + "StuId=" + StuId + ", StuName=" + StuName + ", gender=" + gender + ", birthday=" + birthday + ", nativePlace=" + nativePlace + '}';
    }
public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ma :");
        this.StuId = scanner.nextLine();
        System.out.println("Nhap ten ");
        this.StuName = scanner.nextLine();
        System.out.println("Nhap gioi tinh");
        this.gender = scanner.nextLine();
        System.out.println("Nhap nam sinh");
        this.birthday = scanner.nextLine();
        System.out.println("Nhap que quan");
        this.nativePlace = scanner.nextLine();
        

    }

    public void hienthi() {
        System.out.println("Ma :" + this.StuId);
        System.out.println("Ten :" + this.StuName);
        System.out.println("Gioi tinh :" + this.gender);
        System.out.println("Nam sinh :" + this.birthday);
        System.out.println("Que quan :" + this.nativePlace);
    }

    
}
