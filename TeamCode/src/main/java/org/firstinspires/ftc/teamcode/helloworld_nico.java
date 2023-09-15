package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class Exercises_4_6_Henry extends OpMode {
    @Override
    public void init() {
    }

    @Override
    public void loop(){

        telemetry.addData("Left Stick x", gamepad1.left_stick_x);
        telemetry.addData("Left stick y", gamepad1.left_stick_y);

        double fwdSpeed = gamepad1.left_stick_y;
        double ySpeed = gamepad1.left_stick_y;
        double xSpeed = gamepad1.left_stick_x;

        if (gamepad1.a) { //turbo
            fwdSpeed *= 0.5;
        }
        if (!gamepad1.a) { //turbo
            fwdSpeed *= 1;
        }

        if (!gamepad1.a) { //crazy mode
            ySpeed = gamepad1.left_stick_x;
            xSpeed = gamepad1.left_stick_y;
        }
    }
}