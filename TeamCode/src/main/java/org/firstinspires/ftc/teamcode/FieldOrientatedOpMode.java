package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.Classes.IndexerServos;
import org.firstinspires.ftc.teamcode.Classes.Intake;
import org.firstinspires.ftc.teamcode.Classes.RobotDrive;
@TeleOp
public class FieldOrientatedOpMode extends OpMode {
    IndexerServos flipper = new IndexerServos();
    RobotDrive drive = new RobotDrive();
    Intake intake = new Intake();

    double forward, strafe, rotate ;

    @Override
    public void init() {
        drive.init(hardwareMap);
        flipper.init(hardwareMap);
        intake.init(hardwareMap);
    }

    @Override
    public void loop() {
        forward = -gamepad1.left_stick_y;
        strafe = gamepad1.left_stick_x;
        rotate = gamepad1.right_stick_x;

            //Flipper 1 code
            if (gamepad2.dpad_up) {
                flipper.setFlipper_1(0.55);
            }
            else {
                flipper.setFlipper_1(0.6);
            }

            //Flipper 2 code
            if (gamepad2.dpad_left) {
                flipper.setFlipper_2(0.55);
            }
            else {
                flipper.setFlipper_2(0.6);
            }

            //Flipper 3 code
            if (gamepad2.dpad_right) {
                flipper.setFlipper_3(0.55);
            }
            else {
                flipper.setFlipper_3(0.6);
            }

            //Moves all 3 flippers
            if (gamepad2.dpad_down) {
                flipper.setFlipper_1(0.55);
                flipper.setFlipper_2(0.55);
                flipper.setFlipper_3(0.55);
            }
            else {
                flipper.setFlipper_1(0.6);
                flipper.setFlipper_2(0.6);
                flipper.setFlipper_3(0.6);
            }

        //Intakes they are tied together for simplicity
        if (gamepad2.a) {
            intake.intake(0.5, 0.5);
        }
        else {
            intake.intake(0.0, 0.0);
        }


        drive.driveFieldRelative(forward,strafe,rotate);
    }
}
