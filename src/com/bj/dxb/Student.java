package com.bj.dxb;

public class Student {
    /**
     * 学生ID
     */
    private int id;
    /**
     * 学生姓名
     */
    private String name;
    /**
     * 学生年龄
     */
    private String age;
    /**
     * 学生性别
     */
    private String sex;
    /**
     * 学生电话号码
     */
    private String telNum;
    /**
     * 学生地址
     */
    private String address;
    /**
     * 学生成绩
     */
    private double course;

    /**
     * 无参构造方法
     */
    public Student() {

    }

    /**
     * 有参构造函数
     * 
     * @param name
     * @param age
     * @param sex
     * @param telNum
     * @param address
     * @param course
     */
    public Student(String name, String age, String sex, String telNum,
            String address, double course) {
        super();
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.telNum = telNum;
        this.address = address;
        this.course = course;
    }

    /**
     * 获取学生ID
     * 
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     * 设置学生ID
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 获取学生姓名
     * 
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * 设置学生姓名
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取学生年龄
     * 
     * @return
     */
    public String getAge() {
        return age;
    }

    /**
     * 设置学生年龄
     * 
     * @param age
     */
    public void setAge(String age) {
        this.age = age;
    }

    /**
     * 获取学生性别
     * 
     * @return
     */
    public String getSex() {
        return sex;
    }

    /**
     * 设置学生性别
     * 
     * @param sex
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * 获取学生电话
     * 
     * @return
     */
    public String getTelNum() {
        return telNum;
    }

    /**
     * 设置学生电话
     * 
     * @param telNum
     */
    public void setTelNum(String telNum) {
        this.telNum = telNum;
    }

    /**
     * 获取学生地址
     * 
     * @return
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置学生地址
     * 
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取学生成绩
     * 
     * @return
     */
    public double getCourse() {
        return course;
    }

    /**
     * 设置学生成绩
     * 
     * @param course
     */
    public void setCourse(double course) {
        this.course = course;
    }

    /**
     * toString()方法
     */
    @Override
    public String toString() {
        return "# " + "姓名 " + name + "\t年龄 " + age + "\t性别 " + sex + "\t电话号码 "
                + telNum + "\t住址 " + address + "\t成绩 " + course;
    }
}

