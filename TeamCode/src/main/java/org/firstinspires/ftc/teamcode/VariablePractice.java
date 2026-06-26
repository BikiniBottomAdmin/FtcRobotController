package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@Disabled  //THIS CODE IS ALSO DISABLED!! IS A PRACTICE IN VARIABLES THAT IS SHOWN ON THE DISPLAY!!
@TeleOp
public class VariablePractice extends OpMode {
    @Override
    public void init() {
        //variables below
        int teamnumber = 36020;
        double motorSpeed = 0.75;
        boolean clawClosed = true;
        String name = "Bikini Bottom Robotics";
        int motorAngle = 90;

        //this is to show on the screen
        telemetry.addData("Team Number", teamnumber);
        telemetry.addData("Motor Speed", motorSpeed);
        telemetry.addData("Claw Closed", clawClosed);
        telemetry.addData("Team Name", name);
        telemetry.addData("Motor Angle", motorAngle);
    }

    @Override
    public void loop() {

    }
}
