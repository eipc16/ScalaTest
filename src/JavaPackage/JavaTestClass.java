package JavaPackage;

import ScalaPackage.MyPoint;

class JavaTestClass {
    private int x;
    private int y;
    private String z;
    private MyPoint test;

    JavaTestClass(int x, int y){
        this.x = x;
        this.y = y;
        z = "testClass";
        test = new MyPoint(x, y);
    }
}
