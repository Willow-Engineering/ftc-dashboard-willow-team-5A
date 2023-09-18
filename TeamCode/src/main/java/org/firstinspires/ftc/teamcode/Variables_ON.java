package org.firstinspires.ftc.teamcode;

import com.acmerobotics.dashboard.FtcDashboard;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.acmerobotics.dashboard.config.Config;
import com.acmerobotics.dashboard.telemetry.MultipleTelemetry;


@TeleOp()
public class Variables_ON extends OpMode {
    FtcDashboard dashboard = FtcDashboard.getInstance();
    telemetry = new MultipleTelemetry(telemetry, dashboard.getTelemetry());
@Override
public void init() {
        int teamNumber = 16072;
        double motorSpeed = 0.5;
        boolean touchSensorPressed = true;

        telemetry.addData("Team Number", teamNumber);
        telemetry.addData("Motor Speed", motorSpeed);
        telemetry.addData("Touch Sensor", touchSensorPressed);
}

    @Override
    public void loop() {

}
 }