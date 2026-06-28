package org.firstinspires.ftc.teamcode.mechanisms;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class TestBench {
    private DcMotor motor0;

    public void init (HardwareMap hwMap) {

        motor0 = hwMap.get(DcMotor.class, "m0");
        motor0.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
    }

    public void setMotorSpeed(double speed) {
        motor0.setPower(speed);
    }
}
