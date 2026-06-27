package org.firstinspires.ftc.teamcode;

public class RobotLocationPractice {
    double angle;

    //constructor method
    public RobotLocationPractice (double angle) {
        this.angle = angle;
    }

    public  double getHeading () {
        //this method normalizes robot heading between -180 & 180
        // this is useful for calculating turn angles, especially when crossing the 0,360 boundary


        double angle = this.angle; // copy the angle of imu
        while (angle > 180) {
            angle -= 360; // subtract until in target range
        }
        while (angle <= -180) {
            angle += 360; // return normalize value
        }
        return angle;
    }

    public void turnRobot (double angleChange) {
        angle += angleChange;
    }
    public void setAngle (double angle) {
        this.angle = angle;
    }

    public double getAngle () {
        return this.angle;
    }
}
