package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.Classes.IndexerServos;
import org.firstinspires.ftc.teamcode.Classes.RobotDrive;
@TeleOp
public class FieldOrientatedOpMode extends OpMode {
    IndexerServos flipper = new IndexerServos();
    RobotDrive drive = new RobotDrive();
    double forward, strafe, rotate ;

    @Override
    public void init() {
        drive.init(hardwareMap);
        flipper.init(hardwareMap);
    }

    @Override
    public void loop() {
        forward = -gamepad1.left_stick_y;
        strafe = gamepad1.left_stick_x;
        rotate = gamepad1.right_stick_x;

        if (gamepad2.a) {
            flipper.setFlipper_1(0.55);
        }
        else {
            flipper.setFlipper_1(0.6);
        }

        drive.driveFieldRelative(forward,strafe,rotate);
    }
}
