package point_2d_3d;

public class Point3D extends Point2D {
    private float z = 0;

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        super.setXY(x, y);
        this.z = z;
    }

    public float[] getXYZ() {
        float[] xyz = {getX(), getY(), z};
        return xyz;
    }

    @Override
    public String toString() {
        return "\"(" + getX() + ", " + getY() + ", " + getZ() + ")\"";
    }
}
