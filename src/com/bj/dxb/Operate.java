package com.bj.dxb;

import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;

public class Operate {
    private Vector<Student> vector = new Vector<Student>();
    private int id = 1;

    /**
     * 对用户名和密码的校验
     * 
     * @return
     */
    public boolean login() {
        StudentMangerRegex studentMangerRegex = new StudentMangerRegex();
        String userName = studentMangerRegex.userNameRegex();
        String password = studentMangerRegex.userpwdRegex();
        if (userName.equals(password)) {
            System.out.println("你输入的用户名和密码正确，欢迎'".concat(userName).concat(
                    "'使用本系统！"));
            return true;
        } else {
            System.out.println("你输入的用户名和密码不正确，请重新输入！");
            return false;
        }
    }

    /**
     * 添加学生信息业务逻辑控制
     */
    public void addLogic() {
        StudentMangerRegex studentMangerRegex = new StudentMangerRegex();
        while (true) {
            Menu.getInstance().addMenu();
            int key = studentMangerRegex.menuRegex(1, 3);
            switch (key) {
            case 1:
                addOperation();
                break;
            case 2:
                showAll();
                break;
            case 3:
                return;
            }
        }
    }

    /**
     * 学生信息查询业务逻辑控制
     */
    public void searchLogic() {
        StudentMangerRegex studentMangerRegex = new StudentMangerRegex();
        int size = vector.size();
        if (size == 0) {
            System.out.println("学生管理系统没有信息，请先添加信息后再操作！");
        } else {
            while (true) {
                Menu.getInstance().searchMenu();
                int key = studentMangerRegex.menuRegex(1, 8);
                switch (key) {
                case 1:
                    searchByName();
                    break;
                case 2:
                    searchByAge();
                    break;
                case 3:
                    searchBySex();
                    break;
                case 4:
                    searchByTelNum();
                    break;
                case 5:
                    searchByAdd();
                    break;
                case 6:
                    searchByCourse();
                    break;
                case 7:
                    showAll();
                    break;
                case 8:
                    return;
                }
            }
        }
    }

    /**
     * 学生信息修改业务逻辑控制
     */
    public void modifyLogicLogic() {
        StudentMangerRegex studentMangerRegex = new StudentMangerRegex();
        int size = vector.size();
        if (size == 0) {
            System.out.println("学生管理系统没有信息，请先添加信息后再操作！");
        } else {
            while (true) {
                Menu.getInstance().modifyMenu();
                int key = studentMangerRegex.menuRegex(1, 3);
                switch (key) {
                case 1:
                    showAll();
                    break;
                case 2:
                    modify();
                    break;
                case 3:
                    return;
                }
            }
        }
    }

    /**
     * 学生信息删除业务逻辑控制
     */
    public void deleteLogic() {
        StudentMangerRegex studentMangerRegex = new StudentMangerRegex();
        int size = vector.size();
        if (size == 0) {
            System.out.println("学生管理系统没有信息，请先添加信息后再操作！");
        } else {
            while (true) {
                Menu.getInstance().deleteMenu();
                int key = studentMangerRegex.menuRegex(1, 4);
                switch (key) {
                case 1:
                    showAll();
                    break;
                case 2:
                    delete();
                    break;
                case 3:
                    deleteAll();
                    break;
                case 4:
                    return;
                }
            }
        }
    }

    /**
     * 学生信息排序业务逻辑控制
     */
    public void orderLogic() {
        StudentMangerRegex studentMangerRegex = new StudentMangerRegex();
        int size = vector.size();
        if (size == 0) {
            System.out.println("学生管理系统没有信息，请先添加信息后再操作！");
        } else {
            while (true) {
                Menu.getInstance().orderMenu();
                int key = studentMangerRegex.menuRegex(1, 7);
                switch (key) {
                case 1:
                    orderName();
                    break;
                case 2:
                    orderAge();
                    break;
                case 3:
                    orderSex();
                    break;
                case 4:
                    orderId();
                    break;
                case 5:
                    orderCourse();
                    break;
                case 6:
                    showAll();
                    break;
                case 7:
                    return;
                }
            }
        }
    }

