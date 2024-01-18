package exe_moveablePoint;

public class MoveablePoint extends Point {
    private float xSpeed = 0f;
    private float ySpeed = 0f;

    public MoveablePoint() {
        super();
    }

    public MoveablePoint(float xSpeed, float ySpeed) {
        super();
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        float[] xySpeed = {xSpeed, ySpeed};
        return xySpeed;
    }

    @Override
    public String toString() {
        return "\"(" + getX() + ", " + getY() + "), speed = (" + getxSpeed() + ", " + getySpeed() + ")\"";
    }

    public MoveablePoint move() {
        setX(getX() + xSpeed);
        setY(getY() + ySpeed);
        return this;
    }
}
