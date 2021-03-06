package com.github.hcsp.calculation;

public class Main {
    /**
     * 输入学生姓名和分数，当： 90<=score<=100分时，返回"学生X的分数是Y，评级是A"；
     *
     * <p>60<=score<=89时，返回"学生X的分数是Y，评级是B"；
     *
     * <p>0<=score<=59时，返回"学生X的分数是Y，评级是C"；
     *
     * <p>score为其他值时，返回"非法输入"。
     *
     * @param student 学生的姓名
     * @param score   学生的分数
     * @return 结果字符串
     */
    public static String formatStudentScore(String student, int score) {
        if (90 <= score && score <= 100) {
            String str = "学生" + student + "的分数是" + score + "，评级是A";
            return str;
        } else if (60 <= score && score <= 89) {
            String str = "学生" + student + "的分数是" + score + "，评级是B";
            return str;
        } else if (0 <= score && score <= 59) {
            String str = "学生" + student + "的分数是" + score + "，评级是C";
            return str;
        } else {
            String str = "非法输入";
            return str;
        }
    }

    public static void main(String[] args) {
        System.out.println(formatStudentScore("张三", -1));
        System.out.println(formatStudentScore("张三", 0));
        System.out.println(formatStudentScore("张三", 60));
        System.out.println(formatStudentScore("张三", 900));
    }
}
