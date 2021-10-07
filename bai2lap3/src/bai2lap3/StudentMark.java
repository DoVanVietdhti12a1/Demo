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
public class StudentMark {
    private String StuId;
    private String className;
    private String subjectName;
    private int semester;
    private float mark;

    public StudentMark() {
    }

    public StudentMark(String StuId, String className, String subjectName, int semester, float mark) {
        this.StuId = StuId;
        this.className = className;
        this.subjectName = subjectName;
        this.semester = semester;
        this.mark = mark;
    }

    public String getStuId() {
        return StuId;
    }

    public void setStuId(String StuId) {
        this.StuId = StuId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public float getMark() {
        return mark;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "StudentMark{" + "StuId=" + StuId + ", className=" + className + ", subjectName=" + subjectName + ", semester=" + semester + ", mark=" + mark + '}';
    }
    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ma :");
        this.StuId = scanner.nextLine();
        System.out.println("Nhap ten lop ");
        this.className = scanner.nextLine();
        System.out.println("Nhap Subject Name");
        this.subjectName = scanner.nextLine();
        System.out.println("Nhap Semester ");
        this.semester = scanner.nextInt();
        System.out.println("Nhap Mark");
        this.mark = scanner.nextFloat();
        

    }

    public void hienthi() {
        System.out.println("Ma :" + this.StuId);
        System.out.println("Ten lop :" + this.className);
        System.out.println("Subject Name :" + this.subjectName);
        System.out.println("Semester :" + this.semester);
        System.out.println("Mark :" + this.mark);
    }

    
}
