package com.bj.dxb;

/**
 * 程序启动入口类
 * 
 * @author void
 * 
 */
public class App {
    public static void main(String[] args) {
        System.out.println("****此版本版权归void所有****");
        App app = new App();
        app.start();
    }

    /**
     * 主菜单控制
     */
    public void start() {
        StudentMangerRegex studentMangerRegex = new StudentMangerRegex();
        Operate operate = new Operate();
        while (true) {
            if (operate.login()) {
                while (true) {
                    Menu.getInstance().mainMenu();
                    int key = studentMangerRegex.menuRegex(1, 6);
                    switch (key) {
                    case 1:
                        operate.addLogic();
                        break;
                    case 2:
                        operate.searchLogic();
                        break;
                    case 3:
                        operate.modifyLogicLogic();
                        break;
                    case 4:
                        operate.deleteLogic();
                        break;
                    case 5:
                        operate.orderLogic();
                        break;
                    case 6:
                        System.exit(0);
                        break;
                    }
                }
            }
        }
    }
}

