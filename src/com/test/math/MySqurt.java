package com.test.math;

/**
 * 实现一个开平根的函数mysqrrt(double x, double y),要求返回值和x的真正的平方根的差距不能大于y。例如，x=9，y=1，那么x真正的
 * 平方根是3，所以返回值必须在范围2到4之间。另外程序中不能使用任何内置的开方函数。
 * @ClassName: MySqurt
 */
public class MySqurt {

    public static void main(String[] args) {
        System.out.println(mysqurt(10, 1));
    }

    /**
     * 
     * @Title: 		 mysqurt   
     * @Description: TODO 牛顿逐步逼近法，如果对x的平方根有一个猜测y，可以通过y和x/y的平均值不断迭代逼近近似值 
     * @param x
     * @param y
     * @return   
     * @throws
     */
    public static double mysqurt(double x, double y) {
        double result = 0;
        double guess = 1.0;
        do {
            result = (guess + x / guess) / 2;
            guess = result;
        } while (Math.abs(result * result - x) > y);
        return result;
    }
}
