package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@Disabled //THIS CODE IS DISABLED!!! THIS CODE WILL NOT SHOW UP ON THE ROBOT CONTROLLER!!
@TeleOp
public class HelloWorld extends OpMode {

    @Override
    public void init() {
        telemetry.addData("Hello","Team"); //shows "Hello Team" on the display
    }

    @Override
    public void loop() {

    }
}
