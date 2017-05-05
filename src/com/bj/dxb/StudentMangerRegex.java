package com.bj.dxb;

import java.util.Scanner;

/**
 * 用户输入验证类
 */
public class StudentMangerRegex {
    /**
     * 对用户输入的用户名进行校验
     * 
     * @return
     */
    public String userNameRegex() {
        Scanner scanner = new Scanner(System.in);
        String regex = "[a-zA-Z]{1,10}";
        while (true) {
            System.out.println("输入用户名：1-10位字母");
            String inputStr = scanner.nextLine();
            if (inputStr.matches(regex)) {
                return inputStr;
            } else {
                System.out.println("输入用户名错误，请检查");
            }
        }
    }

    /**
     * 对用户输入的密码进行校验
     * 
     * @return
     */
    public String userpwdRegex() {
        Scanner scanner = new Scanner(System.in);
        String regex = "[a-zA-Z]{1,10}";
        while (true) {
            System.out.println("输入密码：1-10位字母");
            String inputStr = scanner.nextLine();
            if (inputStr.matches(regex)) {
                return inputStr;
            } else {
                System.out.println("输入密码错误，请检查");
            }
        }
    }

    /**
     * 对菜单输入选项的验证
     * 
     * @param min
     * @param max
     * @return
     */
    public int menuRegex(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        String regex = "[" + min + "-" + max + "]{1}";
        int i = 0;
        while (true) {
            System.out.println("请输入正确的数字，最小是: " + min + " 最大是: " + max);
            String inputStr = scanner.nextLine();
            if (inputStr.matches(regex)) {
                i = Integer.parseInt(inputStr);
                return i;
            } else {
                System.out.println("输入数字错误，请检查");
            }
        }
    }

    /**
     * 对用户输入姓名的验证
     * 
     * @return
     */
    public String nameRegex() {
        Scanner scanner = new Scanner(System.in);
        String regex = "[a-zA-Z]{1,10}";
        while (true) {
            System.out.println("输入姓名：1-10位字母");
            String inputStr = scanner.nextLine();
            if (inputStr.matches(regex)) {
                return inputStr;
            } else {
                System.out.println("输入姓名错误，请检查");
            }
        }
    }

    /**
     * 对用户输入年龄的验证
     * 
     * @return
     */
    public String ageRegex() {
        Scanner scanner = new Scanner(System.in);
        String regex = "[1-9]|[1-9]\\d|1[0-2]\\d";
        while (true) {
            System.out.println("输入年龄：1-100+");
            String inputStr = scanner.nextLine();
            if (inputStr.matches(regex)) {
                return inputStr;
            } else {
                System.out.println("输入年龄错误，请检查");
            }
        }
    }

    /**
     * 对用户输入性别的验证
     * 
     * @return
     */
    public String sexRegex() {
        Scanner scanner = new Scanner(System.in);
        String regex = "[mMfF]{1}";
        while (true) {
            System.out.println("输入性别，(男 m or M) (女 f or F)");
            String inputStr = scanner.nextLine();
            if (inputStr.matches(regex)) {
                return inputStr;
            } else {
                System.out.println("输入性别错误，请检查");
            }
        }
    }

    /**
     * 对用户输入电话号码的验证
     * 
     * @return
     */
    public String telNumRegex() {
        Scanner scanner = new Scanner(System.in);
        String regex = "\\d{6,11}";
        while (true) {
            System.out.println("输入电话号码，6-11位数字");
            String inputStr = scanner.nextLine();
            if (inputStr.matches(regex)) {
                return inputStr;
            } else {
                System.out.println("输入电话号码错误，请检查");
            }
        }
    }

    /**
     * 对用户输入地址的验证
     * 
     * @return
     */
    public String addressRegex() {
        Scanner scanner = new Scanner(System.in);
        String regex = "[a-zA-z0-9]{1,50}";
        while (true) {
            System.out.println("输入地址，1-50位字母或数字");
            String inputStr = scanner.nextLine();
            if (inputStr.matches(regex)) {
                return inputStr;
            } else {
                System.out.println("输入地址错误，请检查");
            }
        }
    }

    /**
     * 对用户输入的成绩进行校验
     */
    public double courseRegex() {
        Scanner scanner = new Scanner(System.in);
        String regex = "[0-9]{1,3}";
        while (true) {
            System.out.println("输入成绩，1-3位数字");
            String inputStr = scanner.nextLine();
            if (inputStr.matches(regex)) {
                double course = Double.parseDouble(inputStr);
                return course;
            } else {
                System.out.println("输入成绩错误，请检查");
            }
        }
    }
}

