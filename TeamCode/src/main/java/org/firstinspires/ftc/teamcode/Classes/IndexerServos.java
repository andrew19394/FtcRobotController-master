package org.firstinspires.ftc.teamcode.Classes;

import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class IndexerServos {
    private Servo flipper_1;

    public void init(HardwareMap hwMap) {
        flipper_1 = hwMap.get(Servo.class,"flipper_1");
    }

    public void setFlipper_1(double angle) {
        flipper_1.setPosition(angle);
    }
}
