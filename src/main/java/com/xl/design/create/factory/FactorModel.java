package com.xl.design.create.factory;

/**
 * @Description: 工厂模式代码实现
 * @Author xiaolong
 * @Date 2021/10/7 5:38 下午
 */
public class FactorModel {

    // 我们将实现一个接口，然后这个接口会有三个实现，然后在工厂方法中调用子类
    public static Shape getShape(Class clazz) throws InstantiationException, IllegalAccessException {
        return (Shape) clazz.newInstance();
    }

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        System.out.println(FactorModel.getShape(Circle.class));
    }
}
