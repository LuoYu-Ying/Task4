package Task4_2_1;

import java.util.Scanner;

public class ScreenShow {
    public static int showOptions() {
        System.out.println("-------------------------------------");
        System.out.println("| 可执行以下操作:                       |");
        System.out.println("| (1)  添加一名新学生                   |");
        System.out.println("| (2)  添加一名已有学生的新成绩           |");
        System.out.println("| (3)  修改一名学生的单科成绩             |");
        System.out.println("| (4)  删除一名学生所有成绩              |");
        System.out.println("| (5)  删除一名学生单科成绩              |");
        System.out.println("| (6)  查询所有学生所有成绩              |");
        System.out.println("| (7)  查询所有学生单科成绩              |");
        System.out.println("| (8)  查询一名学生所有成绩              |");
        System.out.println("| (9)  查询一名学生单科成绩              |");
        System.out.println("| (10) 查询单科最高分                   |");
        System.out.println("| (11) 查询单科最低分                   |");
        System.out.println("| (0)  退出                           |");
        System.out.println("=====================================");
        System.out.println("请输入执行操作的序号：                   ");

        Scanner in = new Scanner(System.in);
        int opt = in.nextInt();
        return opt;
    }

    public static void showCLS() {
        for(int i = 1; i <= 50; i++) {
            System.out.println("");
        }
    }
}