    /**
     * 添加学生信息
     */
    public void addOperation() {
        StudentMangerRegex studentMangerRegex = new StudentMangerRegex();
        String name = studentMangerRegex.nameRegex();
        String age = studentMangerRegex.ageRegex();
        String sex = studentMangerRegex.sexRegex();
        String telNum = studentMangerRegex.telNumRegex();
        String address = studentMangerRegex.addressRegex();
        double course = studentMangerRegex.courseRegex();
        Student student = new Student(name, age, sex, telNum, address, course);
        boolean tag = vector.add(student);
        if (tag) {
            id++;
            System.out.println("添加学生成功！请继续操作！！");
        } else {
            System.out.println("添加学生失败！");
        }
    }

    /**
     * 查询全部学生信息
     */
    public void showAll() {
        int i = 0;
        for (Student student : vector) {
            System.out.println("序号  " + (i + 1) + student.toString());
            i++;
        }
        if (i == 0) {
            System.out.println("没有任何记录");
        }
    }

    /**
     * 按照姓名查询学生信息
     */
    public void searchByName() {
        StudentMangerRegex studentMangerRegex = new StudentMangerRegex();
        String name = studentMangerRegex.nameRegex();
        int i = 0;
        for (Student student : vector) {
            if (name.equals(student.getName())) {
                System.out.println("序号  " + (i + 1) + student.toString());
                i++;
            }
        }
        if (i == 0) {
            System.out.println("没有此人记录");
        }
    }

    /**
     * 按照年龄查询学生信息
     */
    public void searchByAge() {
        StudentMangerRegex studentMangerRegex = new StudentMangerRegex();
        String age = studentMangerRegex.ageRegex();
        int i = 0;
        for (Student student : vector) {
            if (age.equals(student.getAge())) {
                System.out.println("序号  " + (i + 1) + student.toString());
                i++;
            }
        }
        if (i == 0) {
            System.out.println("没有此人记录");
        }
    }

    /**
     * 按照性别查询学生信息
     */
    public void searchBySex() {
        StudentMangerRegex studentMangerRegex = new StudentMangerRegex();
        String sex = studentMangerRegex.sexRegex();
        int i = 0;
        for (Student student : vector) {
            if (sex.equals(student.getSex())) {
                System.out.println("序号  " + (i + 1) + student.toString());
                i++;
            }
        }
        if (i == 0) {
            System.out.println("没有此人记录");
        }
    }

    /**
     * 按照电话号码查询学生信息
     */
    public void searchByTelNum() {
        StudentMangerRegex studentMangerRegex = new StudentMangerRegex();
        String telNum = studentMangerRegex.telNumRegex();
        int i = 0;
        for (Student student : vector) {
            if (telNum.equals(student.getTelNum())) {
                System.out.println("序号  " + (i + 1) + student.toString());
                i++;
            }
        }
        if (i == 0) {
            System.out.println("没有此人记录");
        }
    }

    /**
     * 按照地址查询学生信息
     */
    public void searchByAdd() {
        StudentMangerRegex studentMangerRegex = new StudentMangerRegex();
        String address = studentMangerRegex.addressRegex();
        int i = 0;
        for (Student student : vector) {
            if (address.equals(student.getAddress())) {
                System.out.println("序号  " + (i + 1) + student.toString());
                i++;
            }
        }
        if (i == 0) {
            System.out.println("没有此人记录");
        }
    }

    /**
     * 按照成绩查询学生信息
     */
    public void searchByCourse() {
        StudentMangerRegex studentMangerRegex = new StudentMangerRegex();
        double course = studentMangerRegex.courseRegex();
        int i = 0;
        for (Student student : vector) {
            if (course == student.getCourse()) {
                System.out.println("序号  " + (i + 1) + student.toString());
                i++;
            }
        }
        if (i == 0) {
            System.out.println("没有此人记录");
        }
    }

