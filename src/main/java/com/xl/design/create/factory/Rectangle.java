package com.xl.design.create.factory;

/**
 * @Description: Rectangle 实现了 Shape 接口
 * @Author xiaolong
 * @Date 2021/10/7 5:42 下午
 */
public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
