package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "helloworld_nico")
public class helloworld_nico extends OpMode {
    @Override
    public void init() {
        telemetry.addData("Hello", "World");
    }
        @Override
        public void loop() {
    }


}