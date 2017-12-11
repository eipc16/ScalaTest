package JavaPackage;

import ScalaPackage.MyPoint;
import ScalaPackage.TestClass;

/**
 * Created by epicm on 08.12.2017.
 */
public class Main {
    public static void main(String args[]){
        MyPoint p = new MyPoint(5242, 5);
        JavaTestClass j = new JavaTestClass(1, 5);
        TestClass scalaTest = new TestClass(5, 51.2);

        Debug.fields(p);
        System.out.println();
        //Debug.fields(j);
        //System.out.println();
        Debug.fields(scalaTest);
        System.out.println();
    }
}