    /**
     * 修改指定记录信息
     */
    public void modify() {
        StudentMangerRegex studentMangerRegex = new StudentMangerRegex();
        int size = vector.size();
        if (size == 0) {
            System.out.println("学生管理系统没有信息，请先添加信息后再操作！");
        } else {
            System.out.println("请输入记录序号");
            int num = studentMangerRegex.menuRegex(1, size);
            while (true) {
                Menu.getInstance().subModifyMenu();
                int key = studentMangerRegex.menuRegex(1, 7);
                switch (key) {
                case 1:
                    String name = studentMangerRegex.nameRegex();
                    vector.get(num - 1).setName(name);
                    System.out.println("修改成功！请继续操作！！");
                    break;
                case 2:
                    String age = studentMangerRegex.ageRegex();
                    vector.get(num - 1).setAge(age);
                    System.out.println("修改成功！请继续操作！！");
                    break;
                case 3:
                    String sex = studentMangerRegex.sexRegex();
                    vector.get(num - 1).setSex(sex);
                    System.out.println("修改成功！请继续操作！！");
                    break;
                case 4:
                    String telNum = studentMangerRegex.telNumRegex();
                    vector.get(num - 1).setTelNum(telNum);
                    System.out.println("修改成功！请继续操作！！");
                    break;
                case 5:
                    String address = studentMangerRegex.addressRegex();
                    vector.get(num - 1).setAddress(address);
                    System.out.println("修改成功！请继续操作！！");
                    break;
                case 6:
                    double course = studentMangerRegex.courseRegex();
                    vector.get(num - 1).setCourse(course);
                    System.out.println("修改成功！请继续操作！！");
                    break;
                case 7:
                    return;
                }
            }
        }
    }

    /**
     * 删除指定学生记录
     */
    public void delete() {
        StudentMangerRegex studentMangerRegex = new StudentMangerRegex();
        if (vector.size() == 0) {
            System.out.println("学生管理系统内容已清空，请继续操作！");
        } else {
            System.out.println("请输入记录序号");
            int num = studentMangerRegex.menuRegex(1, vector.size());
            vector.remove(num - 1);
            System.out.println("删除成功！请继续操作！！");
        }
    }

    /**
     * 删除全部学生记录
     */
    public void deleteAll() {
        if (vector.size() == 0) {
            System.out.println("学生管理系统内容已清空，请继续操作！");
        } else {
            boolean tag = vector.removeAll(vector);
            if (tag) {
                System.out.println("学生管理系统内容已清空，请继续操作！");
            }
        }
    }

    /**
     * 按学生姓名排序信息
     */
    public void orderName() {
        Collections.sort(vector, new OrderByName());
        System.out.println("排序完成！");
    }

    /**
     * 按学生年龄排序信息
     */
    public void orderAge() {
        Collections.sort(vector, new OrderByAge());
        System.out.println("排序完成！");
    }

    /**
     * 按学生性别排序信息
     */
    public void orderSex() {
        Collections.sort(vector, new OrderBySex());
        System.out.println("排序完成！");
    }

    /**
     * 按学生成绩排序信息
     */
    public void orderCourse() {
        Collections.sort(vector, new OrderByCourse());
        System.out.println("排序完成！");
    }

    /**
     * 按学生原始位置排序信息
     */
    public void orderId() {
        Collections.sort(vector, new OrderById());
        System.out.println("排序完成！");
    }

    /**
     * 按学生姓名排序内部类
     */
    class OrderByName implements Comparator<Student> {
        @Override
        public int compare(Student p1, Student p2) {
            return p1.getName().compareTo(p2.getName());
        }
    }

    /**
     * 按学生年龄排序内部类
     */
    class OrderByAge implements Comparator<Student> {
        @Override
        public int compare(Student p1, Student p2) {
            int age1 = Integer.parseInt(p1.getAge());
            int age2 = Integer.parseInt(p2.getAge());
            return age1 - age2;
        }
    }

    /**
     * 按学生性别排序内部类
     */
    class OrderBySex implements Comparator<Student> {
        @Override
        public int compare(Student p1, Student p2) {
            return p1.getSex().compareTo(p2.getSex());
        }
    }

    /**
     * 按学生成绩排序内部类
     */
    class OrderByCourse implements Comparator<Student> {
        @Override
        public int compare(Student p1, Student p2) {
            if (p1.getCourse() - p2.getCourse() > 0) {
                return -1;
            } else if (p1.getCourse() - p2.getCourse() == 0) {
                return 0;
            } else {
                return 1;
            }
        }
    }

    /**
     * 按学生原始顺序排序内部类
     */
    class OrderById implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            int id1 = o1.getId();
            int id2 = o2.getId();
            return id1 - id2;
        }
    }
}

