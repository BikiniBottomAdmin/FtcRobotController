package org.firstinspires.ftc.teamcode.mechanisms;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class TestBench {
    private DcMotor motor0;
    private double ticksPerRev; //revolution

    public void init (HardwareMap hwMap) {
        // DC motor
        motor0 = hwMap.get(DcMotor.class, "m0");
        motor0.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        ticksPerRev = motor0.getMotorType().getTicksPerRev();
        motor0.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        motor0.setDirection(DcMotorSimple.Direction.REVERSE);
    }

    public void setMotorSpeed(double speed) {
        motor0.setPower(speed);
    }

    public double getMotorRevs () {
        return motor0.getCurrentPosition() / ticksPerRev; //normalizing ticks to revolution
    }

    public void setMotorZeroBehavior(DcMotor.ZeroPowerBehavior zeroBehavior){
        motor0.setZeroPowerBehavior(zeroBehavior);
    }
}
