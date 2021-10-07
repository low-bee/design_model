package com.xl.design.create.factory;

/**
 * @Description: Square 实现了 Shape 接口
 * @Author xiaolong
 * @Date 2021/10/7 5:43 下午
 */
public class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
