package JavaPackage;

import ScalaPackage.MyPoint;

/**
 * Created by epicm on 08.12.2017.
 */
public class Main {
    public static void main(String args[]){
        MyPoint p = new MyPoint(5, 5);
        Debug.fields(p);
    }
}
