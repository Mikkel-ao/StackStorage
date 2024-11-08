package dk.cphbusiness;
import org.abstractica.javacsg.Geometry3D;
import org.abstractica.javacsg.JavaCSG;
import org.abstractica.javacsg.JavaCSGFactory;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        JavaCSG csg = JavaCSGFactory.createNoCaching();
        Geometry3D cyl = csg.cylinder3D(10, 20, 32, true);

        csg.view(cyl);
    }
}