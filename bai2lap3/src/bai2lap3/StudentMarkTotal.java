/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2lap3;

/**
 *
 * @author ADMIN
 */
public class StudentMarkTotal extends StudentMark{
    private int totalExamSubject;
    private float everageMark;

    public StudentMarkTotal(int totalExamSubject, float everageMark, String StuId, String className, String subjectName, int semester, float mark) {
       
        this.totalExamSubject = totalExamSubject;
        this.everageMark = everageMark;
    }

    public StudentMarkTotal() {
    }

    public int getTotalExamSubject() {
        return totalExamSubject;
    }

    public void setTotalExamSubject(int totalExamSubject) {
        this.totalExamSubject = totalExamSubject;
    }

    public float getEverageMark() {
        return everageMark;
    }

    public void setEverageMark(float everageMark) {
        this.everageMark = everageMark;
    }
        
    public int getTotalExamSubject(StudentMarkTotal[] list){
        return list.length;
    }
    
    public void calculateEverageMark(StudentMarkTotal[] list){
        for (int i = 0; i < list.length; i++) {
            everageMark += list[i].getEverageMark();
        }
    }
    
    public void input() {
        super.nhap();
        
        
    }

    public void display() {
        super.hienthi(); 
    }
    
    
}

    

