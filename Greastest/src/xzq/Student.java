package xzq;

import java.util.Arrays;
import java.util.Scanner;
class Student{
	private  int sNO;
	private  String sName;
	private  String sSex;
    private  int sJava;
    public Student(int sNO,String sName,String sSex,int sJava){
        this.sNO=sNO;
    	this.sName=sName;
    	this.sSex=sSex;
        this.sJava=sJava;
    }
    public int getsNO(){
        return sNO;
    }
    public String getsName(){
        return sName;
    }
    public String getsSex(){
        return sSex;
    }
    public int getsJava(){
        return sJava;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Student stu1=new Student(sc.nextInt(),sc.next(),sc.next(),sc.nextInt());
        Student stu2=new Student(sc.nextInt(),sc.next(),sc.next(),sc.nextInt());
        Student stu3=new Student(sc.nextInt(),sc.next(),sc.next(),sc.nextInt());
        Student stu4=new Student(sc.nextInt(),sc.next(),sc.next(),sc.nextInt());
        Student stu5=new Student(sc.nextInt(),sc.next(),sc.next(),sc.nextInt());
        System.out.println("姓名:"+stu1.getsName()+" Java成绩:"+stu1.getsJava());
        System.out.println("姓名:"+stu2.getsName()+" Java成绩:"+stu2.getsJava());
        System.out.println("姓名:"+stu3.getsName()+" Java成绩:"+stu3.getsJava());
        System.out.println("姓名:"+stu4.getsName()+" Java成绩:"+stu4.getsJava());
        System.out.println("姓名:"+stu5.getsName()+" Java成绩:"+stu5.getsJava());
        int sum=stu1.getsJava()+stu2.getsJava()+stu3.getsJava()+stu4.getsJava()+stu5.getsJava();
        System.out.println("平均分:"+sum/5.0);
        int[] data={stu1.getsJava(),stu2.getsJava(),stu3.getsJava(),stu4.getsJava(),stu5.getsJava()};
        Arrays.sort(data);
        System.out.println("最低分:"+data[0]);
        System.out.println("最高分:"+data[4]);
        
    }
}